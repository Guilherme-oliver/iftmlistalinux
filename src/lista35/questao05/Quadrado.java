package lista35.questao05;

public class Quadrado implements Figura2D{
    private double lado;

    public Quadrado(double lado) {
        if (lado <= 0){
            System.out.println("Valor invalido");
        }else {
            this.lado = lado;
        }
    }
    @Override
    public String toString(){
        return "Lado do quadrado: " + lado
                + "\nÁrea do quadrado: " + calcArea();
    }
    @Override
    public double calcArea(){
        return lado * lado;
    }

    public double getLado() {
        return lado;
    }
}
