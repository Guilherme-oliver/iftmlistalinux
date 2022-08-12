package lista35.questao01;

public class Teste {
    public static void main(String[] args) {
        PessoaFisica pessoa = new PessoaFisica("Joaquim","MG147852",1500);
        PessoaJuridica juridico = new PessoaJuridica("ABCPaulista","38408224",100000,5);
        MinisterioFazenda ministerioFazenda = new MinisterioFazenda();

        ministerioFazenda.geraRelatorio(pessoa);
        ministerioFazenda.recolheImposto(pessoa);
        System.out.println();
        ministerioFazenda.geraRelatorio(juridico);
        ministerioFazenda.recolheImposto(juridico);
    }
}
