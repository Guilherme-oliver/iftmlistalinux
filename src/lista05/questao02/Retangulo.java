package lista05.questao02;

public class Retangulo {
    private int lado1, lado2;

    public Retangulo(){

    }

    public Retangulo(int lado1, int lado2) {
        if (lado1 <= 0 || lado2 <= 0){
            System.out.println("Valores invalidos!");
        }else {
            this.lado1 = lado1;
            this.lado2 = lado2;
        }
    }
    public void setLados(int lado1, int lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    private int calcArea(){
        return lado1 * lado2;
    }
    private int calcPerimetro(){
        return 2 * (lado1 + lado2);
    }
    private boolean ehQuadrado(){
        if (lado1 == lado2){
            return true;
        }else{
            return false;
        }

    }
    public String toString(){
        return "Lado 01: "
                + lado1
                + "\n"
                + "Lado 02: "
                + lado2
                + "\n"
                + "Area: "
                + calcArea()
                + "\n"
                + "Perimetro: "
                + calcPerimetro()
                + "\n"
                + "É quadrado? "
                + ehQuadrado();
    }


}
