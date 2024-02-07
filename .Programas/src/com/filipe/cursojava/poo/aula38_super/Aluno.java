package com.filipe.cursojava.poo.aula38_super;

public class Aluno extends Pessoa { //Herança

    private String curso;
    private double[] notas;


    public Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String curso, double[] notas) {
        super(nome, endereco, telefone);
        this.curso = curso;
        this.notas = notas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        return 0;
    }

    public boolean verificarAprovado() {
        return true;
    }

    void metodoQualquer(){
        super.setCpf("85857484");
    }
}
