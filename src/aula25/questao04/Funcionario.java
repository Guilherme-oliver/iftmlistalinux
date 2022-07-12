package aula25.questao04;
//Composição: multiplicidade 0..*
public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        if (nome.length() == 0){
            System.out.println("Nome invalido!");
        }else {
            this.nome = nome;
        }
        if (salario < 1200){
            System.out.println("Salario tem que ser o mínimo vigente!");
        }else {
            this.salario = salario;
        }
    }

    public double getSalario() {
        return salario;
    }
    public String toString(){
        return "Nome do funcionario: "
                + nome
                + "\n"
                + "Salario: "
                + salario;
    }
}
