package lista02.questao01;

import lista02.questao01.Cachorro;

public class Questao01 {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro();

        System.out.println(cachorro1.nome);
        System.out.println(cachorro1.idade);
        cachorro1.late(5);
        cachorro1.mostraInfo();
        System.out.println();

        System.out.println(cachorro2.nome);
        System.out.println(cachorro2.idade);
        cachorro2.late(4);
        cachorro2.mostraInfo();
        System.out.println();

        cachorro1.setNome("Katu");
        cachorro1.setIdade(10);
        cachorro1.mostraInfo();
        System.out.println();

        cachorro1.setInfo("Pickles", 6);
        cachorro1.late(2);
        cachorro1.mostraInfo();
        System.out.println();

        cachorro2.setNome("Morfeus");
        cachorro2.setIdade(8);
        cachorro2.mostraInfo();
        System.out.println();

        cachorro2.setInfo("Anakin", 7);
        cachorro2.late(6);
        cachorro2.mostraInfo();
        System.out.println();

    }
}
