package aula28.questao03;

public class Teste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Jonas");
        Funcionario funcionario = new Funcionario("Fabricio");
        OrdemDeServico ordemDeServico = new OrdemDeServico("Betoneira",cliente);

        funcionario.resolve(ordemDeServico);
        System.out.println(funcionario.toString());

        System.out.println(ordemDeServico.toString());

        cliente.associaOS(ordemDeServico);
        System.out.println(cliente.toString());

    }
}
