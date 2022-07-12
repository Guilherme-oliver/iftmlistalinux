package aula26.questao03;

public class Teste {
    public static void main(String[] args) {
        ContaCorrente contaCorrente1 = new ContaCorrente("José", 10000);
        ContaCorrente contaCorrente2 = new ContaCorrente("Pedro", 20000);

        contaCorrente1.deposita(2000);
        contaCorrente1.saca(500);
        contaCorrente1.transfere(500,contaCorrente2);
        System.out.println();
        contaCorrente2.deposita(3000);
        contaCorrente2.saca(1000);
        contaCorrente2.transfere(1000,contaCorrente1);

        System.out.println(contaCorrente1.toString());
        System.out.println(contaCorrente2.toString());







    }
}
