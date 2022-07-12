package aula24.questao02;
//Agregação: Multiplicidade 0..N

public class Caixa {

    private String granja;
    private Ovo[] ovos = new Ovo[12];

    public Caixa(String granja){
        if (granja.length() == 0){
            System.out.println("Invalido!");
        }else {
            this.granja = granja;
        }
    }
    public void addOvo(Ovo o){
        if (this.ovos.length == 12){
            System.out.println("Cartela cheia!");
        }else {
            for (int i=0; i<= ovos.length; i++){
                if (this.ovos[i] == null){
                    this.ovos[i] = o;
                    break;
                }
            }
        }
    }
    public void removeOvo(){
        if (this.ovos.length == 0){
            System.out.println("Cartela vazia");
        }else {
            for (int i = ovos.length; i <= ovos.length; i--){
                if (this.ovos[i] != null){
                    this.ovos[i] = null;
                    break;
                }
            }
        }

    }
    public String toString(){
        return "Ovo de granja"
                + granja;
    }
}
