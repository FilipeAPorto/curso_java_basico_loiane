package com.filipe.cursojava.poo.aula38_super;

public class Professor extends Pessoa { //Herança

    private String nomeCurso;
    private double salario;

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularSalarioLiquido() {
        return 0;
    }
}
