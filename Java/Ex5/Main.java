import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos carros deseja adicionar?");
        int numCarros = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= numCarros; i++){
            System.out.println("\nCarro: " + i + ":");

            System.out.println("Marca do carro: ");
            String marca = scanner.nextLine();

            System.out.println("Modelo do carro: ");
            String modelo = scanner.nextLine();

            System.out.println("Ano do carro: ");
            int ano = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Placa do carro: ");
            String placa = scanner.nextLine();

            System.out.println("Velocidade do carro: ");
            int velocidadeCarro = scanner.nextInt();
            scanner.nextLine();

            Carro carro = new Carro(marca, modelo, ano, placa, velocidadeCarro);

            System.out.println("Infos do carro" + i + ":");
            carro.exibirInformacoes();
            
            System.out.println("Acelerando o carro" + i + ":");
            carro.acelerar();
            carro.exibirInformacoes();
            
            System.out.println("Freiando o carro" + i + ":");
            carro.frear();
            carro.exibirInformacoes();

        }
        scanner.close();
    }
}