package lista35.questao06;

public abstract class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String toString(){
        String info = "";
        info += "\nNome: " + this.nome;
        info += "\nIdade: " + this.idade;
        return info;
    }

    public abstract void seApresenta();
}
