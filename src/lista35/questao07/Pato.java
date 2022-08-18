package lista35.questao07;

public final class Pato extends Ave implements PodeVoar{
    private int escapadas = 0;

    public Pato(String nome, int peso) {
        super(nome, peso);
    }

    @Override
    public String toString(){
        String info = "";
        info += "\nNome: " + super.getNome();
        info += "\nPeso: " + super.getPeso();
        info += "\nEscapadas: " + this.escapadas;
        return info;
    }

    public void emiteSom(){
        System.out.println("\nQuack " + "\n" + toString());
    }

    @Override
    public void voa() {
        this.escapadas++;
        System.out.println(toString() + "\nEscapou de uma pessoa voando!");
    }
}
