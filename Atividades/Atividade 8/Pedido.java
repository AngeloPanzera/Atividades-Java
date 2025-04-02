class Pedido {
    private static int contadorPedidos = 0;
    private int idPedido;
    private Pizza pizza;
    private String tamanho;
    private String enderecoEntrega;
    private double valorTotal;

    public Pedido(Pizza pizza, String tamanho, String enderecoEntrega) {
        this.idPedido = ++contadorPedidos;
        this.pizza = pizza;
        this.tamanho = tamanho;
        this.enderecoEntrega = enderecoEntrega;
        calcularValor();
    }

    private void calcularValor() {
        switch (tamanho.toLowerCase()) {
            case "pequena":
                valorTotal = pizza.getPreco() * 0.8;
                break;
            case "média":
                valorTotal = pizza.getPreco();
                break;
            case "grande":
                valorTotal = pizza.getPreco() * 1.3;
                break;
            default:
                valorTotal = pizza.getPreco();
        }
    }

    public void exibirPedido() {
        System.out.println("Pedido #" + idPedido);
        pizza.exibirPizza();
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Endereço de Entrega: " + enderecoEntrega);
        System.out.println("Valor Total: R$ " + valorTotal);
    }
}

