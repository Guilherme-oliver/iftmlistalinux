package lista27.questao03;

public class Teste {
    public static void main(String[] args) {

        Visitante visitante1 = new Visitante();
        Visitante visitante2 = new Visitante() ;
        CarrinhoMR carrinhoMR1 = new CarrinhoMR("1111");
        CarrinhoMR carrinhoMR2 = new CarrinhoMR("1213");

        carrinhoMR1.associaOcupante(visitante1);
        carrinhoMR1.associaOcupante(visitante2);
        carrinhoMR1.associaOcupante(visitante1);
        carrinhoMR2.daVolta();
        carrinhoMR1.daVolta();

        visitante1.entra(carrinhoMR1);
        visitante1.entra(carrinhoMR2);
        System.out.println("Primeiro: " +visitante1.toString());
        System.out.println();
        System.out.println("Segundo: " + visitante2.toString());
        visitante1.sai();
        visitante2.sai();
        System.out.println("Primeiro: " + visitante1.toString());
        System.out.println("Segundo: " + visitante2.toString());

    }
}
