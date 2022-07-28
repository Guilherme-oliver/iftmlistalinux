package lista26.questao01;

public class Teste {
    public static void main(String[] args) {
        Personagem p1 = new Personagem("Duty");
        Personagem p2 = new Personagem("Medal");

        Controle controle1 = new Controle("Player 1");
        Controle controle2 = new Controle("Player 2");

        controle1.apertaB(p1);
        controle2.apertaFrente(p2);
        controle2.apertaX(p2);
    }
}
