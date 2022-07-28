package lista31.questao01;

public class Leao extends Animal{
    private int peso;

    public Leao(int peso, String nome) {
        super(nome);
        this.peso = peso;
    }

    public String toString(){
        return "Nome do Leão: " + this.getNome()
                + "\nPeso: " + this.peso;
    }

    @Override
    public void fala() {
        System.out.println(this.getNome() + ": Fala: Roaaar");
    }

    @Override
    public void come() {
        System.out.println(this.getNome() + ": Come carne");
    }
}
