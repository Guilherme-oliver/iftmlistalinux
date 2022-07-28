package lista24.questao01;

public class Chip {
    private String operadora;
    private String numero;

    public Chip(String operadora, String numero){
        if (operadora.length() == 0 || operadora == null){
            System.out.println("Operadora invalido!");
        }else {
            this.operadora = operadora;
        }
        if (numero.length() == 10){
            this.numero = numero;
        }else {
            System.out.println("Numero invalido");
        }
    }
    public String toString(){
        return "Operadora"
                + operadora
                + "\n"
                + "Número"
                + numero;
    }
}
