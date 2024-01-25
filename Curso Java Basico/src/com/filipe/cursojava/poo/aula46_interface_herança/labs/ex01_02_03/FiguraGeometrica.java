package com.filipe.cursojava.poo.aula46_interface_herança.labs.ex01_02_03;

public abstract class FiguraGeometrica {

    private String nome, cor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    @Override
    public String toString() {
        return "FiguraGeometrica{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}
