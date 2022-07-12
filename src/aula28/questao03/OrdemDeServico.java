package aula28.questao03;

public class OrdemDeServico {
    private String equipamento;
    private boolean resolvido = false;
    private Cliente cliente;

    public OrdemDeServico(String equipamento, Cliente cliente) {
        if (equipamento.length() == 0){
            System.out.println("Equipamento invalido!");
        }else {
            this.equipamento = equipamento;
        }
        this.cliente = cliente;
    }

    public boolean resolvida(){
        if (resolvido == false){
            resolvido = true;
            return false;
        }else {
            return true;
        }
    }

    public String toString(){
        return "Nome do equipamento: "
                + this.equipamento
                + "\n"
                + "Nome do Cliente: "
                + cliente.getNome()
                + "\n"
                + "Foi resolvido: "
                + resolvida();
    }
}
