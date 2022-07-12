package aula25.questao02;

public class Teste {
    public static void main(String[] args) {
        Album album = new Album("Merda", "Ze");
        album.addMusica("A", 200);
        album.addMusica("B", 300);
        album.addMusica("C", 203);
        album.addMusica("A", 200);
        album.addMusica("B", 300);
        album.addMusica("C", 203);
        album.addMusica("A", 200);
        album.addMusica("B", 300);
        album.addMusica("C", 203);
        album.addMusica("A", 200);
        album.addMusica("B", 300);
        album.addMusica("C", 203);
        album.addMusica("A", 200);
        album.addMusica("B", 300);
        album.addMusica("C", 203);
        album.addMusica("A", 200);
        album.addMusica("B", 300);
        album.addMusica("C", 203);
        album.addMusica("A", 200);
        album.addMusica("B", 300);

        System.out.println(album);
        album.removeMusica();

    }
}
