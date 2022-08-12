package lista35.questao02;

public class Seguranca extends Funcionario{
    private boolean armado;

    public Seguranca(String nome, double salario, boolean armado) {
        super(nome, salario);
        this.armado = armado;
    }

    public String toString(){
        String info = "";
        info += super.toString();
        info += "Está armado: " + this.armado;
        return info;
    }

    public void fazRonda(){
        System.out.println("O segurança: " + toString() + " está fazendo ronda");
    }
}
