package com.filipe.cursojava.poo.aula34_var_met_estatic.labs.ex01;

public class Contador {

    private static int contagem;

    public Contador() {
        contagem = 10;
        contagem++;
    }

    public static void incrementarContador() {
        contagem++;
    }

    public static void zerarContador() {
        contagem = 0;
    }

    public static int retornarContador() {
        return contagem;
    }
}



