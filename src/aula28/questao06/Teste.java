package aula28.questao06;

public class Teste {
    public static void main(String[] args) {
        Filme filme = new Filme("HarryPotter", "Fantasia", 2002);
        Filme filme1 = new Filme("Truque de Mestre", "Fantasia", 2012);
        Cliente cliente = new Cliente("Ed","MG-14958");
        Locacao locacao = new Locacao(3, cliente, filme1);
        Locacao locacao1 = new Locacao(2, cliente, filme);

        cliente.associaLocacao(locacao);
        cliente.associaLocacao(locacao1);
        System.out.println(cliente.toString());
    }
}
