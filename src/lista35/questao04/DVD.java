package lista35.questao04;

public class DVD extends Midia{
    private String video;
    public DVD(String autor, String video) {
        super(autor);
        if (video.length() == 0){
            System.out.println("Video Invalido");
        }else {
            this.video = video;
        }
    }

    @Override
    public void roda(){
        System.out.println("O DVD está rodando..." + "\nAutor: " + getAutor() + "\nVideo: " + this.video);
    }
}
