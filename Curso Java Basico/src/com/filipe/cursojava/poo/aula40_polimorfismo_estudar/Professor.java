package com.filipe.cursojava.poo.aula40_polimorfismo_estudar;

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

    public String obterEtiquetaEndereco() {

        String s = "Endereço do Professor : ";
        s += this.getEndereco();

        return s;
    }
}