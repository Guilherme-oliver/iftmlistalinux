package lista35.questao04;

public class CDPlayer extends Aparelho implements ExecutaCD {
    private int cds = 0;

    public CDPlayer(String marca, int cds) {
        super(marca);
        this.cds = cds;
    }

    public String toString(){
        String info = "";
        info += "Marca: " + super.toString();
        info += "\nCDS rodados: " + this.cds;
        return info;
    }

    @Override
    public void executa(CD cd) {
        cd.roda();
        this.cds++;
    }
}
