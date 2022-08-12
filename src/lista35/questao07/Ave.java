package lista35.questao07;

public class Ave {
    private String nome;
    private int peso;

    public Ave(String nome, int peso) {
        if (nome.length() == 0){
            this.nome = nome;
        }
        this.peso = peso;
    }

    public void emiteSom(){

    }

    public String toString(){
        String info = "";
        info += "Nome: " + this.nome;
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
