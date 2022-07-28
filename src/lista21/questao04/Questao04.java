package lista21.questao04;

public class Questao04 {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente("Joao", 1000);

        contaCorrente.deposita(1000);
        contaCorrente.saca(300);
        contaCorrente.geraExtrato();


        ContaCorrente.geraExtratoBanco();
    }
}
