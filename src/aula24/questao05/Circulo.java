package aula24.questao05;

public class Circulo {
    private int raio;
    private Ponto ponto;

    public Circulo(int raio, Ponto ponto) {
        this.raio = raio;
        this.ponto = ponto;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
    public double calcPerimetro(){
        return 2 * Math.PI * raio;
    }
    public double calcArea(){
        return Math.PI * Math.pow(raio, 2);
    }
    public String toString(){
        return "Informações do circulo: "
                + "\n"
                + "Raio: "
                + raio
                + "\n"
                + "Parímetro"
                + calcPerimetro()
                + "\n"
                + "Ponto agregado: "
                + ponto.toString();
    }
}
