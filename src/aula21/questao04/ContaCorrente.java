package aula21.questao04;

public class ContaCorrente {
    private String titular;
    private double saldo = 0.0;
    private String historico = " ";
    private double limite;
    private static String historicobanco = " ";
    private static double tarifa = 1.50;
    private static int numcontas = 0;
    private static double saldototal = 0.0;

    public ContaCorrente(String titular, double limite) {
        if (titular == " "){
            System.out.println("Titular invalido!");
        }else {
            this.titular = titular;
        }
        if (limite <= 0 || limite < saldo || saldo < 0){
            System.out.println("Não tem limite");
        }else {
            this.limite = limite;
        }
    }

    public String toString(){
        return "Nome do titular: "
                + titular
                + "\n"
                + "Saldo: "
                + saldo
                + "\n"
                + "Limite: "
                + limite
                + "\n"
                + "Tarifa: "
                + tarifa;
    }

    private void registraOperacao(String op){
        this.historico.concat(op + "\n");
        registraOperacaoBanco(op, this.titular);
    }

    private static void registraOperacaoBanco(String op, String titular){
        ContaCorrente.historicobanco = ContaCorrente.historicobanco.concat(op + titular + "\n");
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public static void setTarifa(double tarifa) {
        ContaCorrente.tarifa = tarifa;
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

    public void saca(double valor){
        if (valor <= 0){
            System.out.println("Valor invalido!");
        }else {
            saldo -= valor;
            registraOperacao("Houve um saque de: " + valor );
            cobraTarifa();
        }
    }

    public void deposita(double valor){
        if (valor <= 0){
            System.out.println("Valor invalido!");
        }else {
            saldo += valor;
            registraOperacao("Houve um deposito de: " + valor);
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

    public static void geraExtratoBanco(){
        System.out.println(historicobanco);
    }
}
