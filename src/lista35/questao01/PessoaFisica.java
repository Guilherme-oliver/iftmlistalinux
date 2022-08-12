package lista35.questao01;

public class PessoaFisica extends Pessoa implements Contribuinte{

    private String cpf;
    private double salario;

    public PessoaFisica(String nome, String cpf, double salario) {
        super(nome);
        if (cpf.length() == 0){
            System.out.println("CPF Invalido!");
        }else {
            this.cpf = cpf;
        }

        if (salario < 1200){
            System.out.println("Salario não pode ser menor que um salario minimo!");
        }else {
            this.salario = salario;
        }
    }

    public String toString(){
        String info = "";
        info += super.toString();
        info += "\nCPF: " + this.cpf;
        info += "\nSalario: " + this.salario;
        return info;
    }

    @Override
    public double pagaImposto() {
        double salarioLiquido = 0;
        if (this.salario < 1903){
            System.out.println("Não paga imposto!");
            salarioLiquido = this.salario;
        } else if (this.salario >= 1903 && this.salario <= 2826) {
            System.out.println("Imposto é de 7,5%");
            salarioLiquido = this.salario - (this.salario * 7.5 / 100);
        }else if (this.salario > 2826 && this.salario <= 3751){
            System.out.println("imposto é de 15%");
            salarioLiquido = this.salario - (this.salario * 15 / 100);
        } else if (this.salario > 3751) {
            System.out.println("imposro é de22,5%");
            salarioLiquido = this.salario - ( this.salario * 22.5/ 100);
        }

        return salarioLiquido;
    }
}
