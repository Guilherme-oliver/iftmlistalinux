package lista35.questao04;

public abstract class Midia {
    private String autor;

    public Midia(String autor) {
        if (autor.length() == 0){
            System.out.println("Autor não existe");
        }else {
            this.autor = autor;
        }
    }

    public String getAutor() {
        return autor;
    }

    public abstract void roda();
}
