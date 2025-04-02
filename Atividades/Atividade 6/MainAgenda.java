public class MainAgenda {
    public static void main(String[] args) {
        // Criando a agenda
        Agenda minhaAgenda = new Agenda();

        // Adicionando contatos
        minhaAgenda.adicionarContato("Alice", "1234-5678");
        minhaAgenda.adicionarContato("Bob", "8765-4321");
        minhaAgenda.adicionarContato("Carlos", "5555-5555");

        // Listando contatos
        System.out.println("\nLista de contatos:");
        minhaAgenda.listarContatos();

        // Buscando um contato existente
        System.out.println("\nBuscando contato 'Alice':");
        minhaAgenda.buscarContato("Alice");

        // Buscando um contato inexistente
        System.out.println("\nBuscando contato 'Daniel':");
        minhaAgenda.buscarContato("Daniel");
    }
}
