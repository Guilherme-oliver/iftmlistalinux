package lista34.questao03;

public class RadioPilha implements Radio{
    private int estacao;
    private boolean ligado = false;

    public RadioPilha(int estacao, boolean ligado) {
        if (estacao < 87 || estacao > 108){
            System.out.println("Estação não existe!");
        }else {
            this.estacao = estacao;
        }

        this.ligado = ligado;
    }

    @Override
    public void liga() {
        if (ligado == false){
            ligado = true;
        }
    }

    @Override
    public void desliga() {
        if (ligado == true){
            ligado = false;
        }
    }

    @Override
    public void trocaEstacao(int frequencia) {
        if (ligado == false){
            System.out.println("-----");
        }else {
            if (frequencia >= 87 || frequencia <= 108){
                this.estacao = frequencia;
            }else {
                System.out.println("Fora do limite da frequencia!");
            }
        }
    }

    public String toString(){
        return "O radio está ligado: "
                + this.ligado
                +"\nEstação atual: "
                + this.estacao;
    }
}
