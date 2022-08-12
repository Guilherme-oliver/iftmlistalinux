package lista33.questao02;

public class Gerente extends Funcionario{
    private String sala;
    public Gerente(String nome, double salario, String sala) {
        super(nome, salario);
        if (sala.length() == 0){
            System.out.println("Sala invalida");
        }else {
            this.sala = sala;
        }
    }

    public String toString(){
        return "\nInformações do Gerente: "
                + super.toString()
                + "\nSala: "
                + this.sala;
    }

    public double calcBonificacao(){
        return super.calcBonificacao() * 2;
    }
}
