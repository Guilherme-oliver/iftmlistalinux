package aula26.questao01;
//Independente
public class Personagem {
    private String nome;

    public Personagem(String nome) {
        if (nome.length() == 0){
            System.out.println("Nome invalido");
        }else {
            this.nome = nome;
        }
    }
    public void pula(){
        System.out.println(this.nome +": pulou");
    }
    public void atira(){
        System.out.println(this.nome +": atirou");
    }
    public void corre(){
        System.out.println(this.nome + ": correu");
    }
}
