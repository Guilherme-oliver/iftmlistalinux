package aula26.questao02;

public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        if (nome.length() == 0){
            System.out.println("Nome invalido!");
        }else {
            this.nome = nome;
        }
    }
    public void trocaMusica(int i, Jukebox j){
        if (j.tocaMusica(i)){
            System.out.println("Sucesso");
        }else {
            System.out.println("Erro!");
        }
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
