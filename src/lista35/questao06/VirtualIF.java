package lista35.questao06;

public class VirtualIF {
    private static int totalrelatorios = 0;
    private static int totalacessos = 0;

    public void loga(Usuario u, String usuario, String senha){
        if (u.autenticacao(usuario, senha) == true){
            totalacessos++;
            System.out.println("Módulo aberto");
        }else {
            System.out.println("Falha no usuario ou senha");
        }
    }

    public void geraRelatorio(Pessoa pessoa){
        totalrelatorios++;
        System.out.println(pessoa.toString());
    }

    public void mostraInfo(){
        System.out.println("Total de acessos: " + totalacessos);
        System.out.println("Total de relatorios: " + totalrelatorios);

    }
}
