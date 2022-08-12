package lista35.questao04;

public class DVDPlayer extends Aparelho implements ExecutaDVD{
    private int dvds = 0;

    public DVDPlayer(String marca, int dvds) {
        super(marca);
        this.dvds = dvds;
    }

    public String toString(){
        String info = "";
        info += "Marca: " + super.toString();
        info += "\nMidias: " + this.dvds;
        return info;
    }

    @Override
    public void executa(DVD dvd) {
        dvd.roda();
        this.dvds++;
    }
}
