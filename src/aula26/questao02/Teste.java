package aula26.questao02;

public class Teste {
    public static void main(String[] args) {

        Jukebox jukebox = new Jukebox(new String[]{"A", "B", "C", "D"});
        Jukebox jukebox2 = new Jukebox(new String[]{"Q", "W", "E", "R"});

        Pessoa pessoa1 = new Pessoa("Joao");
        Pessoa pessoa2 = new Pessoa("José");

        pessoa1.trocaMusica(-1, jukebox);
        pessoa2.trocaMusica(2, jukebox2);

        System.out.println(pessoa1.toString());
        System.out.println();
        System.out.println(pessoa2.toString());

    }
}
