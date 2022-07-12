package lista04.questao5;

public class CarrinhoDeSupermercado {
    String dono ;
    int produtos = 0;
    String lista = "";
    double valorcomprado = 0.0;

    public CarrinhoDeSupermercado(){

    }

    public CarrinhoDeSupermercado(String dono) {
        if (dono == " "){
            System.out.println("Erro");
        }else {
            this.dono = dono;
        }

    }

    public void adicionaProduto(String nome, Double valor){
        if (nome == " " && valor < 0){
            System.out.println("Erro");
        }else {
           this.produtos += 1;
           this.valorcomprado += valor;
           this.lista += nome + "\n";
        }

    }
    public void limpa(){
        this.produtos = 0;
        this.valorcomprado = 0;
        this.lista = " ";
    }
    void mostraInfo(){
        System.out.println("Dono: " + dono + " quantidade de produtos: " + produtos + " valor da compra" + valorcomprado
        + " lista de produtos: " + lista + "\n\n");


    }
}
