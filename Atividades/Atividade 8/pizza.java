import java.util.List;

class Pizza {
    private String nome;
    private double preco;
    private List<String> ingredientes;

    public Pizza(String nome, double preco, List<String> ingredientes) {
        this.nome = nome;
        this.preco = preco;
        this.ingredientes = ingredientes;
    }
 
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void exibirPizza() {
        System.out.println("Pizza: " + nome + " | Preço: R$ " + preco);
        System.out.println("Ingredientes: " + ingredientes);
    }
}

