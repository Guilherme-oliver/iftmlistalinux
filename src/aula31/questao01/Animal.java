package aula31.questao01;

public abstract class  Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }
    public String toString(){
        return "Nome: " + this.nome;
    }
    public abstract void fala();
    public abstract void come();
    public String getNome() {
        return nome;
    }
}
