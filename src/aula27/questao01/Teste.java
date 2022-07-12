package aula27.questao01;

public class Teste {
    public static void main(String[] args) {
        Arquivo arquivo = new Arquivo("Aaaa", 200);
        Arquivo arquivo1 = new Arquivo("Bbbb", 250);
        Arquivo arquivo2 = new Arquivo("Cccc", 190);

        Disco disco1 = new Disco(3);
        disco1.grana(arquivo);
        disco1.grana(arquivo1);
        disco1.grana(arquivo2);

        System.out.println(disco1.toString());

    }
}
