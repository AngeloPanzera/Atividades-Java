import java.util.ArrayList;
import java.util.List;

class Contato {
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void exibirContato() {
        System.out.println("Nome: " + nome + " | Telefone: " + telefone);
    }
}

class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(String nome, String telefone) {
        contatos.add(new Contato(nome, telefone));
        System.out.println("Contato adicionado: " + nome);
    }

    public void buscarContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.exibirContato();
                return;
            }
        }
        System.out.println("Contato não encontrado.");
    }

    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("A agenda está vazia.");
        } else {
            System.out.println("Lista de Contatos:");
            for (Contato contato : contatos) {
                contato.exibirContato();
            }
        }
    }
}

