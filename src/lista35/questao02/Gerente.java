package lista35.questao02;

public class Gerente extends Funcionario implements Usuario{
    private String sala;
    private Login login;


    public Gerente(String nome, double salario, String sala, Login login) {
        super(nome, salario);
        if (sala.length() == 0){
            System.out.println("Sala invalida!");
        }else {
            this.sala = sala;
        }
        this.login = login;
    }
    public String toString(){
        String info = "";
        info += super.toString();
        info += "\nSala: " + this.sala;
        return info;
    }

    @Override
    public void autentica(String usuario, String senha) {
        if (this.login.verifica(usuario, senha)){
            System.out.println("Autenticação foi realizada com sucesso!");
        }else {
            System.out.println("Falha no login!");
        }
    }
}
