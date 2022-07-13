package aula31.questao03;

public class Teste {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Paulo","Master");
        Secretaria secretaria = new Secretaria("beatriz", "*101*");

        secretaria.trabalha();
        gerente.trabalha();
    }
}
