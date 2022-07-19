package aula33.questao01;

public class Gato extends Animal{
    private String olhos;

    public Gato(String nome, String raca, String olhos) {
        super(nome, raca);
        if (olhos.length() == 0){
            System.out.println("Invalido");
        }else {
            this.olhos = olhos;
        }
    }
    public String toString(){
        return "Informações do gato:"
                + super.toString()
                + "\nOlhos: "
                + this.olhos;
    }

    @Override
    public void fala() {
        System.out.println(getNome() + ": Miau");
    }
}
