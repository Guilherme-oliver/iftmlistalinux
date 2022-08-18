package lista35.questao03;

public final class Galinha implements Herbivoro {
    @Override
    public void fala() {
        System.out.println("Cocorico");
    }

    @Override
    public void comePlanta() {
        System.out.println("Come milho");
    }

    public void botaOvo(){
        System.out.println("Bota um ovo");
    }
}
