package com.filipe.cursojava.poo.aula43_object_estudar.labs.ex03;

public class Mamifero extends Animal {

    private String alimento;

    public Mamifero() {
    }

    public Mamifero(String nome, String cor, String ambiente, double velocidade, int comprimento, int patas, String alimento) {
        super(nome, cor, ambiente, velocidade, comprimento, patas);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        if (getAlimento() != null) {
            return "\nAnimal: " + this.getNome() + "\nComprimento: " + this.getComprimento() + "\nPatas: " + this.getPatas() +
                    "\nCor: " + this.getCor() + "\nAmbiente: " + this.getAmbiente() + "\nVelocidade: " + this.getVelocidade() +
                    "\nAlimento: " + this.getAlimento();
        }
        return super.toString();
    }
}
