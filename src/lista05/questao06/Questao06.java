package lista05.questao06;

public class Questao06 {
    public static void main(String[] args) {

        Televisao televisao = new Televisao(100, 100);

        televisao.ligaDesliga();
        televisao.aumentaVolume();
        televisao.setCanal(50);
        System.out.println(televisao.toString());

    }
}
