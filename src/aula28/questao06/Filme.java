package aula28.questao06;

public class Filme {
    private String nome;
    private String genero;
    private int ano;

    public Filme(String nome, String genero, int ano) {
        if (nome.length() == 0){
            System.out.println("Nome invalido!");
        }else {
            this.nome = nome;
        }
        if (genero.length() == 0){
            System.out.println("Genero invalido!");
        }else {
            this.genero = genero;
        }
        if (ano < 1970 || ano > 2023){
            this.ano = ano;
        }
    }

    public String toString(){
        return "Nome do filme: "
                + this.nome
                + "\n"
                + "Genero: "
                + this.genero
                + "\n"
                + "Ano de lançamento: "
                + this.ano;
    }
}
