package lista33.questao02;

public class Teste {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Josue", 5000, "Master");
        Funcionario secretaria = new Funcionario("Clarice", 1500);
        Funcionario ti = new Funcionario("Pedro", 2500);
        Empresa empresa = new Empresa("Tuup");

        secretaria.calcBonificacao();
        secretaria.calcRemuneracao();
        secretaria.getNome();
        secretaria.toString();
        System.out.println();
        gerente.getNome();
        gerente.calcBonificacao();
        gerente.calcRemuneracao();
        gerente.toString();
        System.out.println();
        ti.calcBonificacao();
        ti.calcRemuneracao();
        ti.getNome();
        ti.toString();
        System.out.println();
        empresa.contrata(ti);
        empresa.contrata(secretaria);
        empresa.contrata(gerente);
        empresa.geraRelatorio();
        System.out.println();
        empresa.demite(gerente.getNome());
        empresa.demite(ti.getNome());
        empresa.geraRelatorio();
        System.out.println(empresa.toString());
    }
}
