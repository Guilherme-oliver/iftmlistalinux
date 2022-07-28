package lista25.questao03;

import java.util.LinkedList;

//Composição: Multiplicidade 1..*
public class Livro {
    private String titulo;
    private String autor;
    private LinkedList<Capitulo> capitulos = new LinkedList<>();


    public Livro(String titulo, String autor) {
        if (titulo.length() == 0){
            System.out.println("Nome invalido!");
        }else {
            this.titulo = titulo;
        }
        if (autor.length() == 0){
            System.out.println("Nome invalido!");
        }else {
            this.autor = autor;
        }
        this.addCapitulo(titulo);
    }
    public void addCapitulo(String conteudo){
        Capitulo cap = new Capitulo(conteudo);
        this.capitulos.add(cap);
    }
    public void removeCapitulo(int i){
        if (i < this.capitulos.size()){
            this.capitulos.remove(i);
        }else {
            System.out.println("Posição invalida!");
        }
    }
    public String toString(){
        return "Autor: "
                + this.autor
                + "\n"
                + "Titulo: "
                + this.titulo
                + "\n"
                + "Conteudo: "
                + this.capitulos.toString();
    }
}
