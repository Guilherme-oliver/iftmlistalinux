package lista04.questao6;

public class Programa06 {
    public static void main(String[] args) {

        RadioRelogio radioRelogio1 = new RadioRelogio();
        RadioRelogio radioRelogio2 = new RadioRelogio(23,59, 79);



        radioRelogio2.liga();
        radioRelogio2.avancaMinuto();
        radioRelogio2.avancaHora();
        radioRelogio2.trocaEstacao(66);
        radioRelogio2.mostraInfo();
        radioRelogio2.desliga();
        radioRelogio2.mostraInfo();





    }
}
