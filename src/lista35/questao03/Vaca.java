package lista35.questao03;

public class Vaca implements Herbivoro{
    @Override
    public void fala() {
        System.out.println("Moooo");
    }

    @Override
    public void comePlanta() {
        System.out.println("Come pasto");
    }

    public void produzLeite(){
        System.out.println("Produz leite");
    }
}
