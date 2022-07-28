package lista28.questao05;

public class Medico {
    private String nome;
    private String crm;
    private Consulta[] consultas = new Consulta[5];

    public Medico(String nome, String crm) {
        if (nome.length() == 0){
            System.out.println("Nome invalio!");
        }else {
            this.nome = nome;
        }

        if (crm.length() == 0){
            System.out.println("CRM invalido!");
        }else {
            this.crm = crm;
        }
    }
    public boolean temEspaco(){
        if (this.consultas != null){
            return false;
        }else {
            return true;
        }
    }
    public void  associaConsulta(Consulta c){
        for (int i = 0; i < consultas.length; i++){
            if (this.consultas[i] == null){
                this.consultas[i] = c;
                break;
            }
        }
    }
    public void removeConsulta(Consulta c){
        for (int i = 0; i < consultas.length; i++){
            if (this.consultas[i] != null){
                this.consultas[i] = c;
                break;
            }
        }
    }
    public String getNome() {
        return nome;
    }

    public String toString(){
        String info = "";
        info += "\nMedico: " + this.nome;
        if (this.consultas[0] == null){
            info += "\nSem pacientes";
        }else {
            for (int i = 0; i < consultas.length; i++){
                if (this.consultas[i] != null){
                    info += "\nConsulta " + (i + 1) + this.consultas[i];
                }else {
                    break;
                }
            }
        }
        return info;
    }
}
