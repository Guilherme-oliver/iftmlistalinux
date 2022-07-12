package lista05.questao05;

public class Funcionario05 {
    private String nome;
    private double salario;
    private double bonificacao;
    private boolean ativo = false;

    public Funcionario05(){

    }

    public Funcionario05(String nome, double salario, double bonificacao) {
      if(nome == " "){
          System.out.println("Nome invalido!");
      }else {
          this.nome = nome;
      }
      if (salario <= 0){
          System.out.println("Valor invalido!");
      }else {
          this.salario = salario;
      }
      if (bonificacao <= 0){
          System.out.println("Valor invalido!");
      }else {
          this.bonificacao = bonificacao;
      }
    }

    public String toString(){
        return "Nome do funcionario: "
                + nome
                + "\n"
                + "Salario: "
                + salario
                + "\n"
                + "Bonificação: "
                + bonificacao
                + "\n"
                + "Ganho mensal: "
                + calcGanhoMensal()
                + "\n"
                + "Ganho anual: "
                + calcGanhoAnual();
    }
    public void setBonificacao(double porcentagem){
        if (ativo == true){
            if (porcentagem <= 0){
                System.out.println("Bonificação não pode ser menor ou igual [0]");
            }else {
                this.bonificacao =  porcentagem / 100;
            }
        }else {
            System.out.println("Não recebe bonificação");
        }
    }

    public void setSalario(double salario) {
        if (ativo == true){
            if (salario <= this.salario){
                System.out.println("O salario deve aumentar!");
            }else {
                this.salario = salario;
            }
        }else {
            System.out.println("Funcionario não recebe alteração no salario");
        }
    }

    public void mudaStatus(){
        if (ativo){
            System.out.println("Fim do periodo de afastamento ");
            ativo = true;
        }else if(ativo == true){
            System.out.println("Funcionario foi afastado");
            ativo = false;
        }
    }
    public double calcGanhoMensal(){
        if (ativo == true){
            return (salario * bonificacao) + salario;
        }else {
            return salario;
        }

    }
    public double calcGanhoAnual(){
        if (ativo == true){
            return calcGanhoMensal() * 12;
        }else {
            return calcGanhoMensal() * 12;
        }
    }

}
