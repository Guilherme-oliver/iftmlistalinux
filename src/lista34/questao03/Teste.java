package lista34.questao03;

public class Teste {
    public static void main(String[] args) {
        RadioRelogio radioRelogio = new RadioRelogio(23,59,108,true);
        RadioPilha radioPilha = new RadioPilha(87,false);

        System.out.println(radioRelogio.toString());
        System.out.println(radioPilha.toString());

        radioRelogio.avancaMinuto();
        System.out.println(radioRelogio);
    }
}
