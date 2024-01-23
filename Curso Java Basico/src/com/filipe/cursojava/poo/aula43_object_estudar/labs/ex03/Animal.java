package com.filipe.cursojava.poo.aula43_object_estudar.labs.ex03;

public abstract class Animal {

    private String nome,cor,ambiente;
    private double velocidade;
    private int comprimento,patas;

    public Animal() {
    }

    public Animal(String nome, String cor, String ambiente, double velocidade, int comprimento, int patas) {
        this.nome = nome;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
        this.comprimento = comprimento;
        this.patas = patas;
    }

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

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    @Override
    public String toString() {
        return "\nAnimal: " + this.getNome() + "\nComprimento: " + this.getComprimento() + "\nPatas: " + this.getPatas() +
                "\nCor: " + this.getCor() + "\nAmbiente: " + this.getAmbiente() + "\nVelocidade: " + this.getVelocidade();
    }

}
