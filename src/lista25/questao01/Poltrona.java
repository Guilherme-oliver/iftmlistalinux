package lista25.questao01;
//Composição: Multiplicidade 0..1
public class Poltrona {
    private int numero;
    private Pessoa pessoa;

    public Poltrona(int numero) {
        if (numero < 0){
            System.out.println("Número invalido!");
        }else {
            this.numero = numero;
        }
    }
    public void senta(String nome){
        if (this.pessoa == null){
            this.pessoa = new Pessoa(nome);
        }else {
            System.out.println("Já possui uma pessoa na poltrona");
        }
    }
    public void levanta(){
        if (this.pessoa != null){
            this.pessoa = null;
        }else {
            System.out.println("A pessoa já levantou");
        }
    }

    @Override
    public String toString() {
        return "Poltrona{" +
                "numero=" + numero +
                ", pessoa=" + pessoa +
                '}';
    }
}
