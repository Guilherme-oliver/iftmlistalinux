package lista21.questao02;

public class ContaPoupanca {

    private String titular;
    private double saldo = 0;
    private static int numcontas = 0;
    private static double totaldinheiro = 0;

    public ContaPoupanca(String titular){
        if (titular == " "){
            System.out.println("Titular invalido!");
        }else {
            this.titular = titular;
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static int getNumcontas() {
        return numcontas;
    }

    public static void setNumcontas(int numcontas) {
        ContaPoupanca.numcontas = numcontas;
    }

    public static double getTotaldinheiro() {
        return totaldinheiro;
    }

    public static void setTotaldinheiro(double totaldinheiro) {
        ContaPoupanca.totaldinheiro = totaldinheiro;
    }

    public String toString(){
        return "Nome do titular: "
                + titular
                + "\n"
                + "Saldo: "
                + saldo;
    }

    public static void infoBanco(){
        System.out.println("Numero de contas: ");
        System.out.println(ContaPoupanca.numcontas);
        System.out.println("Total de dinheiro aplicado: ");
        System.out.println(ContaPoupanca.totaldinheiro);
    }

    public void saca(double valor){
        if (valor <= 0){
            System.out.println("Valor invalido!");
        }else {
            saldo -= valor;
        }
    }

    public void deposita(double valor){
        if (valor <= 0){
            System.out.println("Valor invalido!");
        }else {
            saldo += valor;
        }
    }


}
