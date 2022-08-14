package lista35.questao06;

public class Terceirizado extends Pessoa implements Funcionario{
    private String ocupacao;

    public Terceirizado(String nome, int idade, String ocupacao) {
        super(nome, idade);
        this.ocupacao = ocupacao;
    }

    @Override
    public String toString(){
        String info = "";
        info += super.toString();
        info += "\nOcupação: " + this.ocupacao;
        return  info;
    }

    @Override
    public void trabalha() {
        System.out.println("O Terceirizadp trabalhou em sua ocupação.");
    }

    @Override
    public void seApresenta(){
        System.out.println("O terceirizado se apresenta: " + " Meu nome é " + super.toString());
    }
}
