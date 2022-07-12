package aula27.questao03;

import java.util.LinkedList;

public class Visitante {
    private static int contadorTicket = 0;
    private int ticket = contadorTicket;
    private int voltas = 0;
    private CarrinhoMR carrinhoMR;

    public Visitante(){
    }

    public void entra(CarrinhoMR cmr){
        if (carrinhoMR != null){
            System.out.println("O carrinho já está cheio");
        }else {
            this.ticket++;
            this.carrinhoMR = cmr;
        }
    }

    public void sai(){
        if (this.carrinhoMR != null){
            this.voltas++;
            this.carrinhoMR.daVolta();
        }else {
            System.out.println("O carrinho já está vazio!");
        }
    }

    @Override
    public String toString() {
        return "Ticket: "
                + ticket
                + "\n"
                + "Voltas: "
                + voltas;
    }
}
