package lista22.questao07;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){

        if (nome.length() == 0 || nome == null){
            System.out.println("Nome invalido!");
        }else {
            this.nome = nome;
        }
        if (idade < 0 || idade > 150){
            System.out.println("Valor invalido!");
        }else {
            this.idade = idade;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void apresenta(){
        System.out.println("Bom dia, meu nome é " + nome + ", e tenho" + idade + " anos de idade");
    }

    public String toString(){
        return nome;
    }

}
