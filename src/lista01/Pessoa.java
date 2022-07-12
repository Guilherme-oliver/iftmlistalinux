package lista01;

public class Pessoa {
    String nome = "Will";
    Integer idade;


    public Pessoa(String nome, String oi) {
        this.nome = nome;
    }

    public Pessoa(){

    }

    public String getNome() {
        return nome;
    }


    public void oi(){
        System.out.println(nome + " Oi");

    }

    public void responde(){
        System.out.println(nome + " Olá");
    }

    public Integer seApresenta(Integer idade){
        return idade;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void conversa(Integer idade1, Integer idade2){

    }
}
