package lista02.questao2;

public class Questao02 {
    public static void main(String[] args) {

        Retangulo retangulo01 = new Retangulo(20,20);
        Retangulo retangulo02 = new Retangulo();

        System.out.println("Retangulo 01: ");
        retangulo01.mostraInfo();
        System.out.println();

        System.out.println("Retangulo 01: ");
        retangulo01.setLados(10, 20);
        retangulo01.calculoArea();
        retangulo01.calculoPerimetro();
        retangulo01.mostraInfo();
        System.out.println();

        System.out.println("Retangulo 02");
        retangulo02.mostraInfo();
        System.out.println();

        System.out.println("Retangulo 02");
        retangulo02.setLados(25, 15);
        retangulo02.calculoArea();
        retangulo02.calculoPerimetro();
        retangulo02.mostraInfo();

    }
}
