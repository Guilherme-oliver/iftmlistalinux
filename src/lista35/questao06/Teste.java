package lista35.questao06;

public class Teste {
    public static void main(String[] args) {
        Terceirizado terceirizado = new Terceirizado("Pedro",35,"SUporte");
        Tecnico tecnico = new Tecnico("João", 27,"Informatica");
        Professor professor = new Professor("Zé",37,"Física","Ms",new Login("abcd","1234"));
        Coordenador coordenador = new Coordenador("Edu", 48,"Administração","Dr",new Login("asdw", "741852"),"Academico","Fluxo administrativo de investimento");
        Aluno aluno = new Aluno("Marcelo",19,"Logistica",new Login("elo19","9512357"));
        VirtualIF virtualIF = new VirtualIF();

        terceirizado.seApresenta();
        terceirizado.trabalha();
        System.out.println(terceirizado.toString());
        System.out.println();
        tecnico.seApresenta();
        tecnico.trabalha();
        tecnico.seCapacita();
        System.out.println(tecnico.toString());
        System.out.println();
        aluno.seApresenta();
        aluno.estuda();
        aluno.autenticacao("elo19","9512357");
        System.out.println(aluno.toString());
        System.out.println();
        professor.seApresenta();
        professor.trabalha();
        professor.seCapacita();
        professor.autenticacao("aawsrg", "845687");
        System.out.println(professor.toString());
        System.out.println();
        coordenador.trabalha();
        coordenador.autenticacao("asdw", "741852");
        System.out.println(coordenador);

       virtualIF.loga(aluno,"elo19", "9512357");
       virtualIF.geraRelatorio(aluno);
       virtualIF.mostraInfo();

    }
}
