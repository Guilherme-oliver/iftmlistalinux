package lista05.questao09;

public class Posto {
    private String nome;
    private double precogas;
    private int estoquegas;
    private double precoetanol;
    private int estoqueetanol;
    private double caixa = 0.0;

    public Posto(){

    }

    public Posto(String nome, double precogas, int estoquegas, double precoetanol, int estoqueetanol) {
       if (nome == " "){
           System.out.println("Nome invalido");
       }else {
           this.nome = nome;
       }

       if (precogas < 1.00){
           System.out.println("Preço invalido!");
       }else {
           this.precogas = precogas;
       }

       if (estoquegas <= 0){
           System.out.println("Valor invalido");
       }else {
           this.estoquegas = estoquegas;
       }

       if (estoqueetanol <= 0){
           System.out.println("Valor invalido!");
       }else {
           this.estoqueetanol = estoqueetanol;
       }

       if (precoetanol < 1.00){
           System.out.println("Preço invalido!");
       }else {
           this.precoetanol = precoetanol;
       }

    }

    private String informaGasolina(){
        return "Preço da Gasolina: R$ "
                + precogas
                + "\n"
                + "Estoque: "
                + estoquegas
                + " litros";
    }

    private String informaEtanol(){
        return "Preço da Etanol: R$ "
                + precoetanol
                + "\n"
                + "Estoque: "
                + estoqueetanol
                + " litros";
    }
    public String informaCombustivel(String tipo){
        if (tipo == "Etanol"){
            return informaEtanol();
        }else if (tipo == "Gasolina"){
            return informaGasolina();
        }
        return "invalido!";
    }
    public String informaPariedade(){
        double pariedade = (precogas / precoetanol) * 100;
        if (pariedade > 0.7){
            System.out.println("Prefencia à gasolina");
        }else if (pariedade < 0.7){
            System.out.println("Preferencia à etanol");
        }else {
            System.out.println("Preferencia ao etanol devido ao seu impacto ambiental");
        }
        return String.valueOf(pariedade);
    }
    public String toString(){
        return "Nome do Posto"
                + nome
                + "\n"
                + "Informações dos combustiveis: "
                + informaCombustivel(informaEtanol())
                + "\n"
                + informaCombustivel(informaGasolina())
                + "\n"
                + "Pariedade: "
                + informaPariedade();
    }
    public void vendeCombustivel(String tipo, int litros){
        if (tipo == "Gasolina" && estoquegas > litros){
            caixa = litros * precogas;
        }else if (tipo == "Etanol" && estoqueetanol > litros){
            caixa = litros * precoetanol;
        }else {
            System.out.println("Erro de leitura");
        }

    }
    public void vendeCombustivel(int litros){
        if (estoqueetanol >= estoquegas && litros < estoqueetanol && litros < estoquegas){
            estoqueetanol -= litros;
        }else if (estoquegas > estoqueetanol && litros < estoqueetanol && litros < estoquegas){
            estoquegas -= litros;
        }else {
            System.out.println("Erro de leitura");
        }
    }
}
