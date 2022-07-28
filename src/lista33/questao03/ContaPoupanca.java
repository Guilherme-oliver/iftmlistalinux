package lista33.questao03;

public class ContaPoupanca extends Conta{
    private static double rendimento = 0.55;

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    public double creditaRendimento(){
        double rendimentosCredito = 0;
        return rendimentosCredito = getSaldo() * (this.rendimento / 100);
    }

    @Override
    public String geraExtrato() {
        String info = "";
        info += "Infarmações da conta poupança: ";
        info += "\nSaldo da conta: " + getSaldo();
        info += "\nRendimentos: " + creditaRendimento();
        return info;
    }
}
