package lista35.questao04;

public class Teste {
    public static void main(String[] args) {
        Midia midia = new Midia("Baal");
        Midia midia1 = new Midia("Belial");

        CD cd = new CD("Baal", "Lixoo");
        DVD dvd = new DVD("Belial", "ErroTotal");

        CDPlayer cdPlayer = new CDPlayer("GSD", 0);
        DVDPlayer dvdPlayer = new DVDPlayer("LCD", 0);
        Combo combo = new Combo("LP", 0);

        cdPlayer.executa(cd);
        System.out.println(cdPlayer.toString());

        dvdPlayer.executa(dvd);
        System.out.println(dvdPlayer.toString());

        combo.executa(cd);
        combo.executa(dvd);
        System.out.println(combo.toString());
    }
}
