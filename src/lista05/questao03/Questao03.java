package lista05.questao03;

public class Questao03 {
    public static void main(String[] args) {

        ContaPoupanca contaPoupanca1 = new ContaPoupanca();
        ContaPoupanca contaPoupanca2 = new ContaPoupanca("Alex");

        contaPoupanca1.depositar(1000.00);
        contaPoupanca1.sacar(275);
        System.out.println(contaPoupanca1.toString());
        System.out.println();

        contaPoupanca2.depositar(2000);
        contaPoupanca2.sacar(2003);
        System.out.println(contaPoupanca2.toString());

    }
}
