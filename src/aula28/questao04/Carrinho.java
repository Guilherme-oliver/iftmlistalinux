package aula28.questao04;

import java.util.LinkedList;

public class Carrinho {
    private static int idTotal = 0;
    private int id;
    private LinkedList<Produto> produto = new LinkedList<>();

    public Carrinho(){
        this.idTotal += 1;
        this.id = idTotal;
    }
    public int getNumProdutos(){
        return this.produto.size();
    }
    public double getPrecoTotal(){
        double total = 0;
        for (int i = 0; i < this.produto.size(); i++){
            total += this.produto.get(i).getPreco();
        }
        return total;
    }
    public void addProduto(Produto p){
        this.produto.add(p);
    }
    public void removeProduto(int pos){
        this.produto.remove(pos);
    }
    private int getPosProduto(String nome){
        for (int i = 0; i < this.produto.size(); i++){
            if (this.produto.get(i).getNome().equalsIgnoreCase(nome)){
                return i;
            }
        }
        return -1;
    }
    public void removeProduto(String nome){
        int posicao = getPosProduto(nome);
        if (posicao == -1){
            System.out.println("Não tem o produto");
        }else {
            this.produto.remove(posicao);
        }
    }

    public String toString(){
        String info = "";
        info += "\nInfo do carrinho:";
        info += "\nID: " + this.id;
        if (this.produto.size() == 0){
            info += "\nID NULO";
        }else {
            info += "\nTamanho do carrinho: " + this.produto.size();
            for (int i = 0; i < this.produto.size(); i++){
                info += "\nProduto: " + (i + 1) + this.produto.get(i).getNome();
            }
        }
        return info;
    }
}
