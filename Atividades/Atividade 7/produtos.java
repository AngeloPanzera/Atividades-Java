import java.util.ArrayList;
import java.util.List;

class Produto {
    private String nome;
    private String codigo;
    private double preco;
    private int quantidade;

    public Produto(String nome, String codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public void atualizarProduto(double preco, int quantidade) {
        this.preco = preco;
        this.quantidade = quantidade;
        System.out.println("Produto atualizado: " + nome);
    }

    public void exibirProduto() {
        System.out.println("Nome: " + nome + " | Código: " + codigo +
                " | Preço: R$ " + preco + " | Quantidade: " + quantidade);
    }

    public double getValorTotal() {
        return preco * quantidade;
    }
}

class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(String nome, String codigo, double preco, int quantidade) {
        produtos.add(new Produto(nome, codigo, preco, quantidade));
        System.out.println("Produto adicionado: " + nome);
    }

    public void removerProduto(String codigo) {
        produtos.removeIf(produto -> produto.getCodigo().equalsIgnoreCase(codigo));
        System.out.println("Produto removido: Código " + codigo);
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("O estoque está vazio.");
        } else {
            System.out.println("Produtos no estoque:");
            for (Produto produto : produtos) {
                produto.exibirProduto();
            }
        }
    }

    public void gerarRelatorio() {
        double total = 0;
        System.out.println("Relatório do Estoque:");
        for (Produto produto : produtos) {
            produto.exibirProduto();
            total += produto.getValorTotal();
        }
        System.out.println("Valor total em estoque: R$ " + total);
    }
}


