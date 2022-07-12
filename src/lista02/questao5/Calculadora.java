package lista02.questao5;

public class Calculadora {
    double soma;
    double subtrai;
    double multiplica;
    double divide;
    int potencia;
    double raizQuadrada;
    int  op01, op02;
    double op;

    public Calculadora(){

    }

    public Calculadora(double soma, double subtrai, double multiplica, double divide, int potencia, double raizQuadrada) {
        this.soma = soma;
        this.subtrai = subtrai;
        this.multiplica = multiplica;
        this.divide = divide;
        this.potencia = potencia;
        this.raizQuadrada = raizQuadrada;
    }

    public void setOp(int op) {
        this.op = op;
    }

    public void setOp01(int op01) {
        this.op01 = op01;
    }

    public void setOp02(int op02) {
        this.op02 = op02;
    }

    public int Soma(){
        return  op01 + op02;
    }

    public int Subtrai(){
        return op01 - op02;
    }

    public double Multiplica(){
        return op01 * op02;
    }

    public double Divide(){
        return op01 / op02;
    }

    public double RaizQuadrada(){
        return Math.sqrt(op);
    }

    public double Potencia(){
        return Math.pow(op, 2);
    }

    public void MostraInfo(){
        System.out.println("Soma de: " + this.op01 + " + " + this.op02 + " = " + this.Soma());
        System.out.println("Subtrai de: " + this.op01 + " - " + this.op02 + " = " + this.Subtrai());
        System.out.println("Multiplica: " + this.op01 + " * " + this.op02 + " = " + this.Multiplica());
        System.out.println("Divide: " + this.op01 + " / " + this.op02 + " = " + this.Divide());
        System.out.println("Raiz Quadrada de: " + this.op + " = " +this.RaizQuadrada());
        System.out.println("Potencia de: " + this.op + " = " + this.Potencia());
    }
}
