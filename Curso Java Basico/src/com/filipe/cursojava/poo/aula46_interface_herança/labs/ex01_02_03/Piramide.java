package com.filipe.cursojava.poo.aula46_interface_herança.labs.ex01_02_03;

public class Piramide extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica {

    // Medidas so da base e altura


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
        double apotema = Math.sqrt(Math.pow((base / 2), 2) + Math.pow(altura, 2));

        double areaFaceLateral = (base * apotema) / 2;

        double areaLateral = 4 * areaFaceLateral;

        double areaBase = Math.pow(base, 2);

        setArea(areaLateral + areaBase);
    }

    @Override
    public void calcularVolume() {

        double areaBase = Math.pow(base, 2);

        setVolume(((double) 1 / 3) * areaBase * altura);
    }

    public String toString() {
        return "**************\n" + getNome() + " - " + getCor() + "\nBase = " + base + "\nAltura = " + altura + "cm²" +
                "\nArea = " + getArea() + "\nVolume = " + getVolume() + "cm³" + "\n**************\n";
    }

}
