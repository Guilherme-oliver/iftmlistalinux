package aula31.questao02;



public class Teste {
    public static void main(String[] args) {

      Empregado assalariado = new Assalariado("Joao","MG741", 1500);
      Empregado comissionado = new Comissionado("Pedro","MG852",1000000,1);
      Empregado horista = new Horista("Philip","MG951",80,180);

        System.out.println(assalariado);
        System.out.println(comissionado);
        System.out.println(horista);
    }
}
