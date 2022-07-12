package lista02.questao4;

public class Funcionario {
    String nome;
    double salario;
    boolean empregado = false;

    public Funcionario(){

    }

    public Funcionario(String nome, double salario, boolean empregado) {
        this.nome = nome;
        this.salario = salario;
        this.empregado = empregado;
    }

    public void setEmpregado(boolean empregado) {
        this.empregado = empregado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void admite(){
        if (empregado == false){
            System.out.println("Contratado");
        }else {
            System.out.println("Erro");
        }
    }

    public void demite(){
        if (empregado == false){
            System.out.println("Erro");
        }else {
            System.out.println("Demitido");
        }

    }

    public void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario);
        if (empregado == false){
           admite();
        }else {
            demite();
        }
    }
}
