package com.filipe.cursojava.poo.aula43_object_estudar.labs.ex02;

public abstract class ReceitaFederal {

    private String nomeContribuinte;
    private double rendaBruta,imposto;

    public ReceitaFederal() {
    }

    public String getNomeContribuinte() {
        return nomeContribuinte;
    }

    public void setNomeContribuinte(String nomeContribuinte) {
        this.nomeContribuinte = nomeContribuinte;
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

    @Override
    public String toString() {
        return "ReceitaFederal{" +
                "nomeContribuinte='" + nomeContribuinte + '\'' +
                ", rendaBruta=" + rendaBruta +
                ", imposto=" + imposto +
                '}';
    }
}