package aula25.questao03;

public class Teste {
    public static void main(String[] args) {
        Livro livro = new Livro("Nevoeiro", "Stephen");

        livro.addCapitulo("aaaaaa");
        livro.addCapitulo("bbbbbb");
        livro.addCapitulo("cccccc");
        livro.addCapitulo("dddddd");

        livro.removeCapitulo(2);
        System.out.println(livro);
    }
}
