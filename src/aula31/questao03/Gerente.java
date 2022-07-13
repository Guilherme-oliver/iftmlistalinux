package aula31.questao03;



public class Gerente extends  Funcionario{
    private String sala;

    public Gerente(String nome, String sala) {
        super(nome);
        if (sala.length() == 0){
            System.out.println("Sala invalida");
        }else {
            this.sala = sala;
        }

    }


    public String toString(){
        return "Informações do Gerente: " + super.toString()
                +"\nSala: " + this.sala;
    }
    @Override
    public void trabalha() {
        System.out.println(super.toString() + " \nEstá gerenciando!" );
    }
}
