import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Calculadora!");
        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação desejada:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int operacao = scanner.nextInt();

        double resultado = 0;
        String operacaoString = "";

        switch (operacao) {
            case 1:
                resultado = Calculadora.adicao(num1, num2);
                operacaoString = "adição";
                break;
            case 2:
                resultado = Calculadora.subtracao(num1, num2);
                operacaoString = "subtração";
                break;
            case 3:
                resultado = Calculadora.multiplicacao(num1, num2);
                operacaoString = "multiplicação";
                break;
            case 4:
                resultado = Calculadora.divisao(num1, num2);
                operacaoString = "divisão";
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        System.out.println("O resultado da " + operacaoString + " é: " + resultado);

        scanner.close();
    }
}