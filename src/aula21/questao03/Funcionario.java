package aula21.questao03;

public class Funcionario {

    private String nome;
    private double salario;
    private double bonificacao;
    private static double valerefeicao = 393.0;

    public Funcionario(String nome, double salario, double bonificacao) {
        if (nome == " "){
            System.out.println("Nome invalido!");
        }else {
            this.nome = nome;
        }
        if (salario <= 0){
            System.out.println("Salario invalido!");
        }else {
            this.salario = salario;
        }
        if (bonificacao <= 0){
            System.out.println("Valor invalida");
        }else {
            this.bonificacao = bonificacao;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == " "){
            System.out.println("Nome invalido");
        }else {
            this.nome = nome;
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario <= 0){
            System.out.println("Valor invalido");
        }else {
            this.salario = salario;
        }
    }

    public double getBonificacao() {
        return bonificacao / 100;
    }

    public void setBonificacao(double bonificacao) {
        if (bonificacao <= 0){
            System.out.println("O salario sempre deve aumentar!");
        }else {
            this.bonificacao = bonificacao / 100;
        }
    }

    public static double getValerefeicao() {
        return valerefeicao;
    }

    public static void setValerefeicao(double valerefeicao) {
        if (valerefeicao <= Funcionario.valerefeicao){
            System.out.println("Não pode diminuir");
        }else {
            Funcionario.valerefeicao = valerefeicao;
        }
    }

    public double calcGanhoMensal(){
        return ((salario * bonificacao) + salario + valerefeicao);
    }
    public double calcGanhoAnual(){
        return calcGanhoMensal() * 12;
    }

}
