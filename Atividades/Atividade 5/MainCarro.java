public class MainCarro {
    public static void main(String[] args) {
        // Criando um carro
        Carro meuCarro = new Carro("Ford", "Mustang", 2022, "XYZ-9876");

        // Exibindo informações iniciais
        meuCarro.exibirInformacoes();

        // Testando aceleração e frenagem
        meuCarro.acelerar(50);
        meuCarro.frear(20);

        // Exibindo informações após as mudanças
        meuCarro.exibirInformacoes();
    }
}
