package aula28.questao01;

public class Heroi {
    private String nome;
    private int vida;
    private boolean vivo = true;
    private int vitimas = 0;
    private Arma arma;

    public Heroi(String nome, int vida, Arma arma) {
        if (nome.length() == 0){
            System.out.println("Nome invalido!");
        }else {
            this.nome = nome;
        }
        if (vida <= 0){
            System.out.println("Heroi está morto");
        }else {
            this.vida = vida;
        }
        if (arma.getAtaque() < 0){
            System.out.println("Ataque invalido");
        }else {
            this.arma = arma;
        }
    }
    public String getNome() {
        return this.nome;
    }
    public void trocaArma(Arma arma){
        if (this.arma == arma){
            System.out.println("Erro, é a mesma arma");
        }else {
            this.arma = arma;
        }
    }
    public void cura(int v){
        if (v < 0){
            System.out.println("Valor de cura invalido!");
        }else {
            this.vida += v;
        }
    }
    public void ataca(Monstro m){
        if (this.vida <= 0){
            System.out.println("Heroi morreu");
        } else if (m.estaVivo() == false) {
            System.out.println("Monstro já está morto");
        }else {
            m.diminuiVida(arma.getAtaque());
            if (m.estaVivo()){
                this.vida = vida - m.getAtaque();
            }else {
                this.vitimas++;
            }
        }
    }
    public String toString(){
        return "Nome do Heroi: "
                + this.nome
                + "\n"
                + "Pontos de vida: "
                + this.vida
                + "\n"
                + "Está vivo: "
                + this.vivo
                + "\n"
                + "Número de vitimas: "
                + this.vitimas;
    }
}
