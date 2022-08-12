package lista02.questao01;

public class Cachorro {

    String nome = "Totó";
    int idade = 5;

    void late(int vezes) {
        if (vezes < 0) {
            System.out.println("Erro");
        } else {
            System.out.println("Latiu " + vezes + " vezes");
        }
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    void setInfo(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    void mostraInfo(){
        System.out.println("Nome do cachorro: " + nome);
        System.out.println("Idade do cachorro: " + idade);
    }
}
