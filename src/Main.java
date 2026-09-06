import Model.ContaCorrenteModel;
import Model.ContaModel;
import Model.ContaPoupancaModel;

public class Main {
    public static void main(String[] args) {
        // instanciando Conta Corrente (Polimorfismo de classe abstrata)
        ContaModel cc = new ContaCorrenteModel("1001-2", "0001", 1000.00, 15.00);

        // instanciando Conta Poupança
        ContaModel cp = new ContaPoupancaModel("2002-8", "0001", 5000.00, 0.006); // 0.6% a.m.

        System.out.println("=== EXECUÇÃO DE OPERAÇÕES FINTECH ===\n");

        // testando Conta Corrente
        boolean saqueCcSucesso = cc.sacar(200.00);
        double taxaDebitada = cc.calcularRendimentoOuTaxa();

        System.out.println("CONTA CORRENTE (" + cc.getNumeroConta() + "):");
        System.out.println("Saque de R$ 200,00 realizado? " + saqueCcSucesso);
        System.out.println("Taxa de manutenção cobrada: R$ " + taxaDebitada);
        System.out.println("Saldo final CC: R$ " + cc.getSaldo());

        System.out.println("\n-----------------------------------\n");

        // testando Conta Poupança
        boolean depositoCpSucesso = cp.depositar(1000.00);
        double rendimentoGerado = cp.calcularRendimentoOuTaxa();

        System.out.println("CONTA POUPANÇA (" + cp.getNumeroConta() + "):");
        System.out.println("Depósito de R$ 1000,00 realizado? " + depositoCpSucesso);
        System.out.println("Rendimento mensal aplicado: R$ " + rendimentoGerado);
        System.out.println("Saldo final CP: R$ " + cp.getSaldo());
    }
}