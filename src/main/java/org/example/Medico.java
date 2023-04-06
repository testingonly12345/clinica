package org.example;

public class Medico extends Pessoa{
    private String numCRM;
    private String especialidade;

    public Medico(String cpf, String nome, String telefone, String numCRM, String especialidade) {
        super(cpf, nome, telefone);
        this.numCRM = numCRM;
        this.especialidade = especialidade;
    }

    public String getNumCRM() {
        return numCRM;
    }

    public void setNumCRM(String numCRM) {
        this.numCRM = numCRM;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }


    @Override
    public void mostrarDados() {
        System.out.println("Médico:\n" +
                "Nome: "+ this.getNome() + "\n" +
                "Cpf:"+ this.getCpf() + "\n" +
                "Telefone: "+ this.getTelefone() + "\n" +
                "CRM: "+ this.getNumCRM() + "\n" +
                "Especialidade: " + this.getEspecialidade() + "\n");
    }
}
