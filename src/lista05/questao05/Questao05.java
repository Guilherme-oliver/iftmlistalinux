package lista05.questao05;

public class Questao05 {
    public static void main(String[] args) {

       Funcionario05 funcionario01 = new Funcionario05("João", 2000, 0);
       Funcionario05 funcionario02 = new Funcionario05("Cleber", 1500,10);

       System.out.println(funcionario01.toString());
       System.out.println();

       funcionario02.mudaStatus();
       funcionario02.setBonificacao(20);
       funcionario02.setSalario(1800);
       System.out.println(funcionario02.toString());

    }
}
