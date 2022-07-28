package lista28.questao05;

public class Paciente {
    private String nome;
    private int idade;
    private Consulta consulta;

    public Paciente(String nome, int idade) {
        if (nome.length() == 0){
            System.out.println("Nome invalido!");
        }else {
            this.nome = nome;
        }

        if (idade < 0){
            System.out.println("Idade invalido");
        }else {
            this.idade = idade;
        }
    }
    public boolean temConsulta(){
        if (this.consulta != null){
            return true;
        }else {
            return false;
        }
    }
    public void associaConsulta(Consulta c){
        this.consulta = c;
    }
    public void removeConsulta(Consulta c){
        this.consulta = c;
    }
    public String getNome() {
        return nome;
    }

    public String toString(){
        return "Nome do paciente: "
                + this.nome
                + "\n"
                + "Idade: "
                + this.idade;
    }
}
