package lista25.questao02;
//Composição: Multiplicidade 0..N
public class Album {
    private String nome;
    private String artista;
    private Musica[] musicas = new Musica[20];

    public Album(String nome, String artista) {
        if (nome.length() == 0){
            System.out.println("Album invalido!");
        }else {
            this.nome = nome;
        }
        if (artista.length() == 0){
            System.out.println("Artista invalido!");
        }else {
            this.artista = artista;
        }
    }
    public void addMusica(String nome, int tempo){
        for (int i = 0; i < musicas.length; i++){
            if (this.musicas[i] == null){
                this.musicas[i] = new Musica(nome, tempo);
                break;
            }else if (i == musicas.length){
                System.out.println("Limite alcançado!");
            }
        }
    }
    public void removeMusica(){
        for (int i = musicas.length -1 ; i <= musicas.length; i--){
            if (this.musicas[i] != null){
                this.musicas[i] = null;
                break;
            }
        }
    }
    public String toString(){
        String musicas  = "";
        for(int i = 0; i < this.musicas.length; i ++){
            musicas = musicas.concat(String.valueOf(this.musicas[i]).concat("\n"));
        }
        return "Nome do album: "
                + nome
                + "\n"
                + "Nome do artista: "
                + artista
                + "\n"
                + "Nomes das músicas: "
                + "\n"
                + musicas;
    }

}
