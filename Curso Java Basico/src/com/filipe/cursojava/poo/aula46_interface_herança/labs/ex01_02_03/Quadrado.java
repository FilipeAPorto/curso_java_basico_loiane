package com.filipe.cursojava.poo.aula46_interface_herança.labs.ex01_02_03;

public class Quadrado extends Figura2D implements DimensaoSuperficial {

    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        setArea(Math.pow(lado, 2));
    }

    public String toString() {
        return "**************\n" + getNome() + " - " + getCor() + "\nLado = " + lado + "\nArea = " + getArea() + "cm²" + "\n**************\n";
    }
}
