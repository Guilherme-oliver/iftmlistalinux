package lista26.questao01;
//Dependente
public class Controle {
    private String jogador;

    public Controle(String jogador) {
        if (jogador.length() == 0){
            System.out.println("Nome invalido");
        }else {
            this.jogador = jogador;
        }
    }
    public void apertaB(Personagem p){
        System.out.println("O jogador: " + this.jogador);
        p.pula();
    }
    public void apertaFrente(Personagem p){
        System.out.println("O jogador: " + this.jogador);
        p.corre();
    }
    public void apertaX(Personagem p){
        System.out.println("O jogador: " + this.jogador);
        p.atira();
    }
}
