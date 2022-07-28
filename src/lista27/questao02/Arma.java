package lista27.questao02;
//Associação – 1 para 0..1
public class Arma {
    private String id;
    private int bolas;
    private Jogador jogador;

    public Arma(String id, int bolas) {
        if (id.length() == 0){
            System.out.println("Id Invalido!");
        }else {
            this.id = id;
        }
        if (bolas < 0){
            System.out.println("Valor invalido");
        }else {
            if (bolas == 0){
                System.out.println("Acabou as bolas");
            }else {
                this.bolas = bolas;
            }
        }
    }
    public boolean temJogador(){
        if (this.jogador != null){
            System.out.println("Tem jogador");
            return true;
        }else {
            System.out.println("Não tem jogador");
            return false;
        }
    }
    public void associaJogador(Jogador j){
        this.jogador = j;
    }
    public boolean estaVazio(){
        if (this.bolas == 0){
            System.out.println("Está vazio");
            return true;
        }else {
            System.out.println("Tem bola(s) ainda");
            return false;
        }
    }
    public void addBolas(int bolas){
        if (bolas < 0){
            System.out.println("Valor invalido!");
        }else {
            this.bolas += bolas;
        }
    }
    public boolean removeBola(){
        if (this.bolas == 0){
            System.out.println("Já está vazio");
            return false;
        }else {
            System.out.println("Removendo uma bola");
            bolas--;
            return true;
        }
    }

    @Override
    public String toString() {
        return "Jogador: "
                + jogador
                + "\n"
                + "ID: "
                + id
                + "\n"
                + "Bolas: "
                + bolas;
    }
}
