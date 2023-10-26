# Interfaces funcionais
No mundo da programação funcional em Java, as interfaces funcionais desempenham um papel crucial. Introduzidas no Java 8, essas interfaces são a base para expressões lambda, que são uma das características mais marcantes desse lançamento. As expressões lambda permitem escrever instâncias de interfaces funcionais de uma maneira muito mais concisa e legível.

## O que é uma interface funcional?
Uma interface funcional é uma interface que tem exatamente um método abstrato. Pode ter múltiplos métodos padrão ou métodos estáticos. Devido ao seu design singular, a implementação pode ser fornecida por uma expressão lambda, método de referência ou construtor de referência.

### Anotação @FunctionalInterface
O Java fornece uma anotação especial, @FunctionalInterface, que é usada para indicar que uma interface deve ser uma interface funcional. Essa anotação é opcional, mas é uma boa prática usá-la para evitar adições acidentais de métodos abstratos nessa interface.

## Expressões Lambda
As expressões lambda, uma das características mais esperadas e discutidas da linguagem Java, foram introduzidas no Java 8. Elas trouxeram uma nova maneira de escrever funções de forma concisa e expressiva, permitindo uma escrita de código mais clara e eficiente, especialmente ao trabalhar com APIs de coleção.

### O que são Expressões Lambda?
Uma expressão lambda é uma função anônima (sem nome) que você pode usar para criar delegates ou tipos de referência. Uma característica notável das expressões lambda é que elas podem ser passadas como argumentos para métodos ou como código que pode ser executado em paralelo.

Em termos simples, é uma forma concisa de representar um método de interface funcional.

### Sintaxe:
```unix
(argumentos) -> { corpo da função }
```
* **Argumentos:** Uma expressão lambda pode ter zero, um ou vários argumentos.
* **Seta (->):**  Os argumentos e o corpo são separados por uma seta.
* **corpo:** Contém expressões e declarações para a função.

### Exemplos de Expressões Lambda:
1. Sem argumento e sem retorno:
```java
() -> System.out.println("Olá, Mundo!");
```
2. Com um único argumento (note que os parênteses são opcionais para um único argumento):
```java
s -> System.out.println(s);
```
3. Com múltiplos argumentos:
```java
(a, b) -> a + b;
```

## Criando nossa interface funcional
```java
@FunctionalInterface
public interface Calculadora {
    int operacao(int a, int b);
}

```

### Utilizando nossa interface funcional
```java
public class TesteCalculadora {
    public static void main(String[] args) {
        // Usando expressão lambda
        Calculadora soma = (a, b) -> a + b;
        Calculadora multiplicacao = (a, b) -> a * b;
        
        System.out.println(soma.operacao(5, 3));       // Output: 8
        System.out.println(multiplicacao.operacao(5, 3)); // Output: 15
    }
}
```

## Exemplos de interfaces funcionais
O Java 8 introduziu muitas interfaces funcionais integradas no pacote **java.util.function**. Alguns exemplos incluem:
1. **Predicate< T >:** Aceita um argumento e retorna um boolean. Método abstrato: test(T t)
2. **Function<T, R>:** Aceita um argumento e retorna um resultado. Método abstrato: apply(T t)
3. **Supplier< T >:** Não aceita argumentos, mas fornece um resultado. Método abstrato: get()
4. **Consumer< T >:** Aceita um argumento e não retorna nenhum resultado. Método abstrato: accept(T t)
5. **BinaryOperator< T >:** Aceita dois argumentos do mesmo tipo e retorna um resultado do mesmo tipo. Método abstrato: apply(T t1, T t2)

## Benefícios:
1. **Expressões Lambda:** Como mencionado, a principal motivação para interfaces funcionais é a possibilidade de usá-las com expressões lambda, tornando o código mais limpo e legível.
2. **Reuso:** A presença de interfaces funcionais evita a necessidade de criar várias interfaces single-purpose, pois as interfaces do java.util.function podem ser reutilizadas em várias situações.

# Exercicio
1. Crie uma Interface Funcional **StringOperation**:
    * A interface deve possuir um método abstrato chamado execute que aceita duas strings e retorna uma string.
2. Crie uma classe **StringManipulator**:
    * Dentro da classe, utilize a interface funcional StringOperation para criar expressões lambda que:
        a) Concatenam duas strings.
        b) Retornam a primeira string sem alterações, ignorando a segunda.
    * Teste suas expressões lambda no método principal (main).
