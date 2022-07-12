package lista03;

public class Cachorro {
    String nome = "Totó";
    int idade = 5;

    void late(){
        System.out.println("Au au");
    }
    void late(String latido){
        System.out.println("Latiu: auauau" + latido);
    }
    void late(int vezes){
        System.out.println("Latiu: " + vezes + " vezes");
    }
    void late(int vezes, String latido){
        System.out.println("Latiu " + vezes  + " x"+ " auuuuuu " + latido) ;
    }
    String setInfo(String n){
        return nome = n;
    }
    int setInfo(int i){
        return idade = i;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    void mostraInfo(){
        System.out.println("Nome: " + nome + " ,idade: " + idade);
    }

}
