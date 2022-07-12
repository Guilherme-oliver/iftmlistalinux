package aula27.questao05;

public class Pessoa {
    private String nome;
    private boolean homem;
    private Pessoa conjuge;

   public Pessoa(String nome, boolean homem){
       if (nome.length() == 0){
           System.out.println("Nome invalido!");
       }else {
           this.nome = nome;
       }
       this.homem = homem;
   }
   public boolean ehHomem(){
       if (this.homem == false){
           return false;
       }else {
           return true;
       }
   }
    public String getNome() {
        return nome;
    }
    public boolean getCasado() {
        if (this.conjuge == null){
            return false;
        }else {
            return true;
        }
    }
    public void casa(Pessoa p){
       if (this.ehHomem() != p.ehHomem()){
           if (this.getCasado() == false || p.getCasado() == false){
               this.conjuge = p;
               p.aceitaCasamento(this);
           }else {
               System.out.println("Não pode casar!");
           }
       }else {
           System.out.println("Erro!");
       }
    }
    private void aceitaCasamento(Pessoa p){
       this.conjuge = p;
    }
    public boolean divorcia(){
       if (getCasado()){
           aceitaDivorcio();
           this.conjuge = null;
           return true;
       }else {
           System.out.println("Já está solteiro(a)");
           return false;
       }
    }
    private void aceitaDivorcio(){
       this.conjuge.conjuge = null;
    }
    public String toString(){
       String info = "";
       String estadoCivil = (getCasado()) ? "Casado" + "\n" : "Solteiro" + "\n";
       String nomeDoConjuge = (getCasado()) ? "Nome do conjuge: " + this.conjuge.nome : "";
       String sexo = (ehHomem()) ? "Masculino" : "Feminino";
       info += "Nome da pessoa: " + nome + "\n" + "Sexo: " + sexo + "\n" + "Estado civil: "
               + estadoCivil + nomeDoConjuge;
       return info;
    }
}
