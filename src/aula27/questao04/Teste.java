package aula27.questao04;

public class Teste {
    public static void main(String[] args) {
        Medico medico = new Medico("Phelipe", "THC420");
        Paciente paciente = new Paciente("Pedro", 24);
        Paciente paciente1 = new Paciente("Eduardo", 30);
        Paciente paciente2 = new Paciente("Rafael", 30);

        medico.associaPaciente(paciente);
        medico.associaPaciente(paciente1);
        medico.associaPaciente(paciente2);

        System.out.println(medico.toString());

    }
}
