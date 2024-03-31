import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Produto> estoque = new ArrayList<>();

        int opcao;

        do {
            System.out.println("[1] Adicionar produto");
            System.out.println("[2] Atualizar produto");
            System.out.println("[3] Remover produto");
            System.out.println("[4] Gerar relatorio");
            System.out.println("Digite uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarProduto(estoque, scanner);
                    break;
                case 2:
                    atualizarProduto(estoque, scanner);
                    break;
                case 3:
                    removerProduto(estoque, scanner);
                    break;
                case 4:
                    gerarRelatorio(estoque);
                    break;
                default:
                    System.out.println("Digite uma opcao valida!");
            }
        }while(opcao != 0);

        scanner.close();
    }

    public static void adicionarProduto(ArrayList<Produto> estoque, Scanner scanner) {
        System.out.println("Nome do Produto: ");
        String nome = scanner.nextLine();

        System.out.println("Código do Produto: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Preço do Produto: ");
        float preco = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Quantidade em Estoque: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        Produto novoProduto = new Produto(nome, codigo, preco, quantidade);
        estoque.add(novoProduto);
        System.out.println("Produto adicionado com sucesso!");
    }

    public static void atualizarProduto(ArrayList<Produto> estoque, Scanner scanner) {
        System.out.println("Informe o código do produto a ser atualizado: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        Produto produtoParaAtualizar = null;
        for (Produto produto : estoque) {
            if (produto.getCodigo() == codigo) {
                produtoParaAtualizar = produto;
                break;
            }
        }

        if (produtoParaAtualizar != null) {
            System.out.println("Novo Nome do Produto: ");
            String novoNome = scanner.nextLine();
            produtoParaAtualizar.setNome(novoNome);

            System.out.println("Novo Preço do Produto: ");
            float novoPreco = scanner.nextFloat();
            produtoParaAtualizar.setPreco(novoPreco);

            System.out.println("Nova Quantidade em Estoque: ");
            int novaQuantidade = scanner.nextInt();
            scanner.nextLine();
            produtoParaAtualizar.setquantidadeEstoque(novaQuantidade);

            System.out.println("Produto atualizado com sucesso");
        }else{
            System.out.println("Produto não encontrado no estoque");
        }
    }

    public static void removerProduto(ArrayList<Produto> estoque, Scanner scanner) {
        System.out.println("Informe o código do produto a ser removido: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        Produto produtoParaRemover = null;
        for (Produto produto : estoque) {
            if (produto.getCodigo() == codigo) {
                produtoParaRemover = produto;
                break;
            }
        }

        if(produtoParaRemover != null) {
            estoque.remove(produtoParaRemover);
            System.out.println("Produto removido com sucesso!");
        }else{
            System.out.println("Produto não encontrado no estoque.");
        }
    }

    public static void gerarRelatorio(ArrayList<Produto> estoque) {
        for(Produto produto : estoque) {
            produto.exibirInformacoes();
        }
    }
}