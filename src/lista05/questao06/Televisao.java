package lista05.questao06;

public class Televisao {
    private boolean ligado = false;
    private int volMin = 0;
    private int volMax;
    private int volAtual = 0;
    private int canalMin = 2;
    private int canalMax;
    private int canalAtual = 2;

    public Televisao(){

    }

    public Televisao(int volMax, int canalMax) {
        if (volMax <= volMin || volMax < 0){
            System.out.println("Não é valor máximo!");
        }else {
            this.volMax = volMax;
        }

        if (canalMax <= canalMin || canalMax < 2){
            System.out.println("Não é valor máximo");
        }else {
            this.canalMax = canalMax;
        }
    }
    public String toString(){
        if (ligado == true){
            return "A televisão está ligada"
                    + "\n"
                    + "O volume atual é: "
                    + volAtual
                    + "\n"
                    + "O canal atual é: "
                    + canalAtual;
        }else {
            return "Está desligada";
        }

    }
    public void ligaDesliga(){
        if (ligado == false){
            ligado = true;
        }else {
            ligado = false;
        }
    }
    public void aumentaVolume(){
        if (ligado == true){
            if (volAtual >= volMin && volAtual < volMax){
                volAtual++;
            }else if (volAtual == volMax){
                System.out.println("Volume está no máximo");
            }else {
                System.out.println("Não dá para alterar o volume");
            }
        }else {
            System.out.println("Desligado");
        }
    }
    public void diminuiVolume(){
        if (ligado == true){
            if (volAtual <= volMax && volAtual > volMin){
                volAtual--;
            }else if (volAtual == volMin){
                System.out.println("Volume está no mínimo");
            }else {
                System.out.println("Não dá para alterar o volume");
            }
        }else {
            System.out.println("TV Desligado!");
        }
    }
    public void aumentaCanal(){
        if (ligado){
            System.out.println("TV Desligado!");
        }else {
            if (canalAtual >= canalMin){
                canalAtual++;
            }else if (canalAtual == canalMax){
                canalAtual = canalMin;
            }
        }
    }
    public void diminuiCanal(){
        if (ligado){
            System.out.println("TV Desligado!");
        }else {
            if (canalAtual == canalMin){
                canalAtual = canalMax;
            }else if (canalAtual == canalMax){
                canalAtual--;
            }
        }
    }
    public void setCanal(int canal){
        if (canalAtual >= canalMin && canalAtual <= canalMax){
           do {
               aumentaCanal();
                canal++;
           }while (canal == canalMax);

        }else {
            System.out.println("Canal fora de frequencia");
        }
    }
}
