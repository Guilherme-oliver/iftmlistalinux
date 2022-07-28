package lista25.questao02;
//Composição: Multiplicidade 0..20
public class Musica {
    private String nome;
    private int tempo;

    public Musica(String nome, int tempo) {
        if (nome.length() == 0){
            System.out.println("Nome invalido!");
        }else{
            this.nome = nome;
        }
        if (tempo <= 0){
            System.out.println("Tempo invalido!");
        }else {
            this.tempo = tempo;
        }
    }
    public String toString(){
        return "Nome da música: "
                + nome
                + "\n"
                + "Tempo da música: "
                + tempo;
    }
}
