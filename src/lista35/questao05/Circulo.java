package lista35.questao05;

public class Circulo implements Figura2D{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString(){
        return "Raio do circulo: " + this.raio
                + "\nÁrea do circulo: " + calcArea();
    }

    @Override
    public double calcArea() {
        return Math.PI * (raio * raio);
    }
}
