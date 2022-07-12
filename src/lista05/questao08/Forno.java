package lista05.questao08;

public class Forno {

    private boolean ligado = false;
    private boolean aberto;
    private int capacidade;
    private int paes = 0;
    private boolean assados = false;

    public Forno(){

    }

    public Forno(boolean aberto, int capacidade) {

        if (capacidade <= 0){
            System.out.println("Valor invalido!");
        }else {
            this.capacidade = capacidade;
        }

        this.aberto = aberto;
    }

    public String toString(){
        return "O forno está ligado: "
                + ligado
                + "\n"
                + "O forno está aberto: "
                + aberto
                + "\n"
                + "Capacidade do forno: "
                + capacidade
                + "\n"
                + "Quantos pães estão no forno: "
                + paes
                + "\n"
                + "Os pães estão assados: "
                + assados;
    }

    public void liga(){
        if (aberto){
            System.out.println("O forno não pode ser ligado!");
        }else {
            if (paes <= 0){
                System.out.println("O forno não pode ser ligado!");
            }else {
                if (assados == true){
                    System.out.println("O forno não pode ser ligado!");
                }else {
                    ligado = true;
                }
            }
        }

    }
    public void desliga(){
        ligado = false;
        if (ligado == false){
            assados = true;
        }
    }
    public void abrePorta(){
       if (aberto){
          if (ligado){
              aberto = true;
          }else {
              aberto = true;
              System.out.println("O padeiro se queimou!");
          }
       }

    }
    public void fechaPorta(){
      if (aberto == true){
          if (ligado == true){
              System.out.println("O forno está ligado, não pode ser fechado");
          }else {
              aberto = false;
          }
      }
    }
    public void colocaPao(){
        if (assados == true){
            System.out.println("Tem pães assados no forno, não pode misturar!");
        }else {
            if (paes > 0 && paes <= capacidade){
                if (ligado){
                    if (paes > 0 && paes <= capacidade){
                        System.out.println("Pães foram colocados para assar!");
                    }else {
                        System.out.println("Valor invalido!");
                    }
                }else {
                    System.out.println("Os pães ainda não estão prontos");
                }
            }else {
                System.out.println("Valores invalidos!");
            }
        }
    }

    public void retiraPao(){
       if (assados){
           System.out.println("Ainda não estão assados!");
       }else {
           paes--;
       }
    }

    public void retiraPao(int paes){
       if (paes <= capacidade && paes > 0){
           if (assados){
               System.out.println("Ainda não estão assados!");
           }else {
               do {
                   retiraPao();
                   paes--;
               }while (paes >= 0);
           }
       }else {
           System.out.println("Valor invalido!");
       }
    }

    public void descarrega(){
        if (paes <= 0){
            System.out.println("Forno já está vazio");
        }else {
            retiraPao(capacidade);
        }
    }
}
