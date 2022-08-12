package lista35.questao04;

public class Combo extends Aparelho implements ExecutaDVD, ExecutaCD {
    private int midias = 0;

    public Combo(String marca, int midias) {
        super(marca);
        this.midias = midias;
    }


    public String toString(){
        String info = "";
        info += "Marca: " + super.toString();
        info += "\nMidias: " + this.midias;
        return info;
    }

    @Override
    public void executa(CD cd) {
        cd.roda();
        this.midias++;
    }

    @Override
    public void executa(DVD dvd) {
        dvd.roda();
        this.midias++;
    }
}
