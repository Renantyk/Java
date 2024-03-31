import java.util.ArrayList;

public class Pizza {
    private String nome;
    private float valor;
    private ArrayList<String> ingredientes;

    Pizza(String nome, float valor, ArrayList<String> ingredientes){
        this.nome = nome;
        this.valor = valor;
        this.ingredientes = ingredientes;
    }

    String getNome(){
        return nome;
    }

    float getValor(){
        return valor;
    }

    ArrayList<String> getIngredientes(){
        return ingredientes;
    }
}
