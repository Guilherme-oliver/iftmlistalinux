package aula28.questao02;

public class JogosTenis {
    private String data;
    private int publico;
    private Jogador jogador1, jogador2 = null;
    private Estadio estadio;

    public JogosTenis(String data, Jogador j1, Jogador j2, Estadio estadio){
        if (data.length() == 0){
            System.out.println("Data invalida!");
        }else {
            this.data = data;
        }

        this.jogador1 = j1;

        this.jogador2 = j2;

        if (publico > estadio.getCapacidade() || publico < 0){
            System.out.println("Valor da capacidade invalido");
        }else {
            this.estadio = estadio;
        }
    }

    public boolean isVencedor(Jogador j){
        if (this.jogador1 == j){
            return true;
        }else {
            return false;
        }
    }

    public void defineVencendor(int n){
        if(n == 1){
            isVencedor(this.jogador1);
        }else if (n == 2){
            isVencedor(this.jogador2);
        }else {
            System.out.println("jogador invalido!");
        }

    }

    public String toString(){
        return "Data: "
                + data
                + "\n"
                + "Publico: "
                + this.publico;
    }

}
