import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando uma lista de pizzas pré-definidas
        List<Pizza> menuPizzas = new ArrayList<>();
        menuPizzas.add(new Pizza("Mussarela", 30, List.of("Queijo", "Molho de tomate", "Orégano")));
        menuPizzas.add(new Pizza("Calabresa", 35, List.of("Calabresa", "Cebola", "Queijo", "Molho de tomate")));
        menuPizzas.add(new Pizza("Frango", 40, List.of("Frango", "Catupiry", "Queijo", "Molho de tomate")));

        // Criando pedidos
        Pedido pedido1 = new Pedido(menuPizzas.get(0), "grande", "Rua das Flores, 123");
        Pedido pedido2 = new Pedido(menuPizzas.get(2), "média", "Av. Brasil, 456");

        // Exibindo pedidos
        pedido1.exibirPedido();
        System.out.println("----------------------");
        pedido2.exibirPedido();
    }
}
