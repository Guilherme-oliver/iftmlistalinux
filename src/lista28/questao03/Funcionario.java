package lista28.questao03;

public class Funcionario {
    private String nome;
    private  int ordensresolvidsas = 0;
    private OrdemDeServico ordemDeServico;

    public Funcionario(String nome) {
        if (nome.length() == 0){
            System.out.println("Nome Invalido!");
        }else {
            this.nome = nome;
        }
    }

    public void resolve(OrdemDeServico ordemDeServico){
        if (ordemDeServico.resolvida() == true){
            System.out.println("Já está resolvido");
        }else {
            this.ordensresolvidsas ++;
            ordemDeServico.resolvida();
        }
    }

    public String toString(){
        return "Nome do funcionario: "
                + this.nome
                + "\n"
                + "Número de ordens resolvidos: "
                + this.ordensresolvidsas;
    }
}
