package lista34.questao02;

public class Teste {
    public static void main(String[] args) {
        Maratonista maratonista = new Maratonista();
        Triatleta triatleta = new Triatleta();
        Nadador nadador = new Nadador();

        maratonista.corre();
        System.out.println();
        nadador.nada();
        System.out.println();
        triatleta.corre();
        triatleta.nada();
        triatleta.pedala();
    }
}
