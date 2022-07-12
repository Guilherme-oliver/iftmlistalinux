package aula25.questao01;
//Composição: Multiplicidade 0..1
public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        if (nome.length() == 0){
            System.out.println("Nome invalido!");
        }else {
            this.nome = nome;
        }
    }
    public String toString(){
        return nome;
    }
}
