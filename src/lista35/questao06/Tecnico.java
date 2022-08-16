package lista35.questao06;

public class Tecnico extends Pessoa implements Servidor{
    private String setor;

    public Tecnico(String nome, int idade, String setor) {
        super(nome, idade);
        this.setor = setor;
    }

    @Override
    public String toString(){
        String info = "";
        info = super.toString();
        info = "\nSetor: " + this.setor;
        return info;
    }

    @Override
    public void trabalha() {
        System.out.println(getNome() + " Se apresenta no seu posto de trabalho");
    }

    @Override
    public void seCapacita() {
        System.out.println(getNome() + " O Técnico realiza uma capacitação técnica");
    }

    @Override
    public void seApresenta(){
        System.out.println(getNome() + " O Técnico se apresenta");
    }
}
