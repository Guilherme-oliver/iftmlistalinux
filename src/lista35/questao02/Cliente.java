package lista35.questao02;

public class Cliente implements Usuario{
    private String nome;
    private Login login;

    public Cliente(String nome, Login login) {
        if (nome.length() == 0){
            System.out.println("Nome invalido");
        }else {
            this.nome = nome;
        }
        this.login = login;
    }

    public String toString(){
        String info = "";
        info += super.toString();
        info += "\nNome: " + this.nome;
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
