package lista35.questao07;

public class Teste {
    public static void main(String[] args) {
        Galinha galinha = new Galinha("GaliZé", 3,"Caramelo");
        Pato pato = new Pato("LeQuack", 5);
        Pessoa pessoa = new Pessoa("Jorge");

        pessoa.captura(galinha);
        pessoa.captura(pato);
    }
}
