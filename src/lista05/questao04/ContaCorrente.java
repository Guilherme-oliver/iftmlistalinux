package lista05.questao04;

public class ContaCorrente {

    private String titular;
    private double saldo = 0.0;
    private String historico = " ";
    private double limite;
    private double tarifa = 1.50;

    public ContaCorrente(){
    }

    public ContaCorrente(String titular, double limite) {
       if (titular == " "){
           System.out.println("Titular invalido!");
       }else {
           this.titular = titular;
       }
        if (limite <= 0){
            System.out.println("Valor invalido!");
        }else {
            this.limite = limite;
        }
    }

    public String toString(){
        return "Nome do titular: "
                + titular
                + "\n"
                +"Saldo: "
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
    public void geraExtrato(){
        if (tarifa > saldo){
            System.out.println("Saldo insuficiente");
        }else {
            registraOperacao("Geração do extrato");
            cobraTarifa();
            System.out.println(historico);
        }
    }

    public void deposita(double valor) {
        if (valor <= 0) {
            System.out.println("Valor incorreto!");
        } else {
            saldo += valor;
            registraOperacao("Houve um deposito de: " + valor);
        }
    }
    public void saca(double valor){
        if (valor + tarifa < saldo){
            saldo -= valor ;
            registraOperacao("Houve um saque de: " + valor );
            cobraTarifa();
        }else {
            System.out.println("Saldo insuficiente");
        }
    }

}
