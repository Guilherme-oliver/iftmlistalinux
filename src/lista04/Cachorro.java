package lista04;

public class Cachorro {
    String nome;
    int idade;

    public Cachorro(){
    }

    public Cachorro(String nome) {
        nome = "GOD";
    }

    public Cachorro(int idade) {
        idade = 1;
    }

    public Cachorro(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    void late(){
        System.out.println("Latiu: au au" );
    }
    int setInfo(int i){
        this.idade = i;
        return i;
    }
    String setInfo(String n){
        return this.nome = n;
    }

    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }

    public int setIdade(int idade) {
        this.idade = idade;
        return idade;
    }

    void mostraInfo(){
        System.out.println("Informações");
        System.out.println("Nome do cachorro: " + nome);
        System.out.println("Idade do cachorro: " + idade);
    }
}
