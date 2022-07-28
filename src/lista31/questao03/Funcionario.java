package lista31.questao03;

public abstract class Funcionario {
    private String nome;
    private static double vr;
    private static int nfunc = 0;

    public Funcionario(String nome) {
        if (nome.length() == 0){
            System.out.println("Nome invalido!");
        }else {
            this.nome = nome;
        }

        this.nfunc += 1;
        this.vr = 393;
    }
    public String toString(){
        String info = "";
        info +="\nInformações do funcionario";
        info += "\nNome do funcionario: " + this.nome;
        info += "\nVR: " + this.vr;
        info += "\nNúmero de funcionario: " + this.nfunc;
        return info;
    }
    public void batePonto(){
        System.out.println("O funcionario: " + this.nome + " bateu o ponto");
    }
    public abstract void trabalha();
}
