package aula33.questao02;

import java.util.ArrayList;

public class Empresa {
    private String nome;
    private ArrayList<Funcionario> empregados = new ArrayList<>();

    public Empresa(String nome) {
        if (nome.length() == 0){
            System.out.println("Nome invalido!");
        }else{
            this.nome = nome;
        }
    }
    public String toString(){
        return "Nome da empresa: "
                + this.nome
                + "\nQuantidade de funcionarios: "
                + this.empregados.size()
                + "\nGasto mensal com funcionarios: "
                + calcGastosMensal() ;
    }

    public double calcGastosMensal(){
        double gastoMensal = 0;
        for (int i = 0; i < this.empregados.size(); i++){
            gastoMensal += this.empregados.get(i).calcRemuneracao();
        }
        return gastoMensal;
    }

    public void contrata(Funcionario funcionario){
        if (this.empregados.indexOf(funcionario) == -1){
            this.empregados.add(funcionario);
            System.out.println("Funcionario contratado!");
        }else {
            System.out.println("Funcionario já existe!");
        }
    }

    private int getPosicao(String nome){
        if (this.empregados.size() > 1){
            int pos = this.empregados.indexOf(nome);
            if (pos != -1){
                for (int i = 0; i < this.empregados.size(); i++ ){
                    if (this.empregados.get(i).getNome() == nome){
                        System.out.println(this.empregados.get(i));
                    }
                }
            }
        }
        return -1;
    }

    public void demite(String nome){
       this.empregados.removeIf(x -> x.getNome() == nome);
    }

    public void geraRelatorio(String nome){
        if (this.empregados.size() > 1){
            for (int i = 0; i < this.empregados.size(); i++){
                if (this.empregados.get(i).getNome() == nome){
                    System.out.println("Relatorio Gerado");
                    System.out.println(this.empregados.get(i).toString());
                }
            }
        }
    }

    public void geraRelatorio(){
        System.out.println("\nRelatorio Total: ");
        System.out.println(toString());
        System.out.println("\nEmpregados: ");
        for (int i = 0; i < this.empregados.size(); i++){
            System.out.println(this.empregados.get(i).toString());
        }
    }

}
