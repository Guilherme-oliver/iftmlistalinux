package aula22.questao07;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Questao07 {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(0, new Pessoa("Joao", 22));
        pessoas.add(1, new Pessoa("Pedro", 20));
        pessoas.add(2, new Pessoa("José", 19));
        pessoas.add(3, new Pessoa("Maria", 23));
        pessoas.add(4, new Pessoa("Estela", 21));

        for (Pessoa x : pessoas){
            System.out.println(x);
        }
        System.out.println();

        pessoas.add(1, new Pessoa("Karina", 30));
        pessoas.add(3, new Pessoa("Kleber", 50));
        pessoas.add(7, new Pessoa("Guilherme", 29));

        for (Pessoa x : pessoas){
            System.out.println(x);
        }
        System.out.println();

        Random gerador = new Random();

        for (int i = 0; i <= 2; i++){
            int numeroAleatorio = gerador.nextInt(pessoas.size() -1);
            pessoas.get(numeroAleatorio).apresenta();
            pessoas.remove(numeroAleatorio);
            for (Pessoa x : pessoas){
                System.out.println(x);
            }
        }
    }
}
