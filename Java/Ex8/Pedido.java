import java.util.ArrayList;

public class Pedido {
    private ArrayList<Pizza> pizzas;
    private String enderecoEntrega;
    
    Pedido(ArrayList<Pizza> pizzas, String enderecoEntrega){
        this.pizzas = new ArrayList<>();
        this.enderecoEntrega = enderecoEntrega;
    }

    void adicionarPizza(Pizza pizza){
        pizzas.add(pizza);
    }

    void entregaDetalhe(String enderecoEntrega){
        this.enderecoEntrega = enderecoEntrega;
    }

    void cancelarPedido(){
        pizzas.clear();
        this.enderecoEntrega = enderecoEntrega;
    }

    void gerarRelatorio(){
        System.out.println("Endereco de entrega: " + enderecoEntrega);
        
        for( Pizza pizza : pizzas){
            System.out.println("=" + pizza.getNome());
            System.out.println("Preco: " + pizza.getValor());
        }
        float total = calcularTotal();
        System.out.println("Preco total" + total);
    }

    float calcularTotal(){
        
        float total = 0;

        for(Pizza pizza : pizzas){
            total += pizza.getValor();
        }
        return total;
    }
}
