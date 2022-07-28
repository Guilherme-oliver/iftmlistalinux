package lista24.questao04;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        if (nome.length() == 0){
            System.out.println("Nome invalido");
        }else {
            this.nome = nome;
        }
        if (preco < 0){
            System.out.println("Valor invalido!");
        }else {
            this.preco = preco;
        }
    }

    public double getPreco() {
        return preco;
    }
    public String toString(){
        return "Nome: "
                + nome
                + "\n"
                + "Preço: "
                + preco;
    }
}
