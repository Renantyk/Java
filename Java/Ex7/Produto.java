public class Produto {
    private String nome;
    private int codigo;
    private float preco;
    private int quantidadeEstoque;

    Produto(String nome, int codigo, float preco, int quantidadeEstoque){
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    String getNome(){
        return nome;
    }

    void setNome(String nome){
        this.nome = nome;
    }

    int getCodigo(){
        return codigo;
    }

    void setCodigo(int codigo){
        this.codigo = codigo;
    }

    float getPreco(){
        return preco;
    }

    void setPreco(float preco){
        this.preco = preco;
    }

    int getquantidadeEstoque(){
        return quantidadeEstoque;
    }

    void setquantidadeEstoque(int quantidadeEstoque){
        this.quantidadeEstoque = quantidadeEstoque;
    }

    void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Codigo: " + codigo);
        System.out.println("Preco: " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);
    }


}
