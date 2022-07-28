package lista22.questao05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> lista = new ArrayList<>();

        do {
            lista.add(sc.nextLine());
        }while (sc.nextLine() != " ");

        for (String x : lista){
            System.out.println(x);
        }
    }
}
