package aula22.questao01;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List <Integer> lista = new ArrayList<>();
        lista.add(0, 1);
        lista.add(1, 2);
        lista.add(2, 3);
        lista.add(3, 4);
        lista.add(4, 5);

        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
}
