package aula33.questao01;

public class Humano {
    private String nome;

    public Humano(String nome) {
        if (nome.length() == 0){
            System.out.println("Nome invalido!");
        }else {
            this.nome = nome;
        }
    }

    public String toString(){
        return "Nome da pessoa: "
                + this.nome;
    }

    public void brinca(Animal animal){
        if (animal instanceof Cachorro){
            System.out.println("Isto é um cachorro");
            Cachorro temp = (Cachorro) animal;
            temp.fala();
            System.out.println(temp.toString());
        } else if (animal instanceof Gato){
            System.out.println("Isto é um gato");
            Gato temp = (Gato) animal;
            temp.fala();
            System.out.println(temp.toString());
        }
    }
}
