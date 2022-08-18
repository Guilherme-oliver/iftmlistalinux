package lista35.questao01;

public abstract class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        if (nome.length() == 0){
            System.out.println("Nome Invalido!");
        }else {
            this.nome = nome;
        }
    }

    public abstract String toString();

    public String getNome(){
        return this.nome;
    }
}
