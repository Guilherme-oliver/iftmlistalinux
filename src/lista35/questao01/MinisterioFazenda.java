package lista35.questao01;

public class MinisterioFazenda {
    public void geraRelatorio(Pessoa pessoa){
        if (pessoa instanceof PessoaFisica){
            System.out.println("Pessoa física");
            PessoaFisica pessoaFisica = (PessoaFisica) pessoa;
            System.out.println(pessoaFisica.toString());
        } else if (pessoa instanceof PessoaJuridica){
            System.out.println("Pessoa Juridica");
            PessoaJuridica pessoaJuridica = (PessoaJuridica) pessoa;
            System.out.println(pessoaJuridica.toString());
        }
    }
    public void recolheImposto(Contribuinte contribuinte){
        if (contribuinte instanceof PessoaFisica){
            System.out.println("Pessoa física");
            PessoaFisica pessoaFisica = (PessoaFisica) contribuinte;
            System.out.println(pessoaFisica.pagaImposto());
        } else if (contribuinte instanceof PessoaJuridica){
            System.out.println("Pessoa Juridica");
            PessoaJuridica pessoaJuridica = (PessoaJuridica) contribuinte;
            System.out.println(pessoaJuridica.pagaImposto());
        }
    }

}
