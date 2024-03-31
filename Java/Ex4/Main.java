import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Sistema de Gerenciamento de Jogadores!");

        System.out.println("Quantos jogadores deseja adicionar?");
        int numJogadores = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numJogadores; i++) {
            System.out.println("\nJogador " + i + ":");

            System.out.println("Nome do jogador:");
            String nomeJogador = scanner.nextLine();

            System.out.println("Pontuação inicial:");
            int pontuacaoInicial = scanner.nextInt();

            System.out.println("Nível inicial:");
            int nivelInicial = scanner.nextInt();
            scanner.nextLine();

            Jogador jogador = new Jogador(nomeJogador, pontuacaoInicial, nivelInicial);

            System.out.println("\nInformações do jogador " + i + ":");
            jogador.exibirInformacoes();

            jogador.aumentarPontuacao(50);
            jogador.subirNivel();

            System.out.println("\nInformações atualizadas do jogador " + i + ":");
            jogador.exibirInformacoes();
        }

        scanner.close();
    }
}
