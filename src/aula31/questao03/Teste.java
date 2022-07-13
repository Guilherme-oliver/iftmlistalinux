package aula31.questao03;

public class Teste {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Paulo","Master");
        Funcionario secretaria = new Secretaria("beatriz", "*101*");

        secretaria.trabalha();
        gerente.trabalha();
    }
}
