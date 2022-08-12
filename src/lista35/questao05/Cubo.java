package lista35.questao05;

public class Cubo implements Figura3D{
    private Quadrado base;

    public Cubo(Quadrado base) {
        this.base = base;
    }

    @Override
    public String toString(){
        return "Lado do cubo: " + this.base.getLado()
                + "\nVolume do cubo: " + calcVolume()
                + "\nÁrea da base: " + calcAreaBase();
    }
    @Override
    public double calcVolume(){
        return this.base.getLado() * this.base.getLado() * this.base.getLado();
    }
    @Override
    public double calcAreaBase(){
        return this.base.getLado() * this.base.getLado();
    }
}
