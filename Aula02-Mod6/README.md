# Utilizando as interfaces funcionais do pacote **java.util.function**.

# 1. Predicate< T >:
Aceita um argumento e retorna um booleano.
```java
    Predicate<Integer> ePar = numero -> numero % 2 == 0;
        
    System.out.println(ePar.test(4)); // true
    System.out.println(ePar.test(7)); // false
```

# 2. Function<T, R>:
Aceita um argumento de um tipo e retorna um resultado de outro tipo.
```java
     Function<String, Integer> funcaoTamanho = texto -> texto.length();
        
     System.out.println(funcaoTamanho.apply("Eucurso")); // 7
```
# 3. Supplier< T >:
Não aceita argumentos, mas fornece um resultado.
```java
    Supplier<String> fornecedorSaudacao = () -> "Olá, Mundo!";
        
    System.out.println(fornecedorSaudacao.get()); // Olá, Mundo!
```
# 4. Consumer< T >:
Aceita um argumento e não retorna nenhum resultado.
```java
    Consumer<String> consumidorImpressao = texto -> System.out.println(texto);
        
    consumidorImpressao.accept("Expressões Lambda em Java!"); // Imprime: Expressões Lambda em Java
```
# 5. BinaryOperator< T >:
Aceita dois argumentos do mesmo tipo e retorna um resultado do mesmo tipo.
```java
    BinaryOperator<Integer> operadorSoma = (numero1, numero2) -> numero1 + numero2;
        
    System.out.println(operadorSoma.apply(5, 7)); // 12
```

# Exercicio
1. Dado uma lista de números inteiros, crie um Predicate para verificar se um número é par. Utilize esse predicado para filtrar todos os números pares da lista e imprimir o resultado.:
    ```java
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    ```
    Saida Exemplo: 
    ```unix
    2, 4, 6, 8, 10
    ```
    
2. Dado uma lista de palavras, crie uma Function que transforme cada palavra em seu comprimento (quantidade de caracteres). Utilize essa função para converter a lista de palavras em uma lista de inteiros representando o tamanho de cada palavra e imprima o resultado.
    ```java
    List<String> palavras = Arrays.asList("Java", "Lambda", "Interface", "Função");
    ```
    Saida Exemplo: 
    ```unix
    4, 6, 8, 6
    ```
3. Crie um Consumer que receba uma string e imprima a mensagem "Olá, [string]!". Utilize esse consumidor para saudar cada uma das seguintes pessoas: "Maria", "João", e "Lucas".
 Saida Exemplo: 
    ```unix
    Olá, Maria!
    Olá, João!
    Olá, Lucas!
    ```