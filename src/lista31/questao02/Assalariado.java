package lista31.questao02;

public class Assalariado extends Empregado{
    private double salario;

    public Assalariado(String nome, String cpf, double salario){
        super(nome, cpf);
        if (salario < 1200){
            System.out.println("Salario invalido!");
        }else {
            this.salario = salario;
        }
    }

    public String toString(){
        return "Informações do funcionario: " + super.toString()
                + "\nSalario: " + this.salario
                + "\nVencimento: " + this.calcVencimento();
    }
    @Override
    public double calcVencimento() {
        return this.salario;
    }
}
