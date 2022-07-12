package lista02.questao6;

import java.util.ArrayList;
import java.util.List;

public class Questao06 {
    public static void main(String[] args) {
        Leao leao1 = new Leao();

        leao1.MostraInfo();
        System.out.println();

        List<String> lista = new ArrayList<>();

        lista.add("Zebra");
        lista.add("Javali");
        lista.add("Coiote");
        lista.add("Bufalo");


        leao1.setNome("Coragem");
        leao1.setAnimaiscomidos(4);
        leao1.MostraInfo();
        for (String x : lista){
            System.out.println(x);
        }


    }
}
