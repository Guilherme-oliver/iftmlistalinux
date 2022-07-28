package lista28.questao01;

public class Teste {
    public static void main(String[] args) {
        Arma arma1 = new Arma("Claymor", "GreatSword", 130);
        Arma arma2 = new Arma("BastardSword", "NormalSword", 89);
        Arma arma3 = new Arma("Clava", "Hammer", 100);

        Heroi heroi1 = new Heroi("Kamikazi", 1200, arma1);
        Heroi heroi2 = new Heroi("Kratos", 890, arma2);

        Monstro monstro1 = new Monstro("Fly", 129, 60);
        Monstro monstro2 = new Monstro("Sif", 3000, 200);
        Monstro monstro3 = new Monstro("Morgot", 350, 180);

        System.out.println(arma1.toString());
        System.out.println();
        System.out.println(arma2.toString());
        System.out.println();
        System.out.println(arma3.toString());
        System.out.println();
        System.out.println(heroi1.toString());
        System.out.println();
        System.out.println(heroi2.toString());
        System.out.println();
        System.out.println(monstro1.toString());
        System.out.println();
        System.out.println(monstro2.toString());
        System.out.println();
        System.out.println(monstro3.toString());
        System.out.println();

        heroi1.ataca(monstro1);
        heroi2.ataca(monstro3);
        monstro1.setAlgoz(heroi1);
        monstro3.setAlgoz(heroi2);

        System.out.println(heroi1.toString());
        System.out.println(heroi2.toString());
        System.out.println(monstro1.toString());
        System.out.println(monstro3.toString());

    }
}
