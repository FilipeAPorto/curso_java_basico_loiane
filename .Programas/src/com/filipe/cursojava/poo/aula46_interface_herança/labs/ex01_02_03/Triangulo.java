package com.filipe.cursojava.poo.aula46_interface_herança.labs.ex01_02_03;

public class Triangulo extends Figura2D {

    private double base, altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        setArea((base * altura) / 2);
    }

    public String toString() {
        return "**************\n" + getNome() + " - " + getCor() + "\nBase = " + base + "\nAltura = " + altura + "\nArea = " + getArea() + "cm²" + "\n**************\n";
    }
}
