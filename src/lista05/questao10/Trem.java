package lista05.questao10;

public class Trem {
    private String nome;
    private int estacaoatual = 0;
    private int estacaofinal;
    private int cabines;
    private int pessoas;
    private boolean indo = true;

    public Trem() {

    }

    public Trem(String nome, int estacaofinal, int cabines) {
       if (nome == " "){
           System.out.println("Nome invalido!");
       }else {
           this.nome = nome;
       }
       if (estacaofinal <= 0 && estacaofinal > 4){
           System.out.println("Valor invalido");
       }else {
           this.estacaofinal = estacaofinal;
       }
       if (cabines < 2){
           System.out.println("Valor invalido");
       }else {
           this.cabines = cabines;
       }
    }

    private String infoEstacao(int estacao) {
        if (estacao == 0) {
            return estacao + " - Luz";
        } else if (estacao == 1) {
            return estacao + " - Prefeitura";
        } else if (estacao == 2) {
            return estacao + " - Moema";
        } else if (estacao == 3) {
            return estacao + " - Barra";
        } else if (estacao == 4) {
            return estacao + " - Copacabana";
        } else {
            return "Invalido";
        }

    }

    private String infoCap() {
        return  "São " + cabines + " cabine no trem, com capacidade de" + pessoas + " pessoas por cabine, o total de pessoas: " + (cabines * pessoas);
    }

    public String toString() {
        return "Nome do trem: "
                + nome
                + "\n"
                + "Estação: "
                + estacaoatual
                + "\n"
                + "Quantidade de cabines no trem: "
                + cabines
                + "\n"
                + "Número de pessoas: "
                + pessoas
                + "\n"
                + "Capacidade total de pessoas no trem: "
                + pessoas * cabines;
    }

    public void entra() {
        pessoas = pessoas + 1;
        System.out.println("Uma pessoa entrou no trem " + "\n" + "Quantidade de pessoas: " + pessoas + "\n" + "Quantidade de cabines: " + cabines + "\n" + "Capacidade do trem: " + infoCap());
    }

    public void sai() {
        pessoas = pessoas - 1;
        System.out.println("Uma pessoa entrou no trem " + "\n" + "Quantidade de pessoas: " + pessoas + "\n" + "Quantidade de cabines: " + cabines + "\n" + "Capacidade do trem: " + infoCap());
    }

    private void trocaSentido() {
        if (indo == false && estacaoatual == 0 ){
            indo = true;
        }else if (indo == true && estacaoatual == estacaofinal){
            indo = false;
        }else{
            System.out.println("Não dá para trocar sentido");
        }
    }

    public void avancaEstacao() {

        if (indo){
            if (estacaoatual == estacaofinal){
                trocaSentido();
                estacaoatual--;
                System.out.println(infoEstacao(estacaofinal)+ "Andou até " + infoEstacao(estacaoatual));
            }else {
                estacaoatual++;
                System.out.println(infoEstacao(estacaoatual));
            }
        }else {
            if (estacaoatual == 0){
                trocaSentido();
                estacaoatual++;
                System.out.println(infoEstacao(0)+ "Andou até " + infoEstacao(estacaoatual));
            }else {
                estacaoatual--;
                System.out.println(infoEstacao(estacaoatual));
            }
        }

    }

    public void avancaEstacao(int estacao) {

      if (estacao < 0 || estacao > estacaofinal){
          System.out.println("Estação é invalida!");
      }else {
          if (estacaoatual == estacao){
              System.out.println("Já estamos na estação atual!");
          }else {
              do {
                  avancaEstacao();
                  estacao--;
              }while (estacao > 0 );
          }
      }

    }


}
