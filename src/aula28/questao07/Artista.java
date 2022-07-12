package aula28.questao07;

import java.util.LinkedList;

public class Artista {
    private String nome;
    private String nacionalidade;
    private LinkedList<Album> albums = new LinkedList<>();

    public Artista(String nome, String nacionalidade) {
        if (nome.length() == 0){
            System.out.println("Nome do artista invalido!");
        }else {
            this.nome = nome;
        }

        if (nacionalidade.length() == 0){
            System.out.println("Nacionalidade invalido!");
        }else {
            this.nacionalidade = nacionalidade;
        }
    }
    public String getNome() {
        return nome;
    }
    public void associaAlbum(Album a){
        this.albums.add(a);
    }
    public void mostraAlbum(){
        if (this.albums.size() == 0){
            System.out.println("Não possui nenhum album!");
        }else {
            for (int i = 0; i < this.albums.size(); i++){
                System.out.println(this.albums.get(i).getAno());
            }
        }
    }
    public void mostraAlbum(int ano){
        for (int i = 0; i < this.albums.size(); i++){
            if (this.albums.get(i) == this.albums.get(ano)){
                System.out.println(this.albums);
            }
        }
    }
    public String toString(){
        String info = "";
        info += "\nInformação do Artista: ";
        info += "\nNome: " + this.nome;
        info += "\nNacionalidade: " + this.nacionalidade;
        if (this.albums.size() == 0){
            info += "\nArtista não tem album lançado!";
        }else {
            info += "\nArtista posui " + this.albums.size() + " albun(s)";
            for (int i = 0; i < albums.size(); i++){
                System.out.println(this.albums);
            }
        }
        return info;
    }
}
