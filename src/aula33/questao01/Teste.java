package aula33.questao01;

public class Teste {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Toto","Vira-lata","Bola");
        Animal gato = new Gato("Kitty","Lata-vira", "Azul");
        Humano humano = new Humano("Zé");

        humano.brinca(cachorro);
        humano.brinca(gato);
    }
}
