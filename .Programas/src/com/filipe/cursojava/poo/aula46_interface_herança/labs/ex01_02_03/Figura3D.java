package com.filipe.cursojava.poo.aula46_interface_herança.labs.ex01_02_03;

public abstract class Figura3D extends FiguraGeometrica implements DimensaoSuperficial,DimensaoVolumetrica{

    private double area, volume;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
