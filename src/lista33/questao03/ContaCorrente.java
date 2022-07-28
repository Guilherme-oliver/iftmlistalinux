package lista33.questao03;

public class ContaCorrente extends Conta{
    private double limite;
    private static double tarifa = 2.50;

    public ContaCorrente(double saldo, double limite) {
        super(saldo);
        this.limite = limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void saca(double valor){
        if (valor < getSaldo() + tarifa){
            super.saca(valor + tarifa);
        }
    }

    @Override
    public String geraExtrato() {
        String info = "";
        info += "Informações da conta corrente: ";
        info += "\nsaldo: " + getSaldo();
        info += "\nLimite da conta corrente: " + this.limite;
        info += "\nTarifa de saque: " + tarifa;
        return info;
    }
}
