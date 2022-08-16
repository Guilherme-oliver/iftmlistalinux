package lista35.questao06;

public class Teste {
    public static void main(String[] args) {
        Login login = new Login("elo19", "741852");
        Terceirizado terceirizado = new Terceirizado("Pedro",35,"Suporte");
        Tecnico tecnico = new Tecnico("João", 27,"Informatica");
        Professor professor = new Professor("Zé",37,"Física","Ms",new Login("abcd","1234"));
        Coordenador coordenador = new Coordenador("Edu", 48,"Administração","Dr",new Login("dcba", "4321"),"Academico","Fluxo administrativo de investimento");
        Aluno aluno = new Aluno("Marcelo",19,"Logistica",login);

        terceirizado.seApresenta();
        terceirizado.trabalha();
        System.out.println(terceirizado);
        System.out.println();
        tecnico.seApresenta();
        tecnico.trabalha();
        tecnico.seCapacita();
        System.out.println(tecnico);
        System.out.println();
        aluno.seApresenta();
        aluno.estuda();
        aluno.autenticacao("elo19","741852");
        System.out.println(aluno);
        System.out.println();
        professor.seApresenta();
        professor.trabalha();
        professor.seCapacita();
        professor.autenticacao("abcd", "1234");
        System.out.println(professor);
        System.out.println();
        coordenador.trabalha();
        coordenador.autenticacao("dcba", "4321");
        System.out.println(coordenador);
        System.out.println();
        VirtualIF.loga(professor,"xjcp","789654");
        VirtualIF.geraRelatorio(professor);
        VirtualIF.mostraInfo();
        System.out.println();
        VirtualIF.loga(aluno, "elo19", "741852");
        VirtualIF.geraRelatorio(aluno);
        VirtualIF.mostraInfo();

    }
}
