package aula24.questao01;
// Agregação: Multiplicidade 0..1;

public class Celular {

    private String marca;
    private String modelo;
    private Chip c;

    public Celular(String marca, String modelo) {
        if (marca.length() == 0){
            System.out.println("Marca invalida");
        }else {
            this.marca = marca;
        }
        if (modelo.length() == 0){
            System.out.println("Modelo invalido");
        }else {
            this.modelo = modelo;
        }
    }

    public void colocaChip(Chip c){
        if (this.c == null){
            this.c = c;
        }else {
            System.out.println("Já possui chip!");
        }
    }
    public void removeChip(){
        if (this.c != null){
            this.c = null;
        }else {
            System.out.println("Celular sem chip!");
        }

    }
    public String toString(){
        return "Marca do celular"
                + marca
                + "\n"
                + "Modelo"
                + modelo
                + "\n";
    }
}
