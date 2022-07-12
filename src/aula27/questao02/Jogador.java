package aula27.questao02;

import aula27.questao01.Arquivo;

//Associação – 1 para 0..1
public class Jogador {
    private String nome;
    private Arma arma;

    public Jogador(String nome, Arma arma) {
        if (nome.length() == 0){
            System.out.println("Nome invalido!");
        }else {
            this.nome = nome;
        }
        if (this.arma == null){
            System.out.println("Erro");
        }else {
            this.arma = arma;
        }
    }

    public String getNome() {
        return nome;
    }
    public void recarrega(int bolas){
        if (arma.estaVazio() == true){
            recarrega(bolas);
        }else {
            System.out.println("Ainda não pode recarregar!");
        }
    }
    public void atira(){
        if (arma.estaVazio() != true){
            System.out.println("Pow!");
            arma.removeBola();
        }else {
            System.out.println("Sem munição");
        }
    }

    @Override
    public String toString() {
        return "Nome: "
                + nome
                + "\n";
    }
}
