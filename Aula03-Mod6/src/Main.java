import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Optional<Integer> soma = Stream.of(1, 2, 3, 4).reduce((a, b) -> a + b);

        System.out.println(soma.get());
    }
}