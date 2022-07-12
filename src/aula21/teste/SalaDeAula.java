package aula21.teste;

public class SalaDeAula {
    public static int notaMinima = 60;
    private String materia;

    public static void reajustaNota(int nota){
        SalaDeAula.notaMinima = nota;
    }
    public static int getNotaMinima(){
        return SalaDeAula.notaMinima;
    }
    public SalaDeAula(){
    }

    public SalaDeAula(String materia) {
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
