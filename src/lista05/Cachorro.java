package lista05;

public class Cachorro {

    private String nome = "Bob";
    private int idade = 3;

    public Cachorro(){

    }
    public Cachorro(String nome, int idade) {
        if (nome == " "){
            System.out.println("Nome invalido");
        }else {
            this.nome = nome;
        }
        if (idade < 0){
            System.out.println("Erro na idade");
        }else {
            this.idade = idade;
        }
    }
    private void late(){
        System.out.println("au au");
    }
    public void come(){
        System.out.println("Cachorro comeu ração");
        late();
    }
    public void brinca(){
        System.out.println("Cachorro brincou com o brinquedo");
        late();
    }
    public void setNome(String nome){
        if (nome == " "){
            System.out.println("Sem nome");
        }else {
            this.nome = nome;
        }
    }
    public void setIdade(int idade){
        if (idade < 0){
            System.out.println("Idade invalida");
        }else {
            this.idade = idade;
        }
    }
    public String toString(){
        return "Nome do cachorro: "
                + nome
                + "\n"
                + "Idade do cachorro: "
                + idade;
    }
}
