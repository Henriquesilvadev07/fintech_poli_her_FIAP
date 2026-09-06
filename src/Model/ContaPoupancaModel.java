package Model;

public class ContaPoupancaModel extends ContaModel{

    private double taxaRendimentoMensal;

    public ContaPoupancaModel(String numeroConta, String agencia, double saldoInicial, double taxaRendimentoMensal) {
        super(numeroConta, agencia, saldoInicial);
        this.taxaRendimentoMensal = taxaRendimentoMensal;
    }

    @Override
    public double calcularRendimentoOuTaxa() {
        double rendimento = getSaldo() * this.taxaRendimentoMensal;
        depositar(rendimento);
        return rendimento;
    }

    public double getTaxaRendimentoMensal() {
        return taxaRendimentoMensal;
    }

    public void setTaxaRendimentoMensal(double taxaRendimentoMensal) {
        this.taxaRendimentoMensal = taxaRendimentoMensal;
    }
}
