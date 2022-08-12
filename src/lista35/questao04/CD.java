package lista35.questao04;

public class CD extends Midia{
    private String musica;

    public CD(String autor, String musica) {
        super(autor);
        if (musica.length() == 0){
            System.out.println("Música invalida");
        }else {
            this.musica = musica;
        }
    }

    @Override
    public void roda(){
        System.out.println("CD está rodando..." + "\nNome do autor: " + getAutor() + "\nMusica: " + this.musica);
    }
}
