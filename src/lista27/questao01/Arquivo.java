package lista27.questao01;

//Associação - 1 para 0..*
public class Arquivo {

    private String nome;
    private int tamanho;

    public Arquivo(String nome, int tamanho) {
        if (nome.length() == 0){
            System.out.println("Nome invalido!");
        }else {
            this.nome = nome;
        }
        if (tamanho < 0){
            System.out.println("Tamanho invalido");
        }else {
            this.tamanho = tamanho;
        }
    }
    public String toString(){
        String info = "";
        info += "Nome: " + nome + "\n" + "Tamanho: " + tamanho;
        return info;
    }
}
