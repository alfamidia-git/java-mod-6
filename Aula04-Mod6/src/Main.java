import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
    // Expressão Lambda
            Function<Integer, String> lambdaToString = i -> String.valueOf(i);

    // Método de Referência
            Function<Integer, String> methodReferenceToString = String::valueOf;


        List<String> palavras = Arrays.asList("maçã", "banana", "acerola");

        // Expressão Lambda
//        palavras.forEach(s -> System.out.println(s));

        // Método de Referência
//        palavras.forEach(System.out::println);


        String stringExemplo = "Hello";
        // Expressão Lambda
        Predicate<String> lambda = s -> stringExemplo.startsWith(s);

        // Método de Referência
        Predicate<String> methodReference = stringExemplo::startsWith;





        List<String> strings = Arrays.asList(1, 2, 10, 30, 50)
                .stream()
                .map(String::valueOf)
                .collect(Collectors.toList());


        Map<String, Integer> mapa = Stream.of("a", "bc", "def")
                .collect(Collectors.toMap(Function.identity(), v -> v.length()));
        // Resultado: {a=1, bc=2, def=3}[



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

        List<List<String>> listasAninhadas = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d", "e")
        );
        Stream<String> plano = listasAninhadas.stream().flatMap(List::stream);
        // Resultado: a, b, c, d, e

        System.out.println(plano.toList());


        Stream<String> unicos = Stream.of("a", "b", "a", "c", "b").distinct();

        System.out.println(unicos.toList());


        Stream<String> ordenado = Stream.of("banana", "acerola", "caju").sorted();
        // Resultado: acerola, banana, caju

        System.out.println(ordenado.toList());
    }

    public static class Pessoa{
        private String nome;
        private int idade;

        public Pessoa(String nome, int idade){
            this.idade = idade;
            this.nome = nome;
        }
        public String getNome(){
            return this.nome;
        }

        public int getIdade(){
            return this.idade;
        }

        @Override
        public String toString() {
            return this.getNome();
        }
    }
}