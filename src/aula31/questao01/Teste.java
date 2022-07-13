package aula31.questao01;

public class Teste {
    public static void main(String[] args) {
        Leao leao = new Leao(250,"Mufaza");
        Vaca vaca = new Vaca("Nelore", "Vacão");

        vaca.fala();
        vaca.come();
        System.out.println(vaca);

        leao.fala();
        leao.come();
        System.out.println(leao);
    }
}
