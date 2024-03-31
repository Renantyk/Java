import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;

    Agenda(){
        this.contatos = new ArrayList<>();
    }

    void adicionarContato( Contato contato) {
        contatos.add(contato);
    }

    ArrayList<Contato> getContatos(){
        return contatos;
    }

//Nao entendi muito como é feito essa parte de busca de contatos, porem cheguei nisso

    Contato buscarContato(String nome){
        for(Contato contato : contatos){
            if(contato.getNome().equalsIgnoreCase(nome)){
                return contato;
            } 
        }
        return null;
    }
}
