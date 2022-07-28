package lista27.questao02;

public class Teste {
    public static void main(String[] args) {
        Arma arma1 = new Arma("1234", 8);
        Arma arma2 = new Arma("9876", 10);
        Jogador jogador1 = new Jogador("Pablo", arma1);
        Jogador jogador2 = new Jogador("Kleber", arma2);


        arma1.associaJogador(jogador1);
        arma1.temJogador();
        arma1.estaVazio();
        arma1.addBolas(10);
        arma1.estaVazio();
        System.out.println(arma1.toString());
        System.out.println();

        arma2.associaJogador(jogador2);
        arma2.temJogador();
        arma2.estaVazio();
        arma2.removeBola();
        arma2.addBolas(10);
        System.out.println(arma2.toString());
        System.out.println();




    }
}
