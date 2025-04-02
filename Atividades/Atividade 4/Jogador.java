public class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;

    public Jogador(String nome, int pontuacaoInicial, int nivelInicial) {
        this.nome = nome;
        this.pontuacao = pontuacaoInicial;
        this.nivel = nivelInicial;
    }

    public void aumentarPontuacao(int pontos) {
        if (pontos > 0) {
            pontuacao += pontos;
            System.out.println(nome + " ganhou " + pontos + " pontos!");
        } else {
            System.out.println("Os pontos adicionados devem ser positivos.");
        }
    }

    public void subirNivel() {
        nivel++;
        System.out.println(nome + " subiu para o nível " + nivel + "!");
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Nível: " + nivel);
    }

    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Carlos", 1000, 5);

        jogador1.exibirInfo();
        jogador1.aumentarPontuacao(500);
        jogador1.subirNivel();
        jogador1.exibirInfo();
    }
}