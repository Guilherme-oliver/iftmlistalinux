package aula31.questao01;

public class Vaca extends Animal{
    private String raca;

    public Vaca(String raca,String nome) {
        super(nome);
        this.raca = raca;
    }

    public String toString(){
        return "Raça da Vaca: " + this.raca
                + "\nNome da vaca: " + this.getNome();

    }

    @Override
    public void fala() {
        System.out.println(this.getNome() + ": Fala: Moooo");
    }

    @Override
    public void come() {
        System.out.println(this.getNome() + ": Come grama");
    }
}
