package lista22.questao02;

import java.util.Locale;
import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       int [] array = new int[n];

       for (int i = 0; i < n ; i++){
           array[i] = sc.nextInt();
       }

       int maior = 0;
       int soma = 0;
       int media = 0;

       for (int i = 0; i < array.length; i++){
           System.out.println(array[i]);
           if (array[i] > maior){
               maior = array[i];
           }
           soma += array[i];
           media += array[i];
       }
        System.out.println();
        System.out.println("Maior: " + maior);
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media / n);

    }
}
