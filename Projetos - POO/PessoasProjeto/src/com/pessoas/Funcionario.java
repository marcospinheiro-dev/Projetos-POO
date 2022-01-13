package com.pessoas;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    public void mudaTrabalho() {
        this.trabalhando = ! trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", sexo='" + getSexo() + '\'' +
                ", setor='" + setor + '\'' +
                ", trabalhando=" + trabalhando +
                '}';
    }
}
