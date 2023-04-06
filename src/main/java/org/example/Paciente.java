package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

public class Paciente extends Pessoa{
    private String endereco;
    private LocalDate dataNascimento;

    private ArrayList<Consulta> consultas = new ArrayList<>();


    public Paciente(String cpf, String nome, String telefone, String endereco, LocalDate dataNascimento) {
        super(cpf, nome, telefone);
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;

    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(ArrayList<Consulta> consultas) {
        this.consultas = consultas;
    }

    public void addConsulta(Consulta consulta){
        this.getConsultas().add(consulta);
    }

    public void removeConsulta(Consulta consulta){
        this.getConsultas().remove(consulta);
    }

    @Override
    public void mostrarDados() {
        System.out.println("Paciente:\n" +
                "Nome: "+ this.getNome() + "\n" +
                "Cpf:"+ this.getCpf() + "\n" +
                "Telefone: "+ this.getTelefone() + "\n" +
                "Endereço: "+ this.getEndereco() + "\n" +
                "Data de Nascimento: " + this.getDataNascimento() + "\n");
    }

    public void exibirHistoricoConsultas(){
        System.out.println("Consultas:");
        for (Consulta consulta: this.getConsultas()) {
            System.out.println("------------------------");
            System.out.println(
                    "Data: "+ consulta.getData()+ "\n" +
                    "Hora:"+ consulta.getHora() + "\n" +
                    "Medico: "+ consulta.getMedico().getNome() + "\n" +
                    "Exames: ") ;

        for (Exame exame: consulta.getExames()){
            System.out.println( " - " + exame.getNomeExame());
            }

            System.out.println("Medicamentos: ");
        for (Medicamento medicamento: consulta.getMedicamentos()){
                System.out.println( " - " + medicamento.getNomeMedicamento() );
            }

            System.out.println("\n");

        }
    }
}
