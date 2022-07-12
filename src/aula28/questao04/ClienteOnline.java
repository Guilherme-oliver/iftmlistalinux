package aula28.questao04;

import aula24.questao03.Poligono;

import java.util.LinkedList;

public class ClienteOnline {
    private String email;
    private double dinheiro;
    private int itenscomprados = 0;
    private Carrinho carrinho;

    public ClienteOnline(String email, double dinheiro) {
        if (email.length() == 0){
            System.out.println("Email invalido!");
        }else {
            this.email = email;
        }

        if (dinheiro < 0){
            System.out.println("Valor invalido!");
        }else {
            this.dinheiro = dinheiro;
        }

        this.carrinho = new Carrinho();
    }

    public void pegaProduto(Produto p){
        this.carrinho.addProduto(p);
    }

    public void tiraProduto(){
        int ultimaPosicao = this.carrinho.getNumProdutos();
        if (ultimaPosicao > 0){
            this.carrinho.removeProduto(ultimaPosicao -1);
        }
    }

    public void tiraProduto(String nome){
        if (nome != ""){
            this.carrinho.removeProduto(nome);
        }
    }

    public void esvaziaCarrinho(){
        this.carrinho = null;
        this.carrinho = new Carrinho();
        System.out.println("Carrinho foi esvaziado!" + this.email);
    }

    public void paga(){
        System.out.println(this.carrinho.getPrecoTotal());
        System.out.println(this.dinheiro);
        if (this.dinheiro < this.carrinho.getPrecoTotal()){
            System.out.println("Não pode efetuar a compra!");
        }else {
            this.dinheiro = this.dinheiro - this.carrinho.getPrecoTotal();
            this.itenscomprados = this.carrinho.getNumProdutos() + this.itenscomprados;
            esvaziaCarrinho();
            System.out.println("Compra realizada com sucesso!");
        }
    }

    public String toString(){
        String info = "";
        info += "\nInformações do Cliente: ";
        info += "\nEmail: " + this.email;
        info += "\nCarteira: " + this.dinheiro;
        info += "\nItens Comprados: " + this.itenscomprados;
        info += "\nQuantidades de produtos: " + this.carrinho.getNumProdutos();
        info += "\nPreço total: " + this.carrinho.getPrecoTotal();
        return info;
    }
}
