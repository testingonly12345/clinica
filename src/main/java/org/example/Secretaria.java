package org.example;

import java.time.LocalDate;

public class Secretaria extends Pessoa{

    private String matriculaFuncional;
    private LocalDate dataAdmissao;


    public String getMatriculaFuncional() {
        return matriculaFuncional;
    }

    public void setMatriculaFuncional(String matriculaFuncional) {
        this.matriculaFuncional = matriculaFuncional;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Secretaria(String cpf, String nome, String telefone, String matriculaFuncional, LocalDate dataAdmissao) {
        super(cpf, nome, telefone);
        this.matriculaFuncional = matriculaFuncional;
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Secretária:\n" +
                "Nome: "+ this.getNome() + "\n" +
                "Cpf:"+ this.getCpf() + "\n" +
                "telefone: "+ this.getTelefone() + "\n" +
                "Matricula: "+ this.getMatriculaFuncional() + "\n" +
                "Data de Admissao: " + this.getDataAdmissao() + "\n");
    }
}
