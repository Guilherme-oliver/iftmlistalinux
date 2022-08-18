package lista35.questao07;

public abstract class Ave {
    private String nome;
    private int peso;

    public Ave(String nome, int peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public abstract void emiteSom();

    public String toString(){
        String info = "";
        info += "\nNome: " + this.nome;
        info += "\nPeso: " + this.peso;
        return info;
    }

    public String getNome() {
        return nome;
    }

    public int getPeso() {
        return peso;
    }
}
