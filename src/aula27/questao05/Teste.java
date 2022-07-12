package aula27.questao05;

public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Joao", true);
        Pessoa pessoa2 = new Pessoa("Maria", false);

        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());

        pessoa1.casa(pessoa2);
        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());

        pessoa1.divorcia();
        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
    }
}
