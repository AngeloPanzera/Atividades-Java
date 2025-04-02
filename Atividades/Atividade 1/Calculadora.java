public class Calculadora {

    public static double adicionar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Erro: Divisão por zero não é permitida.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("Soma: " + adicionar(10, 5));
        System.out.println("Subtração: " + subtrair(10, 5));
        System.out.println("Multiplicação: " + multiplicar(10, 5));
        try {
            System.out.println("Divisão: " + dividir(10, 5));
            System.out.println("Divisão por zero: " + dividir(10, 0)); // Testando erro
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
