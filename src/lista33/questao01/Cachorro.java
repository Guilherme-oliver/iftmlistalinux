package lista33.questao01;

public class Cachorro extends Animal{
    private String brinquedo;

    public Cachorro(String nome, String raca, String brinquedo) {
        super(nome, raca);
        if (brinquedo.length() == 0){
            System.out.println("Brinquedo invalido!");
        }else {
            this.brinquedo = brinquedo;
        }
    }

    public String toString(){
        return "Informações do cachorro: "
                + super.toString()
                + "\nBrinquedo: "
                + this.brinquedo;
    }

    @Override
    public void fala() {
        System.out.println(getNome() + ": Auau!");
    }
}
