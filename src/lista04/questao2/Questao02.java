package lista04.questao2;

public class Questao02 {
    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo(20, 35);
        Retangulo retangulo2 = new Retangulo();


        retangulo1.setLados(45,35);
        retangulo1.mostraInfo();
        System.out.println();

        retangulo2.setLados(30, 30);
        retangulo2.mostraInfo();

    }
}
