package com.filipe.cursojava.poo.aula46_interface_herança.labs.ex01_02_03;

public class Teste {
    public static void main(String[] args) {

        int i = 0;

        FiguraGeometrica[] figuraGeometricas = new FiguraGeometrica[500];

        Circulo circulo = new Circulo();

        circulo.setNome("Circulo");
        circulo.setCor("Amarelo");

        circulo.setRaio(15);
        circulo.calcularArea(); //resposta é 706,5cm²

        figuraGeometricas[i] = circulo;

        i++;

        Quadrado quadrado = new Quadrado();

        quadrado.setNome("Quadrado");
        quadrado.setCor("Vermelho");


        quadrado.setLado(12);
        quadrado.calcularArea();    // resposta é 144cm²

        figuraGeometricas[i] = quadrado;

        i++;

        Triangulo triangulo = new Triangulo();

        triangulo.setNome("Triangulo");
        triangulo.setCor("Roxo");

        triangulo.setBase(50);
        triangulo.setAltura(10);

        triangulo.calcularArea(); // resposta é 250cm²

        figuraGeometricas[i] = triangulo;

        i++;

        Cilindro cilindro = new Cilindro();

        cilindro.setNome("Cilindro");
        cilindro.setCor("Verde");

        cilindro.setRaio(50);
        cilindro.setAltura(500);

        cilindro.calcularArea(); // resposta é 172.788 cm²

        cilindro.calcularArea(); // resposta é 3.900.000 cm³


        figuraGeometricas[i] = cilindro;

        i++;


        Cubo cubo = new Cubo();

        cubo.setNome("Cubo");
        cubo.setCor("Vermelho");

        cubo.setLado(12);

        cubo.calcularArea(); // resposta é 864 cm²

        cubo.calcularVolume(); // resposta é 1.728 cm³

        figuraGeometricas[i] = cubo;

        i++;


        Piramide piramide = new Piramide();

        piramide.setNome("Piramide");
        piramide.setCor("Areia");

        piramide.setBase(6);
        piramide.setAltura(4);

        piramide.calcularArea(); // resposta é 96 cm²
        piramide.calcularVolume(); // resposta é 48 cm³

        figuraGeometricas[i] = piramide;

        for (int j = 0; j <= i; j++) {
            System.out.print(figuraGeometricas[j]);
        }
    }

}
