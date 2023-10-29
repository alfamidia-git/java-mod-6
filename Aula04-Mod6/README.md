# Métodos de referência e aprofundando-se em Streams em Java

# Métodos de referência
Os métodos de referência no Java 8 são uma maneira concisa e expressiva de representar um método como uma expressão lambda, permitindo que você o passe como um argumento para operações funcionais sem precisar escrever o corpo completo do método.
## Formas de Método de Referência
Há quatro formas principais de métodos de referência:

1. Referência a um método estático: usando o nome da classe e o nome do método, separados por ::.
    ```java
    // Expressão Lambda
    Function<Integer, String> lambdaToString = i -> String.valueOf(i);

    // Método de Referência
    Function<Integer, String> methodReferenceToString = String::valueOf;
    ```

2. Referência a um método de instância de um tipo de objeto arbitrário: muito comum em streams, onde você deseja operar no elemento do stream..
    ```java
        List<String> palavras = Arrays.asList("maçã", "banana", "acerola");

        // Expressão Lambda
        palavras.forEach(s -> System.out.println(s));

        // Método de Referência
        palavras.forEach(System.out::println);
    ```

3. Referência a um método de instância de um objeto particular: usando uma instância e o nome do método, separados por ::.
    ```java
        String stringExemplo = "Hello";
        // Expressão Lambda
        Predicate<String> lambda = s -> stringExemplo.startsWith(s);

        // Método de Referência
        Predicate<String> methodReference = stringExemplo::startsWith;
    ```

4. Referência a um método de instância de um objeto particular: usando uma instância e o nome do método, separados por ::.
    ```java
        // Expressão Lambda
        Function<String, Pessoa> lambdaConstructor = nome -> new Pessoa(nome);

        // Método de Referência
        Function<String, Pessoa> referenceConstructor = Pessoa::new;
    ```

## Por que usar Métodos de Referência? 
* **Concisão:** Os métodos de referência geralmente oferecem uma sintaxe mais concisa do que as expressões lambda equivalentes.
* **Clareza:** Em muitos casos, eles tornam o código mais legível, pois focam na operação (o método) em vez de como ela é realizada.
* **Reutilização:** Permitem reutilizar métodos existentes diretamente em contextos funcionais.

# Streams
Além das operações básicas de Stream em Java, existem outros métodos que fornecem funcionalidades mais avançadas e versáteis. Eles permitem manipulações de dados mais complexas e eficientes.


# 1 .collect(Collector)
Transforma o stream em uma estrutura de dados ou qualquer valor de agregação desejado. Ele é frequentemente utilizado com os coletores fornecidos na classe Collectors.

```java
    List<String> lista = Stream.of("a", "b", "c").collect(Collectors.toList());
    // Resultado: [a, b, c]
```


# 2 Collectors.toMap(Function<T, K>, Function<T, U>):
Este coletor agrupa elementos do stream por algum critério e retorna um mapa.

```java
    Map<String, Integer> mapa = Stream.of("a", "bc", "def")
    .collect(Collectors.toMap(Function.identity(), f -> f.length()));
    // Resultado: {a=1, bc=2, def=3}
```

# 3 Collectors.groupingBy(Function<T, K>):
Este coletor agrupa elementos do stream por algum critério e retorna um mapa.
```java
   List<Pessoa> pessoas = Arrays.asList(
    new Pessoa("João", 25),
    new Pessoa("Maria", 30),
    new Pessoa("Lucas", 25),
    new Pessoa("Ana", 30),
    new Pessoa("Pedro", 20)
    );

    Map<Integer, List<Pessoa>> pessoasPorIdade = pessoas.stream()
        .collect(Collectors.groupingBy(Pessoa::getIdade));

    // Resultado: 
    // {
    //     25=[João, Lucas],
    //     30=[Maria, Ana],
    //     20=[Pedro]
    // }

```

# 4 .flatMap(Function<T, Stream< R>>)
Transforma cada elemento do stream original em um stream de novos elementos.

```java
    List<List<String>> listasAninhadas = Arrays.asList(
    Arrays.asList("a", "b"),
    Arrays.asList("c", "d", "e")
);
Stream<String> plano = listasAninhadas.stream().flatMap(List::stream);
// Resultado: a, b, c, d, e
```
# 5 .distinct()
Retorna um stream com elementos únicos (de acordo com a implementação de equals de seus elementos).
```java
    Stream<String> unicos = Stream.of("a", "b", "a", "c", "b").distinct();
    // Resultado: a, b, c
```
# 6 .sorted():
Ordena os elementos do stream de acordo com a ordem natural ou de acordo com um Comparator fornecido.
```java
    Stream<String> ordenado = Stream.of("banana", "acerola", "caju").sorted();
    // Resultado: acerola, banana, caju
```

# Exercicio
1. Dada uma lista de nomes, crie um mapa onde a chave é o nome e o valor é o comprimento desse nome.

    ```java
    List<String> nomes = Arrays.asList("Ana", "Roberto", "Camila");
    ```
    Saida Exemplo: 
    ```unix
    {Ana=3, Roberto=7, Camila=6}
    ```
    
2. Dada uma lista de números, agrupe os números por paridade (ímpar e par).
    ```java
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
    ```
    Saida Exemplo: 
    ```unix
    {PAR=[2, 4, 6], ÍMPAR=[1, 3, 5]}
    ```
3. A partir de uma lista de palavras, retorne um stream de palavras únicas e em ordem alfabética.
    ```java
    List<String> repetidas = Arrays.asList("maçã", "banana", "maçã", "laranja", "banana");
    ```
    Saida Exemplo:
    ```unix
     banana, laranja, maçã
    ```