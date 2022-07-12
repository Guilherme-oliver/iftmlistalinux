package lista01;

public class Programa {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();

        p2.nome = "Pink";
        p3.nome = "Plank";

        System.out.println("Primeira pessoa: " + p1.nome);
        System.out.println("Segunda pessoa: " + p2.nome);
        System.out.println("Terceira pessoa: " + p3.nome);

        p1.oi();
        p2.oi();
        p3.oi();

        p1.responde();
        p2.responde();
        p3.responde();

        System.out.println(p1.getNome());
        System.out.println(p2.getNome());
        System.out.println(p3.getNome());

        System.out.println(p1.getNome() + " " + p1.seApresenta( 35));
        System.out.println(p2.getNome() + " " + p2.seApresenta( 15));
        System.out.println(p3.getNome() + " " + p3.seApresenta( 25));

    }
}
