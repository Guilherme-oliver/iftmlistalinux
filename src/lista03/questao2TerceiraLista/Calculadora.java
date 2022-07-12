package lista03.questao2TerceiraLista;

public class Calculadora {

    int soma(int op1, int op2){
        return op1 + op2;
    }
    int soma(int op1, int op2, int op3){
        return op1 + op2 + op3;
    }
    double soma(double op1, double op2){
        return op1 + op2;
    }
    int subtrai(int op1, int op2){
        return op1 - op2;
    }
    double subtrai(double op1, double op2, double op3){
        return op1 - op2 - op3;
    }
    int multiplica(int op1, int op2){
        return op1 * op2;
    }
    double multiplica(double op1, double op2){
        return op1 * op2;
    }
    double divide(double dividendo, double divisor){
        return dividendo % divisor;
    }
    int divide(int dividendo, int divisor){
        return dividendo % divisor;
    }
    int potencia(int base, int exp){
        for (int i = 1; i<=base; i++){
            exp = i;
        }
        return exp;
    }
    double potencia(double base, double exp){
        for (int i = 1; i<=base; i++){
            exp = i;
        }
        return base * exp;
    }
    double raizQuadrada(int op){
        if (op <= 0){
            System.out.print("Erro!");
        }
        return (double) Math.sqrt(Math.pow(op, op));
    }
    double raizQuadrada(double op){
        if (op <= 0){
            System.out.print("Erro!");
        }
        return (double) Math.sqrt(Math.pow(op, op));
    }


}
