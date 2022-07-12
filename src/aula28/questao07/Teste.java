package aula28.questao07;

public class Teste {
    public static void main(String[] args) {
        Musica musica = new Musica("AAAA", "Dudu", 200);
        Musica musica1 = new Musica("BBBB", "Dudu", 201);
        Musica musica2 = new Musica("CCCC", "Dudu", 202);

        Album album = new Album("ABC", 2001);

        Artista artista = new Artista("Dudu", "Brasil");

        musica.getDuracao();
        musica.getDuracao();
        artista.getNome();

        album.addMusica("AAAA", artista.getNome(), musica.getDuracao());
        artista.associaAlbum(album);
        System.out.println(artista.toString());

    }
}
