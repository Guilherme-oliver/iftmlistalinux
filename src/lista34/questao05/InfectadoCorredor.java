package lista34.questao05;

public class InfectadoCorredor implements ZumbiCorredor{
    @Override
    public void comeCerebro() {
        System.out.println("Um InfectadoCorredor come cérebro");
    }

    @Override
    public void corre() {
        System.out.println("Um InfectadoCorredor corre");
    }
}
