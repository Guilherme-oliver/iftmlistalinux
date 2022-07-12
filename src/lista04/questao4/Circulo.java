package lista04.questao4;

public class Circulo {
    double raio;

    Circulo(){
    }

    public Circulo(double raio) {
        this.raio = raio;
    }
    void setRaio(double raio){
        this.raio = raio;
    }
    double calcArea(){
        return Math.PI * Math.pow(raio, 2);
    }
    double calcPerimetro(){
        return 2 * Math.PI * raio;
    }
    void mostraInfo(){
        System.out.println(raio);
        System.out.println(calcArea());
        System.out.println(calcPerimetro());
    }
}
