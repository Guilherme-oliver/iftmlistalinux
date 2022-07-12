package lista03.questao2TerceiraLista;

public class Programa02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.soma(7,8));
        System.out.println(calculadora.soma(1,2,3));
        System.out.println(calculadora.soma(7.5, 9.9));
        System.out.println();

        System.out.println(calculadora.subtrai(10, 5));
        System.out.println(calculadora.subtrai(25,3,14));
        System.out.println();

        System.out.println(calculadora.multiplica(11,38));
        System.out.println(calculadora.multiplica(14.89,53.67));
        System.out.println();

        System.out.println(calculadora.divide(70, 3));
        System.out.println(calculadora.divide(189.3,3.75));
        System.out.println();

        System.out.println(calculadora.potencia(45, 3));
        System.out.println(calculadora.potencia(19.72,2));
        System.out.println();

        System.out.println(calculadora.raizQuadrada(9));
        System.out.println(calculadora.raizQuadrada(12.5));

    }
}
