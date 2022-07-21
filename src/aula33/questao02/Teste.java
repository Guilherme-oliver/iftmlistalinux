package aula33.questao02;

public class Teste {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Josue", 5000, "Master");
        Funcionario secretaria = new Funcionario("Clarice", 1500);
        Funcionario ti = new Funcionario("Pedro", 2500);
        Empresa empresa = new Empresa("Tuup");

        empresa.contrata(secretaria);
        empresa.contrata(gerente);

        System.out.println(gerente.toString());
        System.out.println(secretaria.toString());
        System.out.println(ti.toString());

        empresa.geraRelatorio();


    }
}
