package lista02.questao6;

public class Leao {
    String nome = "Clagane";
    int animaiscomidos = 0;
    String nomeaimaiscomidos;

    public Leao(){

    }

    public Leao(String nome, int animaiscomidos, String nomeaimaiscomidos) {
        this.nome = nome;
        this.animaiscomidos = animaiscomidos;
        this.nomeaimaiscomidos = nomeaimaiscomidos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnimaiscomidos(int animaiscomidos) {
        this.animaiscomidos = animaiscomidos;
    }

    void come(String animal){
        System.out.println("Zebra");
        System.out.println("Cabra");
        System.out.println("Coiote");
        System.out.println("Bufalo");
    }

    public void MostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Animais comido: " + this.animaiscomidos);
        System.out.println("Nome dos animais comidos: " );


    }


}
