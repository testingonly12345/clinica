package org.example;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(15,45);
        LocalDate date = LocalDate.of(2022,5,11);

        Paciente paciente1 = new Paciente("1111111111", "Pablo", "19999999999",
                "Rua do IFSP, 789", LocalDate.of(1995,9,22));

        Secretaria secretaria1 = new Secretaria("22222222222", "Aline", "16666666666",
                                    "16161616", date);

        Medico medico1 = new Medico("98989898989", "Lucas", "119999999999",
                "9556599", "Neurologista");

        paciente1.mostrarDados();
        medico1.mostrarDados();
        secretaria1.mostrarDados();

        Exame exame1 = new Exame("Ressonancia Magnetica");
        Exame exame2 = new Exame("Encefaloradiograma");

        Medicamento medicamento1 = new Medicamento("Ibuprofeno");
        Medicamento medicamento2 = new Medicamento("Contraste");

        Consulta consulta1 = new Consulta(LocalDate.of(2023, 4, 5), time, medico1, paciente1, secretaria1);
        consulta1.addExame(exame1);
        consulta1.addExame(exame2);
        consulta1.addMedicamento(medicamento1);
        consulta1.addMedicamento(medicamento2);

        paciente1.addConsulta(consulta1);
        paciente1.exibirHistoricoConsultas();

        // remover um exame e um medicamento da consulta e adciona-la novamente à lista do paciente;
        // note que mesmo sendo a mesma consulta, ela será adicionada como uma segunda consulta;
        consulta1.removeExame(exame2);
        consulta1.removeMedicamento(medicamento1);
        paciente1.addConsulta(consulta1);
        paciente1.exibirHistoricoConsultas();











    }
}