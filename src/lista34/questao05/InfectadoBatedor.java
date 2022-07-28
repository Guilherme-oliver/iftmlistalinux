package lista34.questao05;

public class InfectadoBatedor implements ZumbiArmado{

    @Override
    public void comeCerebro() {
        System.out.println("Um InfectadoBatedor come cérebro");
    }

    @Override
    public void bate() {
        System.out.println("Um InfectadoBatedor bate");
    }
}
