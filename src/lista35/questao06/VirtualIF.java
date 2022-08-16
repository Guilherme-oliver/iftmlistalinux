package lista35.questao06;

public class VirtualIF {
    private static int totalrelatorios = 0;
    private static int totalacessos = 0;

    public static void loga(Usuario u, String usuario, String senha){

        if (u.autenticacao(usuario, senha)){
            totalacessos++;
            System.out.println("Módulo aberto");
        }else {
            System.out.println("Falha no usuario ou senha");
        }
    }

    public static void geraRelatorio(Pessoa pessoa){
        totalrelatorios++;
        System.out.println(pessoa.toString());
    }

    public static void mostraInfo(){
        System.out.println("Total de acessos: " + totalacessos);
        System.out.println("Total de relatorios: " + totalrelatorios);

    }
}
