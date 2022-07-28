package lista28.questao04;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        if (nome.length() == 0){
            System.out.println("Nome do produto invalido!");
        }else {
            this.nome = nome;
        }

        if (preco < 0){
            System.out.println("Valor do produto invalido!");
        }else {
            this.preco = preco;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public String toString(){
        return "Nome do produto: "
                + this.nome
                + "\n"
                + "Preço do produto: "
                + this.preco;
    }
}
