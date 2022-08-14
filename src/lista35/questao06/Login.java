package lista35.questao06;

public class Login {
    private String usuario;
    private String senha;

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public boolean valida(String senha, String usuario){
        if (usuario.equals(this.usuario)){
            if (senha.equals(this.senha)){
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }
}
