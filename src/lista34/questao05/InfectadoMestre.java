package lista34.questao05;

public class InfectadoMestre implements ZumbiCorredor,ZumbiArmado{
    @Override
    public void comeCerebro() {
        System.out.println("Um InfectadoMestre come cérebro");
    }

    @Override
    public void bate() {
        System.out.println("Um InfectadoMestre bate");
    }

    @Override
    public void corre() {
        System.out.println("Um InfectadoMestre corre");
    }
}
