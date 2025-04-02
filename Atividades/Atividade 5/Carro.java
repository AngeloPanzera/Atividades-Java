public class Carro {
    // Atributos privados
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private int velocidadeAtual;

    // Construtor
    public Carro(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = 0; // Inicialmente parado
    }

    // Método para acelerar
    public void acelerar(int incremento) {
        if (incremento > 0) {
            velocidadeAtual += incremento;
            System.out.println("O carro acelerou para " + velocidadeAtual + " km/h.");
        } else {
            System.out.println("Informe um valor positivo para acelerar.");
        }
    }

    // Método para frear
    public void frear(int decremento) {
        if (decremento > 0 && velocidadeAtual - decremento >= 0) {
            velocidadeAtual -= decremento;
            System.out.println("O carro reduziu para " + velocidadeAtual + " km/h.");
        } else {
            System.out.println("O carro já está parado ou o valor informado é inválido.");
        }
    }

    // Método para exibir informações do carro
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Placa: " + placa);
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
    }
}
