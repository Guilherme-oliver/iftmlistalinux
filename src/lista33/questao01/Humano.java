package lista33.questao01;

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
            Cachorro cachorro = (Cachorro) animal;
            cachorro.fala();
            System.out.println(cachorro.toString());
        } else if (animal instanceof Gato){
            System.out.println("Isto é um gato");
            Gato gato = (Gato) animal;
            gato.fala();
            System.out.println(gato.toString());
        }
    }
}
