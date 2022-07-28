package lista31.questao02;

public class Comissionado extends Empregado{
    private double totalvenda;
    private double comissao;

    public Comissionado(String nome, String cpf, double totalvenda, double comissao) {
        super(nome, cpf);
        if (totalvenda < 0){
            System.out.println("Total de vendas é invalido");
        }else {
            this.totalvenda = totalvenda;
        }

        if (comissao < 0){
            System.out.println("Comissão é invalido");
        }else {
            this.comissao = comissao;
        }
    }

    public String toString(){
        return "Informações do comissionado: " + super.toString()
                + "\nTotal em vendas: " + this.totalvenda
                + "\nComissão: " + this.comissao
                + "\nCalculo de vencimento: " + this.calcVencimento();
    }
    @Override
    public double calcVencimento() {
        return this.totalvenda * (this.comissao/100);
    }
}
