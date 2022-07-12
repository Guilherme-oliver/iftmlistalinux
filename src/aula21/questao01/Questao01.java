package aula21.questao01;

public class Questao01 {
    public static void main(String[] args) {

        Cachorro cachorro01 = new Cachorro("Pickles", 7);
        Cachorro cachorro02 = new Cachorro("Plankton", 5);

        Cachorro.setNumcachorros(4);
        cachorro01.setNumfilhotes(3);
        System.out.println(cachorro01.toString());
    }
}
