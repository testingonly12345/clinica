package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Consulta {
    private LocalDate data;
    private LocalTime hora;

    private Medico medico;

    private Paciente paciente;

    private Secretaria secretaria;

    private ArrayList<Medicamento> medicamentos = new ArrayList<>();;

    private ArrayList<Exame> exames = new ArrayList<>();;

    public Consulta(LocalDate data, LocalTime hora, Medico medico, Paciente paciente, Secretaria secretaria) {
        this.data = data;
        this.hora = hora;
        this.medico = medico;
        this.paciente = paciente;
        this.secretaria = secretaria;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Secretaria getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(Secretaria secretaria) {
        this.secretaria = secretaria;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public ArrayList<Exame> getExames() {
        return exames;
    }

    public void setExames(ArrayList<Exame> exames) {
        this.exames = exames;
    }

    public void addMedicamento(Medicamento medicamento){
        this.getMedicamentos().add(medicamento);
    }

    public void removeMedicamento(Medicamento medicamento){
        this.getMedicamentos().remove(medicamento);
    }

    public void addExame(Exame exame){
        this.getExames().add(exame);
    }

    public void removeExame(Exame exame){
        this.getExames().remove(exame);
    }
}
