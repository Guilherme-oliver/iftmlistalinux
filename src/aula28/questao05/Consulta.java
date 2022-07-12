package aula28.questao05;

public class Consulta {
    private String data;
    private boolean realiza = false;
    private Medico medico;
    private Paciente paciente;

    public Consulta(String data, Medico medico, Paciente paciente) {
        if (data.length() == 0){
            System.out.println("Data invalida!");
        }else {
            this.data = data;
        }
        this.medico = medico;
        this.medico.associaConsulta(this);
        this.paciente = paciente;
        this.paciente.associaConsulta(this);
    }

    public void realizaConsulta(){
        if (realiza == true){

        }else {
            this.realiza = true;
            medico.removeConsulta(this);
            paciente.removeConsulta(this);
        }
    }

    public String toString(){
        return "Data da consulta: "
                + this.data
                + "\n"
                + "Nome do paciente: "
                + this.paciente.getNome()
                + "\n"
                + "Nome do médico: "
                + this.medico.getNome();
    }
}
