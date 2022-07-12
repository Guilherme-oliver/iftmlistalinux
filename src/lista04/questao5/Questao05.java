package lista04.questao5;

public class Questao05 {
    public static void main(String[] args) {

        CarrinhoDeSupermercado carrinhoDeSupermercado1 = new CarrinhoDeSupermercado(" ");
        CarrinhoDeSupermercado carrinhoDeSupermercado2 = new CarrinhoDeSupermercado("João");

        carrinhoDeSupermercado2.adicionaProduto("Pera", 5.80);
        carrinhoDeSupermercado2.adicionaProduto("Maçã", 0.20);

        carrinhoDeSupermercado2.mostraInfo();
        carrinhoDeSupermercado2.limpa();
        carrinhoDeSupermercado2.mostraInfo();


        carrinhoDeSupermercado1.mostraInfo();

    }
}
