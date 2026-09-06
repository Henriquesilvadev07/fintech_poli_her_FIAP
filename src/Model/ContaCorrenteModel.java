package Model;

public class ContaCorrenteModel extends ContaModel{

    private double taxaManutencao;

    public ContaCorrenteModel(String numeroConta, String agencia, double saldoInicial, double taxaManutencao) {
        super(numeroConta, agencia, saldoInicial);
        this.taxaManutencao = taxaManutencao;
    }

    @Override
    public boolean sacar(double valor) {
        double valorComTaxa = valor + 2.50; // taxa fixa de R$ 2,50 por saque
        return super.sacar(valorComTaxa);
    }

    @Override
    public double calcularRendimentoOuTaxa() {
        boolean debitou = super.sacar(this.taxaManutencao);
        if (debitou) {
            return this.taxaManutencao;
        }
        return 0.0;
    }

    public double getTaxaManutencao() {
        return taxaManutencao;
    }

    public void setTaxaManutencao(double taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }
}
