package aula28.questao02;

import java.util.LinkedList;

public class Jogador {
    private String nome;
    private String patrocinador;
    private LinkedList<JogosTenis> jogo = new LinkedList<>();

    public Jogador(String nome, String patrocinador) {
        if (nome.length() == 0){
            System.out.println("Nome do jogador invalido!");
        }else {
            this.nome = nome;
        }
        if (patrocinador.length() == 0){
            System.out.println("Patrocinador invalido!");
        }else {
            this.patrocinador = patrocinador;
        }
    }

    public void associaJogo(JogosTenis j){
        this.jogo.add(j);
    }

    public String getNome() {
        return nome;
    }


    public String toString(){
        return "Nome do jogador: "
                + this.nome
                + "\n"
                + "Patrocinador: "
                + this.patrocinador
                + "\n";

    }
}
