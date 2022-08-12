package lista35.questao07;

public class Galinha extends Ave{
    private String cor;

    public Galinha(String nome, int peso, String cor) {
        super(nome, peso);
        if (cor.length() == 0){
            System.out.println("Cor invalida!");
        }else {
            this.cor = cor;
        }
    }

    @Override
    public String toString(){
        String info = "";
        info += "Nome: " + super.getNome();
        info += "\nPeso: " + super.getPeso();
        info += "\nCor: " + this.cor;
        return info;
    }

    @Override
    public void emiteSom(){
        System.out.println("Cocorico" + "\n" + toString());
    }
}
