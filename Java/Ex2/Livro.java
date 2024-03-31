public class Livro{
    private String titulo;
    private String autor;
    private int ano;

    public Livro(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    void exibirInfo(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
    }

    String getTitulo(){
        return titulo;
    }

    void setTitulo(){
        this.titulo = titulo;
    }

    String getAutor(){
        return autor;
    }

    void setAutor(){
        this.autor = autor;
    }

    int getAno(){
        return ano;
    }

    void setAno(){
        this.ano = ano;
    }
}