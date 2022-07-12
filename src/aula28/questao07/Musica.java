package aula28.questao07;

public class Musica {
    private String nome;
    private String autor;
    private int duracao;
    private Album album;

    public Musica(String nome, String autor, int duracao) {
        if (nome.length() == 0){
            System.out.println("Nome da musica invalido!");
        }else {
            this.nome = nome;
        }

        if (autor.length() == 0) {
            System.out.println("Autor invalido!");
        }else {
            this.autor = autor;
        }

        if (duracao <= 1){
            System.out.println("Valor invalido!");
        }else {
            this.duracao = duracao;
        }
    }

    public int getDuracao() {
        return duracao;
    }

    public String toString(){
        return "Nome da música: "
                + this.nome
                + "\n"
                + "Nome do autor: "
                + this.autor
                + "\n"
                + "Duração da música: "
                + this.duracao;
    }
}
