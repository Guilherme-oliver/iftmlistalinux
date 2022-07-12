package lista05;

public class Aplicacao {
    public static void main(String[] args) {

        Cachorro cachorro01 = new Cachorro();
        Cachorro cachorro02 = new Cachorro("Bulbassauro", 4);

        cachorro01.setNome("Pink");
        cachorro02.setIdade(8);
        System.out.println(cachorro01.toString());
        cachorro01.come();
        cachorro01.brinca();
        System.out.println();

        System.out.println(cachorro02.toString());
        cachorro02.come();
        cachorro02.brinca();


    }
}
