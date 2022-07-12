package aula26.questao02;

public class Jukebox {
    private String[] musicas;

    public Jukebox(String[] musicas) {
        if (musicas.length == 0){
            System.out.println("Invalido");
        }else {
            this.musicas = musicas;
        }
    }
    public boolean tocaMusica(int i){
        if (i <= musicas.length -1 && i >= 0 && this.musicas[i] != null){
            System.out.println("Nome da música: " + musicas[i]);
            return true;
        }
        return false;
    }
    public String toString(){
        return String.valueOf(musicas.length);
    }
}
