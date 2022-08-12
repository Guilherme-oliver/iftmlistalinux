package lista35.questao02;

public class Teste {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Pablo", 5000, "407", new Login("pablo@gmail.com", "123456"));
        Cliente cliente = new Cliente("Camael", new Login("camael@gmail.com", "159357"));

        System.out.println(gerente.toString());
        gerente.autentica("pablo@gmail.com", "123456");
        System.out.println();
        System.out.println(cliente.toString());
        cliente.autentica("merda", "segundaMerda");

    }
}
