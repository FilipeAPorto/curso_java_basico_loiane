package com.filipe.cursojava.poo.aula46_interface_herança.labs.ex01_02_03;

public class Cubo extends Figura3D {

    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        setArea(6 * (Math.pow(lado, 2)));
    }

    @Override
    public void calcularVolume() {
        setVolume(Math.pow(lado, 3));
    }

    public String toString() {
        return "**************\n" + getNome() + " - " + getCor() + "\nlado = " + lado + "\nArea = " + getArea() + "cm²" +
                "\nVolume = " + getVolume() + "cm³" + "\n**************\n";
    }
}
