package lista04.questao3;

public class Triangulo {
    int lado1;
    int lado2;
    int lado3;

    Triangulo(){
    }
    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    void setLados(int lado1, int lado2, int lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    String getTipo(){
        if (lado1 == lado2 && lado1 == lado3){
            System.out.println("Equilatero");
        }else if (lado1 == lado2 || lado1 == lado3 || lado3 == lado2){
            System.out.println("Isósceles");
        }else if (lado1 != lado2 && lado1 != lado3){
            System.out.println("Escaleno");
        }
        return toString() ;
    }
    int area(){
        return  lado1 * lado2 / 2;
    }
    void mostraInfo(){
        System.out.println("Lado1: " + lado1 + "\n" + "Lado2: " + lado2 + "\n" + "Lado3: " + lado3);
        getTipo();
        System.out.println("Area: " + area());
    }
}
