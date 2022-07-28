package lista34.questao02;

public class Triatleta implements PodeCorrer,PodeNadar,PodePedalar{
    @Override
    public void corre() {
        System.out.println("Um triatleta coloca o tênis e começa a correr!");
    }

    @Override
    public void nada() {
        System.out.println("Um triatleta pula no mar e começa a nadar!");
    }

    @Override
    public void pedala() {
        System.out.println("Um triatleta sobe na bicicleta e começa a pedalar!");
    }
}
