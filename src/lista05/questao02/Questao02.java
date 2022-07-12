package lista05.questao02;

public class Questao02 {
    public static void main(String[] args) {

        Retangulo retangulo01 = new Retangulo();
        Retangulo retangulo02 = new Retangulo(15, 30);

        retangulo01.setLados(20, 20);
        System.out.println(retangulo01.toString());
        System.out.println();

        System.out.println(retangulo02.toString());

    }
}
