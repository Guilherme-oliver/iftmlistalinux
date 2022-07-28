package lista24.questao02;

public class Ovo {

    private int gemas;
    private boolean branco;

    public Ovo(int gemas, boolean branco){
        if (gemas >= 1){
            this.gemas = gemas;
        }else {
            System.out.println("Valor invalido!");
        }
        if (branco == true){
            this.branco = branco;
        }else {
            System.out.println("É vermelho");
        }
    }

    public String toString(){
        return "Quantidade de gemas"
                + gemas
                + "\n"
                + "É branco: "
                + branco;
    }

}
