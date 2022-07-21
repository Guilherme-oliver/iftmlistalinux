package aula33.questao03;

public abstract class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void saca(double valor){
        if (valor > 0){
            this.saldo = this.saldo - valor;
        }else {
            System.out.println("Valor incorreto!");
        }
    }

    public void deposita(double valor){
        if (valor > 0){
            this.saldo = this.saldo + valor;
        }else {
            System.out.println("Valor incorreto!");
        }
    }

    public abstract String geraExtrato();

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void tranfere(Conta destino, double valor){
        if (destino instanceof ContaCorrente){
            System.out.println("Destino conta corrente");
            ContaCorrente cliente = (ContaCorrente) destino;
            destino.saldo = destino.getSaldo() + valor;
            this.saldo -= valor;
        }else if (destino instanceof ContaPoupanca){
            System.out.println("Destino conta poupança");
            ContaPoupanca cliente = (ContaPoupanca) destino;
            destino.saldo = destino.getSaldo() + valor;
            this.saldo -= valor;
        }
    }
}
