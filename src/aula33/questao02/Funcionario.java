package aula33.questao02;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        if (nome.length() == 0){
            System.out.println("Nome invalido!");
        }else {
            this.nome = nome;
        }
        if (salario <= 0){
            System.out.println("Salario invalido!");
        }else {
            this.salario = salario;
        }
    }

    public String getNome() {
        return nome;
    }

    public String toString(){
        return "\nNome do funcionario: "
                + this.nome
                + "\nSalario: "
                + this.salario;
    }

    public void setSalario(double salario) {
        if (salario <= this.salario){
            System.out.println("Salario não pode diminuir");
        }else {
            this.salario = salario;
        }
    }

    public double calcRemuneracao(){
        return this.salario + calcBonificação();
    }

    public double calcBonificação(){
        return this.salario * (10/100);
    }

}
