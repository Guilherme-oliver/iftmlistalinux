package aula24.questao03;
//Agregação: Multiplicidade 1..*

import java.util.LinkedList;

public class Poligono {

    private String nome;
    private LinkedList<Vertice> vertices = new LinkedList<>();

    public Poligono(String nome, Vertice origem) {
        this.nome = nome;
        this.vertices.add(origem);
    }

    public void addVertice(Vertice origem){
        this.vertices.add(origem);
    }
    public void removeVertice(int x, int y){
        this.vertices.remove(x);
        this.vertices.remove(y);
    }
    public int getLados(){
        this.vertices.getFirst().getY();
        return this.vertices.getFirst().getX();
    }
    public double calcPerimetro(){
        return vertices.getFirst().getX() * vertices.getFirst().getX();
    }
    public String toString(){
        return "Lado x: "
                + this.vertices.getFirst().getX()
                + "\n"
                + "Lado y: "
                + this.vertices.getFirst().getY()
                + "\n"
                + "Calculo do perimetro: "
                + calcPerimetro();

    }
}
