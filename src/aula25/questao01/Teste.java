package aula25.questao01;

public class Teste {
    public static void main(String[] args) {
        Poltrona poltrona = new Poltrona(2);

        poltrona.senta("Joao");
        poltrona.levanta();
        System.out.println(poltrona);
        poltrona.senta("Ze");
        System.out.println(poltrona);
    }
}
