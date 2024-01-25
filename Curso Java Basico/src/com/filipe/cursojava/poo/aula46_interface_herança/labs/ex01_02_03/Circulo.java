package com.filipe.cursojava.poo.aula46_interface_herança.labs.ex01_02_03;

public class Circulo extends Figura2D {

    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {

        setArea(Math.PI * raio);
    }

    @Override
    public String toString() {
        return "**************\n" + getNome() + " - " + getCor() + "\nRaio = " + raio + "\nArea = " + getArea() + "cm²" + "\n**************\n";
    }
}
