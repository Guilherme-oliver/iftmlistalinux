package aula24.questao05;

public class Ponto {
    private int x, y;
    public Ponto(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString(){
        return "X: "
                + x
                + "\n"
                + "Y: "
                + y;
    }
}
