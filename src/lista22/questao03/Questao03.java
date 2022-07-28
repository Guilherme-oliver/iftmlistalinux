package lista22.questao03;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String [] cachorro = new String[n];

        for (int i = 0; i < n; i++){
            cachorro[i] = sc.nextLine();
        }

    }
}
