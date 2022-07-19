package aula33.questao01;

public abstract class Animal {
    private String nome;
    private String raca;

    public Animal(String nome, String raca) {
        if (nome.length() == 0){
            System.out.println("Erro no nome");
        }else {
            this.nome = nome;
        }
        if (raca.length() == 0){
            System.out.println("Raça invalida!");
        }else {
            this.raca = raca;
        }
    }

    public String toString(){
        return "Nome: " + this.nome
                + "\nRaça: " + this.raca;
    }

    public abstract void fala();

    public void come(){
        System.out.println(this.nome + " come");
    }

    public String getNome() {
        return nome;
    }
}
