package lista04.questao4;

public class Questao04 {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(12);
        Circulo circulo2 = new Circulo();

        circulo1.setRaio(30);
        circulo2.setRaio(45);

        circulo1.mostraInfo();
        circulo2.mostraInfo();
    }
}
