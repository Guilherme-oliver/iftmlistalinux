package lista05.questao07;

public class Elevador {
    private int andarAtual = 0;
    private int andares;
    private int subsolo;
    private int capacidade;
    private int pessoas = 0;

    public Elevador(){

    }

    public Elevador(int andares, int subsolo, int capacidade) {
       if (andares <= 0){
           System.out.println("Valor invalido!");
       }else {
           this.andares = andares;
       }
       if (subsolo <= 0){
           System.out.println("Valores invalidos!");
       }else {
           this.subsolo = subsolo;
       }
       if (capacidade <= 3){
           System.out.println("Valores invalidos!");
       }else{
           this.capacidade = capacidade;
       }

    }

    private String getAndar(){
       if (andarAtual > 0){
           return andarAtual + " Andar";
       }else {
           if (andarAtual == 0){
               return "Terreo";
           }
           return "Subsolo" + andarAtual * -1;
       }
    }
    public String toString(){
        return "Andar atual"
                + andarAtual
                + "\n"
                + "Pessoas dentro do elevador: "
                + pessoas
                + "\n"
                + "Capacidade total do elevador: "
                + capacidade;
    }
    public void entra(){
        if (capacidade < 0){
            System.out.println("Erro de leitura");
        }
        else if (capacidade == pessoas){
            System.out.println("Capacidade maxima atingida, número de pessoas:" + pessoas);
        }else {
            pessoas++;
            System.out.println("Quantidade de pessoas atual:" + pessoas);
        }
    }
    public void entra(int pessoas){
        if (capacidade < 0){
            System.out.println("Erro de leitura");
        }
        else if (capacidade == this.pessoas){
            System.out.println("Capacidade maxima atingida, número de pessoas:" + this.capacidade);
        }else {
            this.pessoas += pessoas;
            System.out.println("Quantidade de pessoas atual:" + this.pessoas);
        }
    }
    public void sai(){
        if (pessoas > 0){
            this.pessoas--;
            System.out.println("Quantidade atual de pessoas:" + pessoas );
        }else {
            System.out.println("Não tem pessoas no elevador!");
        }
    }
    public void sai(int pessoas){
       if (pessoas > 0 && pessoas <= this.pessoas){
           do {
               sai();
               pessoas--;
           }while (pessoas > 0);
       }else {
           System.out.println("Quantidade de pessoas invalido!");
       }
    }
    public void sobe(){
       if (andarAtual < andares){
           andarAtual++;
           System.out.println("Subiu até: " + getAndar());
       }

    }
    public void desce(){
       if (andarAtual < subsolo){
           andarAtual--;
           System.out.println("Desceu até: " + getAndar());
       }
    }
    public void mudaAndar(int andar){
        if (andar > 0){
            System.out.println(getAndar());
            do {
                sobe();
                andar--;
            }while (andar > 0);
        }else {
            System.out.println(getAndar());
            do {
                desce();
                andar++;
            }while (andar < 0);
        }

    }

}
