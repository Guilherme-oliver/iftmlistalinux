package lista34.questao04;

public class Diretor implements Ator {
    public void dirige(Ator ator){
        if (ator instanceof AtorHamlet){
            Ator ator1 = new AtorHamlet();
            ator1.atua();
        } else if (ator instanceof AtorMecbeth) {
            Ator ator1 = new AtorMecbeth();
            ator1.atua();
        }
    }

    @Override
    public void atua() {

    }
}
