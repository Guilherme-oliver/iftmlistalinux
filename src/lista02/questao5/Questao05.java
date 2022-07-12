package lista02.questao5;

public class Questao05 {
    public static void main(String[] args) {

        Calculadora calculadora1 = new Calculadora();
        Calculadora calculadora2 = new Calculadora();

        calculadora1.setOp(3);
        calculadora1.setOp01(5);
        calculadora1.setOp02(8);
        calculadora1.MostraInfo();

        calculadora2.setOp(5);
        calculadora2.setOp01(9);
        calculadora2.setOp02(10);
        calculadora2.MostraInfo();



    }
}
