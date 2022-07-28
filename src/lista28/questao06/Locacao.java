package lista28.questao06;

import java.util.LinkedList;

public class Locacao {
    private int dias;
    private static double preco = 5.5;
    private Cliente cliente;
    private LinkedList<Filme> filme = new LinkedList<>();

    public Locacao(int dias, Cliente cliente, Filme filme) {
        if (dias < 0){
            System.out.println("Valor invalido!");
        }else {
            this.dias = dias;
        }
        this.cliente = cliente;
        this.filme.add(filme);
    }
    public double getPreco() {
        if (this.dias > 1){
            return this.preco * this.dias;
        }else {
            return this.preco;
        }
    }
    public void addFilme(Filme f){
        this.filme.add(f);
    }
    public void removeFilme(){
        this.filme.removeLast();
    }
    public void removeFilme(Filme f){
        this.filme.remove(f);
    }
    public String toString(){
        String info = "";
        info += "\nInfo da locação: ";
        info += "Número de dias: " + this.dias;
        info += "\nPreço por dia: " + this.getPreco();
        if (this.filme.size() == 0){
            info += "\nNão há filmes locados";
        }else {
            info += "\nQuantidade de filme(s) locado(s): " + this.filme.size();
            for (int i = 0; i < this.filme.size(); i++){
                info += "\nFilme " + i + ": " + this.filme.get(i).toString();
            }
        }
        return info;
    }
}
