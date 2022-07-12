package aula28.questao07;

import java.util.LinkedList;

public class Album {
    private String nome;
    private int ano;
    private LinkedList<Musica> musicas = new LinkedList<>();
    private Artista artista;

    public Album(String nome, int ano) {
        if (nome.length() == 0){
            System.out.println("Nome do album invalido!");
        }else {
            this.nome = nome;
        }
        if (ano < 1928){
            System.out.println("Data invalida!");
        }else {
            this.ano = ano;
        }
    }
    public int getAno() {
        return ano;
    }
    public int getDuracao(){
        int total = 0;
        for (int i = 0; i < this.musicas.size(); i++){
            total += this.musicas.get(i).getDuracao();
        }
        return total;
    }
    public String maiorMusica(){
        int maior = 0;
        for (int i = 0; i < this.musicas.size(); i++){
            if (this.musicas.get(i).getDuracao() > maior){
                maior = this.musicas.get(i).getDuracao();
            }
        }
        return String.valueOf(maior);
    }
    public void addMusica(String nome, String autor, int duracao){

    }
    public String toString(){
        return "Nome do album: "
                + this.nome
                + "\n"
                + "Ano de lançamento: "
                + this.ano;
    }
}
