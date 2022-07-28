package lista34.questao04;

public class Teste {
    public static void main(String[] args) {
        AtorMecbeth atorMecbeth = new AtorMecbeth();
        AtorHamlet atorHamlet = new AtorHamlet();
        Diretor diretor = new Diretor();
        diretor.dirige(atorHamlet);
        System.out.println();
        diretor.dirige(atorMecbeth);

    }
}
