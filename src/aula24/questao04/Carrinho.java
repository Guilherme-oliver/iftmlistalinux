package aula24.questao04;
//Agregação: Multiplicidade 0..*;

import java.util.LinkedList;

public class Carrinho {
    private String dono;
    private LinkedList<Produto> produto = new LinkedList<>();

    public Carrinho(String dono) {
        if (dono.length() == 0){
            System.out.println("Nome invalido!");
        }else {
            this.dono = dono;
        }
    }

    public void addProduto(Produto produto){
        for (int i=0; i < this.produto.size(); i++){
            this.produto.add(produto);
        }
    }
    private int getNumProdutos(){
        for (int i=0; i<produto.size(); i++){
            System.out.println(produto);
        }
        return produto.size();
    }
    private double getPrecoTotal(){
        for (int i=0; i<produto.size(); i++){
            System.out.println(produto);
        }
        return produto.size();
    }
    public void removeProduto(){
        this.produto.remove();
    }
    public void removeProduto(int pos){
        if (pos < this.produto.size()){
            this.produto.remove(pos);
        }else {
            System.out.println("Posição invalida");
        }
    }
    public String toString(){
        return "Dono: "
                + dono
                + "\n"
                + "Preço total: "
                + getPrecoTotal()
                + "\n"
                + "Número de produtos: "
                + getNumProdutos();
    }

}
