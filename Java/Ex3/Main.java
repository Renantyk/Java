import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas contas deseja criar?");
        int numContas = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numContas; i++) {
            System.out.println("\nConta " + i + ":");

            System.out.println("Por favor, informe o número da conta:");
            int numeroConta = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Por favor, informe o nome do titular da conta:");
            String nomeTitular = scanner.nextLine();

            System.out.println("Por favor, informe o saldo inicial da conta:");
            float saldoInicial = scanner.nextFloat();
            scanner.nextLine();

            ContaBancaria novaConta = new ContaBancaria(numeroConta, nomeTitular, saldoInicial);

            System.out.println("Conta criada com sucesso. Informações da Conta:");
            novaConta.mostrarInfo();

            System.out.println("Saldo atual: R$" + novaConta.consultarSaldo());
        }

        scanner.close();
    }

}