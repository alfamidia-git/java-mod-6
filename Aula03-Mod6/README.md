# Trabalhando com Streams em Java

O Java 8 introduziu um novo conceito chamado Stream, que permite processar sequências de elementos (por exemplo, coleções) de forma funcional. Aqui está uma introdução aos métodos básicos mais comuns associados aos Streams.

# 1 stream()
Iniciar um stream a partir de uma coleção.

```java
    List<String> lista = Arrays.asList("a", "b", "c");
    Stream<String> stream = lista.stream();
```

# 2 .filter(Predicate<T>):
Filtra o stream de acordo com o predicado fornecido.
```java
    Stream<Integer> pares = Stream.of(1, 2, 3, 4).filter(num -> num % 2 == 0);
    // Resultado: 2, 4
```
# 3 .map(Function<T, R>)
Transforma os elementos do stream.
```java
   Stream<String> transformado = Stream.of("a", "b", "c").map(String::toUpperCase);
   // Resultado: A, B, C

```
# 4 .forEach(Consumer<T>)S:
Itera sobre cada elemento do stream.
```java
    Stream.of("a", "b", "c").forEach(letra -> System.out.println(letra));
```


# 5 .reduce(BinaryOperator<T>):
Reduz o stream para um único valor.

```java
    Optional<Integer> soma = Stream.of(1, 2, 3, 4).reduce((a, b) -> a + b);
    // Resultado: 10

```

# Exercicio
1. Utilize o método .filter() para filtrar todos os números ímpares de uma lista de inteiros e imprimir o resultado.

    ```java
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    ```
    Saida Exemplo: 
    ```unix
    1, 3, 5, 7, 9
    ```
    
2. Use o método .map() para transformar uma lista de palavras em sua forma maiúscula.
    ```java
    List<String> palavras = Arrays.asList("Java", "Lambda", "Interface", "Função");
    ```
    Saida Exemplo: 
    ```unix
    JAVA, LAMBDA, INTERFACE, FUNÇÃO
    ```
3. Aplique o método .forEach() para imprimir cada número de uma lista de inteiros.
    ```java
    List<Integer> inteiros = Arrays.asList(5, 10, 15, 20);
    ```
    Saida Exemplo:
    ```unix
        5
        10
        15
        20
    ```