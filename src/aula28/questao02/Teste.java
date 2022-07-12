package aula28.questao02;

public class Teste {
    public static void main(String[] args) {
        Estadio estadio = new Estadio("Uberlândia", "Brasil", 30000);

        Jogador jogador1 = new Jogador("Kleitim", "Azulim");
        Jogador jogador2 = new Jogador("Zé", "Atacadão");

        JogosTenis jogosTenis = new JogosTenis("21/10/1002", jogador1, jogador2, estadio);
        JogosTenis jogosTenis1 = new JogosTenis("22/10/1992", jogador1, jogador2, estadio);
        JogosTenis jogosTenis2 = new JogosTenis("23/10/1992", jogador1,jogador2, estadio);

        jogador1.associaJogo(jogosTenis);
        jogador2.associaJogo(jogosTenis);
        jogosTenis.isVencedor(jogador1);
        jogosTenis.defineVencendor(2);
        System.out.println(estadio.toString());
        System.out.println();
        System.out.println(jogador1.toString());
        System.out.println();
        System.out.println(jogador2.toString());
    }
}
