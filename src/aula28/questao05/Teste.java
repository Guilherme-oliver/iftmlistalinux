package aula28.questao05;

public class Teste {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Gabriel", 20);
        Paciente paciente1 = new Paciente("Manuel", 55);

        Medico medico = new Medico("Paulo", "ADDMC15");

        Consulta consulta = new Consulta("07/07/2022", medico,paciente);
        Consulta consulta1 = new Consulta("08/08/2022", medico, paciente1);
        medico.associaConsulta(consulta);
        paciente.associaConsulta(consulta);
        consulta.realizaConsulta();

        medico.temEspaco();
        paciente1.temConsulta();
        medico.associaConsulta(consulta1);
        paciente1.associaConsulta(consulta1);
        consulta1.realizaConsulta();

        System.out.println(consulta);
        System.out.println(consulta1);
    }
}
