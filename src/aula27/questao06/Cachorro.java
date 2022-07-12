package aula27.questao06;
// 0..1 0..*
public class Cachorro {
    private String nome;
    private String raca;
    private Humano humano;

    public Cachorro(String nome, String raca) {
        if (nome.length() == 0){
            System.out.println("Nome invalido!");
        }else {
            this.nome = nome;
        }
        if (raca.length() == 0){
            System.out.println("Raça invalida!");
        }else {
            this.raca = raca;
        }
    }
    public boolean temDono(){
        if (this.humano == null){
            System.out.println("Não tem dono");
            return false;
        }else {
            System.out.println("Tem dono");
            return true;
        }
    }
    public void associaHumano(Humano h){
        this.humano = h;
    }
    public String toString(){
        return "Nome do cachorro: "
                + this.nome
                + "\n"
                + "Raça do cachorro: "
                + raca
                + "\n"
                + "Tem dono: "
                + temDono();
    }
}
