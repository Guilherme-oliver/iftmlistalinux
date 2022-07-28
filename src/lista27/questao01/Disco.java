package lista27.questao01;
//Associação - 1 para 0..*
import java.util.LinkedList;

public class Disco {

    private int capacidade;
    private LinkedList<Arquivo> arquivos = new LinkedList<Arquivo>();

    public Disco(int capacidade) {
        if (capacidade < 0){
            System.out.println("Valor invalido!");
        }else {
            this.capacidade = capacidade;
        }
    }

    public void grana(Arquivo a){
        if (arquivos.size() <= capacidade){
            this.arquivos.add(a);
        }else {
            System.out.println("Erro");
        }
    }
    public String toString(){
        return "Capacidade: "
                + capacidade
                + "\n"
                + arquivos.toString();
    }

}
