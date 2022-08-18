package lista35.questao07;

public final class Pessoa {
    private String nome;
    private int aves = 0;

    public Pessoa(String nome) {
        if (nome.length() == 0){
            System.out.println("Nome invalido!");
        }else {
            this.nome = nome;
        }
    }

    public String toString(){
        String info = "";
        info += "Nome: " + this.nome;
        info += "\nAves capturadas: " + this.aves;
        return info;
    }

    public void captura(Ave ave){
        if (ave instanceof Galinha){
            Galinha galinha = (Galinha) ave;
            if (galinha.getPeso() < 1){
                System.out.println(toString() + "\nTentou capturar a ave");
                galinha.emiteSom();
                System.out.println("Não pode ser capturada!");
            }else {
                System.out.println(toString() + "\nTentou capturar a ave");
                this.aves++;
                galinha.emiteSom();
                System.out.println("A pessoa capturou a ave!");            }
        } else if (ave instanceof Pato) {
            Pato pato = (Pato) ave;
            System.out.println(toString() + "\nTentou capturar a ave");
            pato.emiteSom();
            pato.voa();
            System.out.println("Ave escapou");
        }
    }
}
