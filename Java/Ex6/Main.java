import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Agenda novaAgenda = new Agenda();

        System.out.println("\nAdicione um novo contato");

        System.out.println("\nDigite o nome da pessoa: ");
        String nomeContato = scanner.nextLine();

        System.out.println("\nDigite o telefone da pessoa: ");
        String telefoneContato = scanner.nextLine();

        Contato novoContato = new Contato(nomeContato, telefoneContato);

        novaAgenda.adicionarContato(novoContato);

        System.out.println("\nLista de contatos");
        for(Contato contato : novaAgenda.getContatos()){
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Telefone: " + contato.getTelefone());
        }
        scanner.close();
    }
}
