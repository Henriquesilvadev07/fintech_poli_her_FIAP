package Model;

public abstract class ContaModel {

    private String numeroConta;
    private String agencia;
    private double saldo;

    public ContaModel(String numeroConta, String agencia, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldoInicial;
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            return true;
        }
        return false;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public abstract double calcularRendimentoOuTaxa();

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
