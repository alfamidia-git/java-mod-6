
public class Main {
    public static void main(String[] args) {

        Calculadora soma = (a, b) -> a + b;
        Calculadora multiplca = (a, b) -> a * b;

        System.out.println(soma.operacao(5, 3));
        System.out.println(multiplca.operacao(5, 3));

    }
}