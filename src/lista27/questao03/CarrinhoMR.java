package lista27.questao03;

public class CarrinhoMR {
    private String id;
    private Visitante visitante;
    public CarrinhoMR(String id) {
        if (id.length() == 0){
            System.out.println("ID invalido");
        }else {
            this.id = id;
        }
    }
    public boolean associaOcupante(Visitante v){
        if (this.visitante == null){
            this.visitante = v;
            return true;
        }else {
            return false;
        }
    }
    public void daVolta(){
        if (associaOcupante(null)){
            System.out.println("Carrinho vazio não pode sair!");
        }else {
            System.out.println("Os visitante(s) está(ão) dando uma volta");
            this.visitante = null;
            System.out.println("Depois da volta, todos foram embora!");
        }
    }
}
