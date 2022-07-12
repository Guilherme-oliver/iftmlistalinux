package lista02.questao3;

public class Questao03 {
    public static void main(String[] args) {

        Circulo circulo01 = new Circulo();
        Circulo circulo02 = new Circulo();

        circulo01.setRaio(8.0);
        circulo02.setRaio(7.5);

        System.out.println("Circulo 01: ");
        circulo01.mostraInfo();
        System.out.println();
        System.out.println("Circulo 02: ");
        circulo02.mostraInfo();


    }
}
