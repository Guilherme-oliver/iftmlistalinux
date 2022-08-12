package lista35.questao05;

public class Teste {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(15);
        Cubo cubo = new Cubo(quadrado);
        Piramide piramide = new Piramide(20, quadrado);
        Circulo circulo = new Circulo(20);
        Cilindro cilindro = new Cilindro(40,circulo);

        quadrado.getLado();
        quadrado.calcArea();
        System.out.println(quadrado.toString());
        System.out.println();
        cubo.calcAreaBase();
        cubo.calcVolume();
        System.out.println(cubo.toString());
        System.out.println();
        piramide.calcAreaBase();
        piramide.calcVolume();
        System.out.println(piramide.toString());
        System.out.println();
        circulo.calcArea();
        System.out.println(circulo.toString());
        System.out.println();
        cilindro.calcAreaBase();
        cilindro.calcVolume();
        System.out.println(cilindro.toString());
    }
}
