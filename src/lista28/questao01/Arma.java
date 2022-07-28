package lista28.questao01;

public class Arma {
    private String nome;
    private String tipo;
    private int ataque;

    public Arma(String nome, String tipo, int ataque) {
        if (nome.length() == 0){
            System.out.println("Nome invalido!");
        }else {
            this.nome = nome;
        }
        if (tipo.length() == 0){
            System.out.println("Tipo invalido!");
        }else {
            this.tipo = tipo;
        }
        if (ataque < 0){
            System.out.println("Valor de ataque invalido!");
        }else {
            this.ataque = ataque;
        }
    }

    public int getAtaque() {
        return this.ataque;
    }

    public String toString(){
        return "Nome da espada: "
                + this.nome
                + "\n"
                + "Tipo da arma: "
                + this.tipo
                + "\n"
                + "Valor de ataque: "
                + this.ataque;
    }
}
