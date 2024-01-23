package com.filipe.cursojava.poo.aula43_object_estudar.labs.ex03;

public class Peixe extends Animal {

    private String caracteristica;

    public Peixe() {
    }

    public Peixe(String nome, String cor, String ambiente, double velocidade, int comprimento, int patas, String caracteristica) {
        super(nome, cor, ambiente, velocidade, comprimento, patas);
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    @Override
    public String toString() {
        if(getCaracteristica() != null) {
            return "\nAnimal: " + this.getNome() + "\nComprimento: " + this.getComprimento() + "\nPatas: " + this.getPatas() +
                    "\nCor: " + this.getCor() + "\nAmbiente: " + this.getAmbiente() + "\nVelocidade: " + this.getVelocidade() +
                    "\nCaracteristica: " + this.getCaracteristica();
        }else {
           return super.toString();
        }
    }
}
