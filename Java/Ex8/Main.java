import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pizza pizza1 = new Pizza("Calabresa",40, new ArrayList<>());
        Pizza pizza2 = new Pizza("Mussarela",35, new ArrayList<>());

        ArrayList<Pizza> pizzasCardapio = new ArrayList<>();
        pizzasCardapio.add(pizza1);
        pizzasCardapio.add(pizza2);

        Pedido pedido = new Pedido(pizzasCardapio, null);

        int opcao;

        do{
            System.out.println("[1] Add pizza");
            System.out.println("[2] Detalhes do pedido");
            System.out.println("[3] Cancelar pedido");
            System.out.println("[4] Relatorio");
            System.out.println("[5] Sair do sistema");
            System.out.println("Selecione a opcao desejada");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    for(int i = 0; i < pizzasCardapio.size(); i++){
                        Pizza pizza = pizzasCardapio.get(i);
                        System.out.println((i + 1) + " - " + pizza.getNome() + "Preco" + pizza.getValor());
                    }

                    System.out.println("Digite o numero da pizza desejada");
                    int numPizza = scanner.nextInt();
                    scanner.nextLine();
                    
                    Pizza pizzaSelecionada = pizzasCardapio.get(numPizza - 1);
                    pedido.adicionarPizza(pizzaSelecionada);
                    break;

                case 2:
                    System.out.println("Digite o endereco de entrega:");
                    String endereco = scanner.nextLine();
                    pedido.entregaDetalhe(endereco);
                    break;

                case 3:
                    pedido.cancelarPedido();
                    break;
                
                case 4:
                    pedido.gerarRelatorio();
                    break;

                case 5:
                    System.out.println("Encerrando programa");
                    break;
            
                default:
                    System.out.println("Digite uma opcao valida");
                    break;
            }
        }while (opcao != 5);
    }
}
