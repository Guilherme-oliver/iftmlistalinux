package lista04;

public class Questao01 {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("DEAMON");
        Cachorro c2 = new Cachorro(5);
        Cachorro c3 = new Cachorro("Sif", 12);

        System.out.println(cachorro.nome);
        System.out.println(cachorro.idade);
        cachorro.mostraInfo();
        System.out.println();

        System.out.println("Cachorro 1");
        cachorro.setNome("Snorlax");
        cachorro.setIdade(12);
        cachorro.mostraInfo();
        cachorro.late();
        System.out.println();

        System.out.println("Cachorro 2");
        c2.setNome("Wargreymon");
        c2.setIdade(7);
        c2.mostraInfo();
        c2.late();
        System.out.println();

        System.out.println("Cachorro 3");
        c3.mostraInfo();
        c3.late();
    }
}
