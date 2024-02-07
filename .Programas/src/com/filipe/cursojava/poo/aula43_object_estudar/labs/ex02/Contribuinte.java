package com.filipe.cursojava.poo.aula43_object_estudar.labs.ex02;

public abstract class Contribuinte {

    private String nome;
    private double rendaBruta,imposto;

    public Contribuinte() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    abstract double calcularImposto();

    @Override
    public String toString() {
        return "ReceitaFederal{" +
                "nomeContribuinte='" + nome + '\'' +
                ", rendaBruta=" + rendaBruta +
                ", imposto=" + imposto +
                '}';
    }
}