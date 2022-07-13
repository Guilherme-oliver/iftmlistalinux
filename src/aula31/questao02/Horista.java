package aula31.questao02;

public class Horista extends Empregado{
    private double precoHora;
    private int horasTrabalhadas;

    public Horista(String nome, String cpf, double precoHora, int horasTrabalhadas) {
        super(nome, cpf);
        if (precoHora < 0){
            System.out.println("Preço por hora é invalido!");
        }else {
            this.precoHora = precoHora;
        }

        if (horasTrabalhadas < 0){
            System.out.println("Horas trabalhadas é invalido");
        }else {
            this.horasTrabalhadas = horasTrabalhadas;
        }
    }

    public String toString(){
        return "Informações do horista: " + super.toString()
                + "\nPreço da hora trabalhada: " + this.precoHora
                + "\nHoras trabalhadas: " + this.horasTrabalhadas
                + "\nCalculo do vencimento: " + this.calcVencimento();
    }
    @Override
    public double calcVencimento() {
        return this.precoHora * this.horasTrabalhadas;
    }
}
