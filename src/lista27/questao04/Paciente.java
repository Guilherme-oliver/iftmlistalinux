package lista27.questao04;

public class Paciente {
    private String nome;
    private int idade;

    public Paciente(String nome, int idade) {
        if (nome.length() == 0){
            System.out.println("Nome invalido!");
        }else {
            this.nome = nome;
        }
        if (idade < 0){
            System.out.println("Idade invalida");
        }else {
            this.idade = idade;
        }
    }

    public String toString(){
        return "Nome do paciente: "
                + this.nome
                + "\n"
                + "Idade: "
                + idade ;
    }
}
