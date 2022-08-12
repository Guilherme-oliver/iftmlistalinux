package lista35.questao01;

public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        if (nome.length() == 0){
            System.out.println("Nome Invalido!");
        }else {
            this.nome = nome;
        }
    }

    public String toString(){
        return "Nome: " + this.nome;
    }

    public String getNome(){
        return this.nome;
    }
}
