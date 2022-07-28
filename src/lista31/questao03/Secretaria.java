package lista31.questao03;

public class Secretaria extends Funcionario{
    private String ramal;

    public Secretaria(String nome, String ramal) {
        super(nome);
        if (ramal.length() == 0){
            System.out.println("Ramal invalido!");
        }else {
            this.ramal = ramal;
        }
    }

    public String toString(){
        return  super.toString()
                + "\nRamal: " + this.ramal;

    }
    @Override
    public void trabalha() {
        this.toString();
        System.out.println(this.toString() + "\nEstá atendendo!");
    }
}
