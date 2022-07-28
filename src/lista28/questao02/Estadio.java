package lista28.questao02;

public class Estadio {
    private String cidade;
    private String pais;
    private int capacidade;

    public Estadio(String cidade, String pais, int capacidade) {
        if (cidade.length() == 0){
            System.out.println("Cidade invalida!");
        }else {
            this.cidade = cidade;
        }
        if (pais.length() == 0){
            System.out.println("País Invalido!");
        }else {
            this.pais = pais;
        }
        if (capacidade <= 0){
            System.out.println("Valor invalido!");
        }else {
            this.capacidade = capacidade;
        }
    }

    public int getCapacidade() {
        return capacidade;
    }

    public String toString(){
        return "Nome da cidade: "
                + this.cidade
                + "\n"
                + "Nome do país: "
                + this.pais
                + "\n"
                + "Capacidade do estadio: "
                + this.capacidade;
    }
}
