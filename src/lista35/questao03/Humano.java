package lista35.questao03;

public final class Humano implements Herbivoro, Carnivoro{
    @Override
    public void fala() {
        System.out.println("Olá Jovem");
    }

    @Override
    public void come(Herbivoro herbivoro) {
        if (herbivoro instanceof Galinha){
            Galinha galinha = (Galinha) herbivoro;
            System.out.println("Comeu uma galinha");
        }else if (herbivoro instanceof Vaca){
            Vaca vaca = (Vaca) herbivoro;
            System.out.println("Comeu carne de vaca");
        }else {
            System.out.println("Canibalismo não é permitido!");
        }
    }

    @Override
    public void comePlanta() {
        System.out.println("Come arroz");
    }
}
