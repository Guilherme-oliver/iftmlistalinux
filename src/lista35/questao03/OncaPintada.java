package lista35.questao03;

public class OncaPintada implements Carnivoro{
    @Override
    public void come(Herbivoro herbivoro) {
        if (herbivoro instanceof Galinha){
            Galinha galinha = (Galinha) herbivoro;
            System.out.println("Comeu uma galinha");
        }else if (herbivoro instanceof Vaca){
            Vaca vaca = (Vaca) herbivoro;
            System.out.println("Comeu carne de vaca");
        }else if (herbivoro instanceof Humano){
            Humano humano = (Humano) herbivoro;
            System.out.println("Comeu uma pessoa");
        }
    }
}
