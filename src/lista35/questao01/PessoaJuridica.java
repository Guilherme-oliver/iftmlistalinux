package lista35.questao01;

public class PessoaJuridica extends Pessoa implements Contribuinte{
    private String cnpj;
    private double lucroreal;
    private int funcionario;

    public PessoaJuridica(String nome, String cnpj, double lucroreal,int funcionario) {
        super(nome);
        if (cnpj.length() == 0){
            System.out.println("CNPJ invalido!");
        }else {
            this.cnpj = cnpj;
        }
        this.lucroreal = lucroreal;
        if (funcionario <= 0){
            System.out.println("Valor de funcionarios invalido!");
        }else {
            this.funcionario = funcionario;
        }
    }
    public String toString(){
        String info = "";

        info += "Nome: " + super.toString();
        info += "\nCNPJ: " + this.cnpj;
        info += "\nLucro Real: " + this.lucroreal;
        info += "\nNúmero de funcionarios: " + this.funcionario;

        return info;
    }

    @Override
    public double pagaImposto() {
        double lucroLiquido = 0;
        lucroLiquido = this.lucroreal - (this.lucroreal * 9.3 / 100);
        System.out.println("Imposto de 9,3%");
        return lucroLiquido;
    }
}
