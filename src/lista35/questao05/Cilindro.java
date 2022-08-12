package lista35.questao05;

public class Cilindro implements Figura3D{
    private double altura;
    private Circulo base;

    public Cilindro(double altura, Circulo base) {
        this.altura = altura;
        this.base = base;
    }
    @Override
    public String toString(){
        return "Altura do cilindro: " + this.altura
                + "\nÁrea da base: " + calcAreaBase()
                + "\nVolume do cilindro: " + calcVolume();
    }

    @Override
    public double calcVolume() {
        return base.calcArea() * this.altura;
    }

    @Override
    public double calcAreaBase() {
        return 2 * this.base.calcArea() * this.altura;
    }
}
