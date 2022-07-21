package aula33.questao03;

public class Teste {
    public static void main(String[] args) {
        Conta contapoupanca = new ContaPoupanca(2000);
        Conta contacorrente = new ContaCorrente(1000,-1000);

        System.out.println(contapoupanca.geraExtrato());
        contapoupanca.deposita(1000);
        contapoupanca.saca(350);
        contapoupanca.tranfere(contacorrente,500);
        System.out.println(contapoupanca.geraExtrato());
        System.out.println();

        System.out.println(contacorrente.geraExtrato());
        contacorrente.deposita(1000);
        contacorrente.saca(350);
        contacorrente.tranfere(contapoupanca,500);
        System.out.println(contacorrente.geraExtrato());
    }
}
