package lista02.questao3;

public class Circulo {

    Double raio;
    Double area;
    Double perimetro;

    public Circulo(){

    }

    public Circulo(Double raio) {
        this.raio = raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    public double calculoArea(){
        return area = Math.PI * Math.pow(raio, 2);
    }

    public double calculoPerimetro(){
        return perimetro = 2 * Math.PI * raio;
    }

    public void mostraInfo(){
        System.out.println("Raio: " + this.raio);
        System.out.println("Area: " + this.calculoArea());
        System.out.println("Perimetro: " + this.calculoPerimetro());
    }


}
