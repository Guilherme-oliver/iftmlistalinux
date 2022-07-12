package lista04.questao3;

public class Questao03 {
    public static void main(String[] args) {

        Triangulo triangulo1 = new Triangulo(10, 10, 10);
        Triangulo triangulo2 = new Triangulo();

        triangulo1.lado1 = 20;
        triangulo1.lado2 = 30;
        triangulo1.lado3 = 15;

        triangulo2.lado1 = 30;
        triangulo2.lado2 = 20;
        triangulo2.lado3 = 10;

        triangulo1.setLados(40, 40, 40);
        triangulo2.setLados(20, 40, 30);

        triangulo1.mostraInfo();
        triangulo2.mostraInfo();


    }
}
