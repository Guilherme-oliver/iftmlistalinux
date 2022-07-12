package lista02.questao2;

public class Retangulo {

    int lado1;
    int lado2;
    int area;
    int perimetro;

    public Retangulo(){

    }

    public Retangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    void setLados(int l1, int l2){
        this.lado1 = l1;
        this.lado2 = l2;
    }

    public double calculoArea(){
        return area = lado1 * lado2;
    }

    public double calculoPerimetro(){
        return perimetro = 2 * (lado1 + lado2);
    }

    public void mostraInfo(){
        System.out.println("Lado 01: " + this.lado1);
        System.out.println("Lado 02: " + this.lado2);
        System.out.println("Area do Retangulo: " + this.calculoArea());
        System.out.println("Perimetro do Retangulo: " + this.calculoPerimetro());
    }

}
