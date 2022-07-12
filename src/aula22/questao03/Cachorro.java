package aula22.questao03;

public class Cachorro {
    private String nome;

    public Cachorro(String nome){
        if (nome == " "){
            System.out.println("Nome invalido!");
        }else {
            this.nome = nome;
        }
    }

    public void late(){
        System.out.println(nome + "\n" + "Au au");
    }

    public String toString(){
        return nome;
    }
}
