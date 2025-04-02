public class MainEstoque {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        // Adicionando produtos ao estoque
        estoque.adicionarProduto("Arroz", "001", 20.0, 10);
        estoque.adicionarProduto("Feijão", "002", 8.5, 20);
        estoque.adicionarProduto("Macarrão", "003", 5.0, 15);

        // Exibindo todos os produtos no estoque
        estoque.listarProdutos();

        // Atualizando um produto
        System.out.println("\nAtualizando produto...");
        estoque.removerProduto("002");

        // Gerando relatório do estoque
        System.out.println("\nRelatório do estoque:");
        estoque.gerarRelatorio();
    }
}
