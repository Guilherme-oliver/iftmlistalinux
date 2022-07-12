package aula21.questao01;

public class Cachorro {
    private String nome;
    private int idade;
    private static int numcachorros = 0;
    private int numfilhotes = 0;
    private static int totalfilhotes= 0;

    public Cachorro(String nome, int idade){
        if (idade < 0 || idade > 18){
            System.out.println("Valor invalido!");
        }else {
            this.idade = idade;
        }
        if (nome == " "){
            System.out.println("Nome invalido!");
        }else {
            this.nome = nome;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static int getNumcachorros() {
        return numcachorros;
    }

    public static void setNumcachorros(int numcachorros) {
        Cachorro.numcachorros = numcachorros;
    }

    public int getNumfilhotes() {
        return numfilhotes;
    }

    public void setNumfilhotes(int numfilhotes) {
        this.numfilhotes = numfilhotes;
    }

    public static int getTotalfilhotes() {
        return totalfilhotes;
    }

    public static void setTotalfilhotes(int totalfilhotes) {
        Cachorro.totalfilhotes = totalfilhotes;
    }

    public void reproduz(){
        if (numcachorros > 2){
            numfilhotes++;
            System.out.println("Um filhote de cachorro foi gerado");
            totalfilhotes += numfilhotes;
        }else {
            System.out.println("Não pode ser gerado um filhote");
        }
    }
    public void reproduz(int filhotes){
        if (filhotes < 0 || filhotes > 8){
            System.out.println("Valor Invalido");
        }else {
            do {
              reproduz();
              filhotes++;
            }while (filhotes < 8);
            totalfilhotes += filhotes;
        }
    }
    public String toString(){
        return "Numeros de cachorros: "
                + numcachorros
                +"\n"
                + "Numeros de filhotes gerados: "
                + numfilhotes
                +"\n"
                + "Total de filhotes: "
                + totalfilhotes;
    }
    public static void infoCanil(){
        System.out.println("Numero de cachorros: ");
        System.out.println(numcachorros);
        System.out.println("Total de filhotes");
        System.out.println(totalfilhotes);
    }
}
