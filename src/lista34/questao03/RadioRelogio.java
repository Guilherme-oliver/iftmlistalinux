package lista34.questao03;

public class RadioRelogio implements Relogio,Radio{
    private int horas;
    private int minutos;
    private int estacao;
    private boolean ligado = false;

    public RadioRelogio(int horas, int minutos, int estacao, boolean ligado) {
        if (horas > 23 || horas < 0){
            System.out.println("Horas incompativel!");
        }else {
            this.horas = horas;
        }

        if (minutos < 0 || minutos > 59){
            System.out.println("Minutos incompativel!");
        }else {
            this.minutos = minutos;
        }

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

    @Override
    public void avancaMinuto() {
        if (ligado == false){
            System.out.println("-----");
        }else {
            if (this.minutos >= 59){
                this.minutos = 0;
                this.horas++;
            }else {
                this.minutos++;
            }
        }
    }

    @Override
    public void avancaHora() {
        if (ligado == false){
            System.out.println("-----");
        }else {
            if (this.minutos < 59){
                this.minutos++ ;
            }else if (this.minutos == 59){
                this.minutos = 0 ;
                if (this.horas < 24){
                    this.horas++;
                }else if (this.horas >= 24){
                    this.horas = 0 ;
                }
            }
        }
    }

    public String toString(){
        return "O radio está ligado: "
                + this.ligado
                +"\nEstação atual: "
                + this.estacao
                + "\nHoras: " + horas + " Minutos " + minutos;
    }
}
