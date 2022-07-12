package aula24.questao05;
// Agregação: Multiplos de 1;
public class Cilindro {
    private int altura;
    private Circulo circulo;

    public Cilindro(int altura, Circulo circulo) {
        this.altura = altura;
        this.circulo = circulo;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public double calcVolume(){
        return Math.PI * circulo.calcArea() * altura;
    }
    public String toString(){
        return "Informações do Cilindro: "
                + "\n"
                + "Altura: "
                + altura
                + "\n"
                + circulo.toString();
    }
}
