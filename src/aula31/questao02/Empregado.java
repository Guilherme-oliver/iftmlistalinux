package aula31.questao02;

public abstract class Empregado {
    private String nome;
    private String cpf;

    public Empregado(String nome, String cpf) {
        if (nome.length() == 0){
            System.out.println("Nome invalido!");
        }else {
            this.nome = nome;
        }

        if (cpf.length() == 0){
            System.out.println("CPF invalido!");
        }else {
            this.cpf = cpf;
        }
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "mome='" + this.nome + '\'' +
                ", cpf='" + this.cpf + '\'' +
                '}';
    }
    public abstract double calcVencimento();
}
