package lista35.questao03;

public class Teste {
    public static void main(String[] args) {
        Galinha galinha = new Galinha();
        Vaca vaca = new Vaca();
        Humano humano = new Humano();
        OncaPintada oncaPintada = new OncaPintada();

        galinha.comePlanta();
        galinha.fala();
        galinha.botaOvo();
        System.out.println();
        vaca.comePlanta();
        vaca.fala();
        vaca.produzLeite();
        System.out.println();
        humano.comePlanta();
        humano.fala();
        humano.come(galinha);
        humano.come(vaca);
        System.out.println();
        oncaPintada.come(humano);
    }
}
