package com.filipe.cursojava.poo.aula46_interface_herança.labs.ex01_02_03;

public abstract class Figura2D extends FiguraGeometrica implements DimensaoSuperficial{

    private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Figura2D{" +
                "area=" + area +
                '}';
    }
}
