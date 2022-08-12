package lista35.questao05;

public class Piramide implements Figura3D{
    private double altura;
    private Quadrado base;

    public Piramide(double altura, Quadrado base) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public String toString(){
        return "Altura do triângulo: " + this.altura
                + "\nÁrea da base do triângulo: " + calcAreaBase()
                + "\nVolume do triângulo: " + calcVolume();
    }

    @Override
    public double calcVolume(){
        return calcAreaBase() * altura;
    }

    @Override
    public double calcAreaBase() {
        return this.base.getLado() * altura / 2;
    }
}
