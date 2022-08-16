package lista35.questao06;

public final class Coordenador extends Professor{
    private String tipo;
    private String descricao;

    public Coordenador(String nome, int idade, String area, String titulacao, Login login, String tipo, String descricao) {
        super(nome, idade, area, titulacao, login);
        this.tipo = tipo;
        this.descricao = descricao;
    }

    @Override
    public String toString(){
        String info = "";
        info += super.toString();
        info += "\nTipo: " + this.tipo;
        info += "\nDescrição: " + this.descricao;
        return  info;
    }

    @Override
    public void trabalha(){
        System.out.println(getNome() + " ,coordenador coordenou.");
    }
}
