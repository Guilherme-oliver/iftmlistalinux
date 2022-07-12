package lista04.questao6;

public class RadioRelogio {
    int horas;
    int minutos;
    int estacao;
    boolean ligado = false;

    RadioRelogio(){
    }
    public RadioRelogio(int horas, int minutos, int estacao) {
        this.horas = horas;
        this.minutos = minutos;
        this.estacao = estacao;
    }
    void avancaHora(){
        if (horas < 24){
            horas += horas + 1;
        }else if (horas == 24){
            horas = 0 ;
        }
    }
    void avancaMinuto(){
        if (minutos < 59){
            minutos += minutos + 1;
        }else if (minutos == 59){
            minutos = 0 ;
            horas = horas + 1;
        }
        if (horas < 24){
            horas += horas + 1;
        }else if (horas >= 24){
            horas = 0 ;
        }
    }
    void liga(){
       if (ligado == true){
           System.out.println("Já está desligado");
       }else if (ligado == false){
           ligado = true;
           System.out.println("Ligando...");
       }
    }
    void desliga(){
        if (ligado == false){
            System.out.println("...");
        }else if (ligado == true){
            System.out.println("Desligando...");
            ligado = false;
        }
    }
    void trocaEstacao(int estacao){
        this.estacao = estacao;
        if (estacao < 108 && estacao >= 87){
            this.estacao += estacao + 1;
        }else if (estacao > 108){
            this.estacao += 87;
        }else if (estacao < 87){
            this.estacao = 108;
        }

    }
    void mostraInfo(){
        if (ligado == true){
            if (estacao > 108 && estacao < 87){
                System.out.println("Erro de frequencia");
            }
            System.out.println("Horas: " + horas + ":" + minutos + "\n" + "Estamos na estação: " + estacao);
        }else {
            System.out.println("...");
        }
    }
}
