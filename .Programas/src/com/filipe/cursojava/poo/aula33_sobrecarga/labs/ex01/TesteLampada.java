package com.filipe.cursojava.poo.aula33_sobrecarga.labs.ex01;

public class TesteLampada {
    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        lampada.setFabricante("Ouro Lux");
        lampada.setTipo("LED");
        lampada.setPotencia(60); // Watts
        lampada.setTensao("Bivolt"); // 127v e 220v

        lampada.imprimirInformacoes();

        lampada.acender();

        lampada.mostrarEstado();

        lampada.apagar();

        lampada.mostrarEstado();

        lampada.mudarEstado();

        lampada.mostrarEstado();


    }
}
