package lista25.questao03;
//Composição: Multiplicidade 1..*
public class Capitulo {
    private String conteudo;

    public Capitulo(String conteudo) {
        if (conteudo.length() == 0){
            this.conteudo = conteudo;
        }
    }

    public String getConteudo() {
        return conteudo.toString();
    }
}
