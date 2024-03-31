import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Livro> colecao = new ArrayList<>();

        int opcao;
        
        do{
            System.out.println("[1] Adicionar livros");
            System.out.println("[2] Mostrar a colecao existente");
            System.out.println("Escolha uma opcao");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarLivro(scanner, colecao);
                    break;
                case 2:
                    mostrarColecao(colecao);
                    break;
                default:
                    System.out.println("Coloque uma opcao valida");
            }
        }while(opcao != 1 || opcao != 2);
        scanner.close();
    }

    public static void adicionarLivro(Scanner scanner, ArrayList<Livro> colecao){
        System.out.println("Titulo:" );
        String titulo = scanner.nextLine();

        System.out.println("Autor: ");
        String autor = scanner.nextLine();

        System.out.println("Ano: ");
        int ano = scanner.nextInt();
        scanner.nextLine();

        Livro novoLivro = new Livro(titulo, autor, ano);
        colecao.add(novoLivro);
        System.out.println("Livro adicionado");
    }

    public static void mostrarColecao(ArrayList<Livro> colecao){
        for( Livro livro : colecao){
            livro.exibirInfo();
        }
    }
}