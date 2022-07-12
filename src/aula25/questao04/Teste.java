package aula25.questao04;

public class Teste {
    public static void main(String[] args) {

        Empresa empresa = new Empresa("Joao");
        empresa.contrata("Jose", 1500);
        empresa.contrata("Paulo", 2000);

        System.out.println(empresa);
    }
}
