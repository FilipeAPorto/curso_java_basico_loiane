package com.filipe.cursojava.poo.aula24.labs.ex1;

public class LampadaLED {
    public static void main(String[] args) {

        Lampada1 led = new Lampada1();

        led.fabricante = "Ouro Lux";
        led.tipo = "LED";
        led.potencia = 60; // Watts
        led.tensao = "Bivolt"; // 127v e 220v

        System.out.println(led.fabricante);
        System.out.println(led.tipo);
        System.out.println(led.potencia);
        System.out.println(led.tensao);



    }
}
