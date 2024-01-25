package com.filipe.cursojava.poo.aula46_interface_herança.labs.ex01_02_03;

public class Cilindro extends Figura3D {

    private double raio, altura;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        //A = 2*pi*r*(r+h)
        setArea(2 * Math.PI * raio * (raio + altura));
    }

    @Override
    public void calcularVolume() {
        setVolume(Math.PI * Math.pow(raio, 2) * altura);
    }

    public String toString() {
        return "**************\n" + getNome() + " - " + getCor() + "\nRaio = " + raio + "\nAltura = " + altura +
                "\nArea = " + getArea() + "cm²" + "\nVolume = " + getVolume() + "cm³" + "\n**************\n";
    }
}
