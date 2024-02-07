package com.filipe.cursojava.poo.aula25_26_27_metodo.labs.ex1;

/*Escreva uma classe para representar uma lâmpada. Desenvolva métodos para ligar, desligar a lampada.*/
public class Lampada {

    String fabricante;
    String tipo;
    int potencia;
    String tensao;

    boolean ligada; //atributo

    //metodos
    void acender() {
        ligada = true;
    }

    void apagar() {
        ligada = false;
    }

    void mostrarEstado() {
        if (ligada) {
            System.out.println("Lâmpada está ligada");
        } else {
            System.out.println("Lâmpada está desligada");
        }
    }

    void mudarEstado() {
        if (ligada) {
            apagar();
        } else {
            acender();
        }
    }
}