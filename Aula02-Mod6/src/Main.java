import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        BinaryOperator<String> operadorSoma = (numero1, numero2) -> numero1 + " - "+ numero2;

        System.out.println(operadorSoma.apply("Olá", "Mundo")); // 12
    }
}