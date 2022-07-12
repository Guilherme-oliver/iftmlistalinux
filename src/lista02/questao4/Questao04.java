package lista02.questao4;

public class Questao04 {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();

        funcionario1.mostraInfo();
        System.out.println();

        funcionario1.setNome("João");
        funcionario1.setSalario(1500.00);
        funcionario1.mostraInfo();
        System.out.println();

        funcionario2.setNome("Pedro");
        funcionario2.setSalario(0);
        funcionario2.setEmpregado(true);
        funcionario2.mostraInfo();

    }
}
