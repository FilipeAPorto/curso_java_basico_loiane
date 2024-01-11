package com.filipe.cursojava.poo.aula24.labs.ex1;

public class LampadaFlorecente {
    public static void main(String[] args) {

        Lampada1 led = new Lampada1();

        led.fabricante = "Toschiba";
        led.tipo = "Fluorecente";
        led.potencia = 15; // Watts
        led.tensao = "127"; // 127v

        System.out.println(led.fabricante);
        System.out.println(led.tipo);
        System.out.println(led.potencia);
        System.out.println(led.tensao);


    }
}
