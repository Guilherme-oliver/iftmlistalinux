package lista25.questao05;

import java.util.LinkedList;

public class Teste {
    public static void main(String[] args) {

        Janela janela = new Janela("K", new LinkedList<>());

        janela.addItemMenu("B");
        janela.addItemMenu("C");
        janela.addItemMenu("D");

        System.out.println(janela.toString());

    }
}
