package lista35.questao02;

public abstract class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        if (nome.length() == 0){
            System.out.println("Nome invalido!");
        }else {
            this.nome = nome;
        }

        if (salario < 1200){
            System.out.println("O salario não pode ser menor que salario minimo!");
        }else {
            this.salario = salario;
        }
    }

    public String toString(){
        String info = "";
        info += "Nome do funcionario: " + this.nome;
        info += "\nSalario: " + this.salario;
        return info;
    }
}
