package lista35.questao06;

public final class Aluno extends Pessoa implements Usuario{
    private String curso;
    private Login login;

    public Aluno(String nome, int idade, String curso, Login login) {
        super(nome, idade);
        this.curso = curso;
        this.login = login;
    }

    @Override
    public String toString(){
        String info = "";
        info += super.toString();
        info +="\nCurso: " + this.curso;
        return info;
    }

    @Override
    public void seApresenta(){
        System.out.println(getNome() + " Aluno se apresenta" + " do curso de " + this.curso);
    }

    @Override
    public boolean autenticacao(String usuario, String senha) {
        if (login.valida(senha,usuario)){
            return true;
        }else {
            return false;
        }
    }

    public void estuda(){
        System.out.println(getNome() + " estuda: " + this.curso);
    }
}
