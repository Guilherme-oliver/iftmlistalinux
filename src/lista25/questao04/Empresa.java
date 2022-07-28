package lista25.questao04;

import java.util.LinkedList;

//Composição: multiplicidade 0..*
public class Empresa {
    private String dono;
    private LinkedList<Funcionario> funcionarios = new LinkedList<>();

    public Empresa(String dono) {
        if (dono.length() == 0){
            System.out.println("Nome invalido!");
        }else {
            this.dono = dono;
        }
    }
    public void contrata(String nome, double salario){
        Funcionario func = new Funcionario(nome, salario);
        this.funcionarios.add(func);
    }
    public void demite(){
        if (this.funcionarios != null){
            this.funcionarios.remove();
        }
    }
    private double calcSalariosMensal(){
        Double soma;
        return  soma = funcionarios.getFirst().getSalario() + funcionarios.getLast().getSalario();
    }
    public String toString(){
        return "Dono: "
                + dono
                + "\n"
                + "Funcionarios: "
                + funcionarios
                + "\n"
                + "Gastos com salarios: "
                + calcSalariosMensal();
    }
}
