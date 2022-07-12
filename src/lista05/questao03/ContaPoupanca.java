package lista05.questao03;

public class ContaPoupanca {

    private String titular;
    private double saldo = 0.0;

    public ContaPoupanca(){

    }

    public ContaPoupanca(String titular) {
        if (titular == " "){
            System.out.println("Titular invalido!");
        }else {
            this.titular = titular;
        }
    }

    public void sacar(double valor){
       if (valor < 0){
           System.out.println("Valor invalido!");
       }else {
           saldo -= valor;
       }
    }
    public void depositar(double valor){
        if (valor <= 0){
            System.out.println("Valor invalido");
        }else {
            saldo += valor;
        }
    }

    public String toString(){
        return "Nome do titular: "
                + titular
                + "\n"
                + "Saldo: "
                + saldo;
    }

}
