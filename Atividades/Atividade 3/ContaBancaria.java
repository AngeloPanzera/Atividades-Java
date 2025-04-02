public class ContaBancaria {
    private String numeroConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(String numeroConta, String nomeTitular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("12345-6", "João Silva", 1000.00);

        System.out.println("Saldo inicial: R$ " + conta.consultarSaldo());
        conta.depositar(500.00);
        System.out.println("Saldo após depósito: R$ " + conta.consultarSaldo());
        conta.sacar(300.00);
        System.out.println("Saldo após saque: R$ " + conta.consultarSaldo());
        conta.sacar(1500.00); // Teste de saque inválido
    }
}