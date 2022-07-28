package lista22.questao06;

import java.util.ArrayList;
import java.util.List;

public class Questao06 {
    public static void main(String[] args) {

        List<Double> lista = new ArrayList<>();

        lista.add(11.0);
        lista.add(12.0);
        lista.add(13.0);
        lista.add(14.0);
        lista.add(15.0);

        for (Double x : lista){
            System.out.println("(" + x + ")");
        }
        System.out.println("Tamanho da lista: " + lista.size());

        lista.add(2, 2.0);
        lista.add(0, 9.0);
        lista.add(1, 1.0);
        lista.add(5, 5.0);
        lista.add(3, 3.0);

        for (Double x : lista){
            System.out.println("(" + x + ")");
        }
        System.out.println("Tamanho da lista: " + lista.size());
        System.out.println();

        Double mediana = 0.0;
        Double desvioPadrao = 0.0;
        for (Double x : lista){
            mediana = x / lista.size();
        }
        System.out.println("Mediana: " + mediana);
        System.out.println();

        for (Double x : lista){
            if (x > mediana){
                System.out.println("Desvio padrão: " + x);
            }
        }
        System.out.println("Tamanho da lista: " + lista.size());
        System.out.println();

        lista.remove(1);
        lista.remove(8);
        lista.remove(3);
        lista.remove(6);
        lista.remove(0);

        for (Double x : lista){
            System.out.println("(" + x + ")");
        }
        System.out.println("Tamanho da lista: " + lista.size());

    }
}
