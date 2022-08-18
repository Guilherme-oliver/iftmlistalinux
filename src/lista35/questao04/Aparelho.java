package lista35.questao04;

public abstract class Aparelho {
    private String marca;

    public Aparelho(String marca) {
        if (marca.length() == 0){
            System.out.println("Marca invalida");
        }else {
            this.marca = marca;
        }
    }

    public String toString(){
        return "Nome da marca: " + this.marca;
    }
}
