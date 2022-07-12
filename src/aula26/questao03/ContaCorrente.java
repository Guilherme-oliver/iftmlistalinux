package aula26.questao03;

import java.util.Objects;

public class ContaCorrente {
    private String titular;
    private double saldo = 0.0;
    private String historico = " ";
    private double limite;
    private static double tarifa = 1.50;

    public ContaCorrente(String titular, double limite) {
        if (titular.length() == 0){
            System.out.println("Titular invalido!");
        }else {
            this.titular = titular;
        }
        this.limite = limite;
    }
    private void registraOperacao(String op){
        this.historico = this.historico.concat(op + "\n");
    }
    private boolean cobraTarifa(){
        if (saldo > tarifa){
            saldo -= tarifa;
            registraOperacao("Cobrança da tarifa: " + tarifa);
            return true;
        }else {
            System.out.println("Saldo indisponivel");
            return false;
        }
    }
    public static void setTarifa(double t){
        if (t < 0){
            System.out.println("Erro");
        }else {
            tarifa = t;
        }
    }
    public void geraExtrato(){
        if (tarifa > saldo){
            System.out.println("Saldo insuficiente");
        }else {
            registraOperacao("Geração do extrato");
            cobraTarifa();
            System.out.println(historico);
        }
    }
    public boolean saca(double valor){
        if (valor < saldo + tarifa && valor > 0){
            this.saldo -= valor;
            cobraTarifa();
            registraOperacao("Houve um saque de: " + valor);
            return true;
        }else {
            System.out.println("Operação invalida!");
            return false;
        }
    }
    public boolean deposita(double valor){
        if (valor > 0){
            this.saldo += valor;
            registraOperacao("Houve um deposito de: " + valor);
            return true;
        }else {
            System.out.println("Operação invalida!");
            return false;
        }
    }
    public void transfere(double valor, ContaCorrente destino){
        if (valor < saldo + tarifa){
            if (this.titular != destino.titular){
                saca(valor);
                destino.deposita(valor);
                registraOperacao("Houve uma transferencia de: " + valor);
            }else {
                System.out.println("Erro");
            }
        }else {
            System.out.println("Saldo Insuficiente");
        }
    }
    @Override
    public String toString() {
        String info = "";
        info += "\nInformações Do Cliente";
        info += "\nTitular da conta: " + titular;
        info += "\nSaldo da conta: " + saldo;
        info += "\nLimte da conta: " + limite;
        return info;
    }
}
