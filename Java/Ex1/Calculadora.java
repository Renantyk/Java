public class Calculadora {
    public static double adicao(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    public static double divisao(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Erro: divisão por zero.");
            return 0;
        } else {
            return num1 / num2;
        }
    }
}
