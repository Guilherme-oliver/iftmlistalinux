package lista27.questao04;

import java.util.LinkedList;

public class Medico {
    private String nome;
    private String crm;
    private LinkedList<Paciente> pacientes = new LinkedList<>();

    public Medico(String nome, String crm) {
        if (nome.length() <= 0){
            System.out.println("Nome invalido!");
        }else {
            this.nome = nome;
        }
        if (crm.length() <= 0){
            System.out.println("CRM invalido!");
        }else {
            this.crm = crm;
        }
    }

    public String getNome(){
        return nome;
    }

    public void associaPaciente(Paciente p){
        this.pacientes.add(p);
    }

    public String toString(){
        String info = "";
        if (this.pacientes.size() == 0){
            info += "\nSem paciente";
        }else {
            for (int i=0; i<this.pacientes.size(); i++){
                info += "\nPaciente: " + (i + 1) + ": " + this.pacientes.get(i);
            }
        }
        return "Nome do médico: "
                + this.nome
                + "\n"
                + "CRM: "
                + crm
                + "\n"
                + info;
    }
}
