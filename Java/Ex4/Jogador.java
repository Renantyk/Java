public class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;

    Jogador(String nome, int pontuacaoInicial, int nivelInicial) {
        this.nome = nome;
        this.pontuacao = pontuacaoInicial;
        this.nivel = nivelInicial;
    }

    void aumentarPontuacao(int pontos) {
        this.pontuacao += pontos;
    }

    void subirNivel() {
        this.nivel++;
    }

    void exibirInformacoes() {
        System.out.println("Nome do jogador: " + nome);
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Nível: " + nivel);
    }
}