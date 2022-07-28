package lista28.questao01;

public class Monstro {
    private String nome;
    private int vida;
    private int ataque;
    private Heroi algoz = null;

    public Monstro(String nome, int vida, int ataque) {
        if (nome.length() == 0){
            System.out.println("Nome invalido!");
        }else {
            this.nome = nome;
        }
        if (vida < 0){
            System.out.println("Valor de vida invalido!");
        }else {
            this.vida = vida;
        }
        if (ataque < 0){
            System.out.println("Valor de ataque invalido!");
        }else {
            this.ataque = ataque;
        }
    }
    public boolean estaVivo(){
        if (this.vida > 0 ){
            return true;
        }else {
            return false;
        }
    }
    public boolean diminuiVida(int v){
        if (this.vida <= v){
            this.vida = this.vida - v;
            return true;
        }else {
            this.vida = this.vida -v;
            return false;
        }
    }
    public int getAtaque() {
        return ataque;
    }
    public void setAlgoz(Heroi algoz) {
        if (this.vida <= 0){
            System.out.println("Monstro morreu");
            this.algoz = algoz;
        }
    }
    public String toString(){
        return "Nome: "
                + this.nome
                + "\n"
                + "Vida: "
                + this.vida
                + "\n"
                + "Pontos de ataque: "
                + this.ataque
                + "\n"
                + "Algoz: "
                + this.algoz;
    }
}
