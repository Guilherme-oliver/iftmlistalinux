package lista35.questao06;

public class Professor extends Pessoa implements Servidor, Usuario{
    private String area;
    private String titulacao;
    private Login login;

    public Professor(String nome, int idade, String area, String titulacao, Login login) {
        super(nome, idade);

        if (area.length() == 0){
            System.out.println("Área invalida");
        }else {
            this.area = area;
        }

        this.titulacao = titulacao;
        this.login = login;
    }

    public String toString(){
        String info = "";
        info += super.toString();
        info += "\nÁrea: " + this.area;
        info += "\nTitulação: " + this.titulacao;
        return info;
    }

    @Override
    public void trabalha() {
        System.out.println(getNome() + "\n" + this.titulacao + "\nMinistrou a aula.");
    }

    @Override
    public void seApresenta(){
        System.out.println(toString() + "\nSe apresenta em seu posto de trabalho ");
    }

    @Override
    public void seCapacita() {
        if (this.titulacao == ""){
            this.titulacao = "Esp";
        } else if (titulacao == "Esp") {
            this.titulacao = "Ms";
        } else if (titulacao == "Ms") {
            this.titulacao = "Dr";
        }
    }

    @Override
    public boolean autenticacao(String usuario, String senha) {
        if (login.valida(usuario, senha)) {
            return true;
        } else {
            return false;
        }
    }
}
