package banco;

public class Conta {
    private String nomeCliente;
    private double saldo;

    public Conta(String nomeCliente, double saldoInicial) {
        this.nomeCliente = nomeCliente;
        this.saldo = saldoInicial;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return String.format("Cliente: %s, Saldo: R$ %.2f", nomeCliente, saldo);
    }
}

