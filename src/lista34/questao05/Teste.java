package lista34.questao05;

public class Teste {
    public static void main(String[] args) {
        InfectadoBatedor infectadoBatedor = new InfectadoBatedor();
        InfectadoCorredor infectadoCorredor = new InfectadoCorredor();
        InfectadoMestre infectadoMestre = new InfectadoMestre();

        infectadoCorredor.corre();
        infectadoCorredor.comeCerebro();
        System.out.println();
        infectadoBatedor.bate();
        infectadoBatedor.comeCerebro();
        System.out.println();
        infectadoMestre.corre();
        infectadoMestre.bate();
        infectadoMestre.comeCerebro();
    }
}
