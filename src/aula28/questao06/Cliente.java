package aula28.questao06;

import java.util.LinkedList;

public class Cliente {
    private String nome;
    private String rg;
    private LinkedList<Locacao> locacao = new LinkedList<>();

    public Cliente(String nome, String rg) {
        if (nome.length() == 0){
            System.out.println("Nome invalido!");
        }else {
            this.nome = nome;
        }
        if (rg.length() == 0){
            System.out.println("RG invalido!");
        }else {
            this.rg = rg;
        }
    }

    public String getNome() {
        return nome;
    }

    public void associaLocacao(Locacao l){
        this.locacao.add(l);
    }
    public Double totalGasto(){
        Double total = 0.0;
        for (int i = 0; i < this.locacao.size(); i++){
            total = this.locacao.get(i).getPreco();
        }
        return total;
    }

    public String toString(){
       String info = "";
       info += "\nInfo do CLiente: ";
       info += "\nNome: " + this.nome;
       info += "\nRG: " + this.rg;
       if (this.locacao.size() == 0){
           info += "\nNão Possui Locação";
       }else {
           info += "\nQuantidade de filmes locados " + this.locacao.size();
           for (int i = 0; i < this.locacao.size(); i++){
               info += "\nFilme " + i + ": " + this.locacao.get(i).toString();
           }
       }
       return info;
    }
}
