package com.filipe.cursojava.poo.aula34_var_met_estatic;

public class MinhaCalculadora {

    public static int somar(int num1, int num2) {
        return num1 + num2;
    }

    public static double somar(double num1, double num2) {
        return num1 + num2;
    }

    public static int somar(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static int somar(int[] vetorInteiros) {

        int total = 0;

        for (int i = 0; i < vetorInteiros.length; i++) {
            total += vetorInteiros[i];
        }
        return total;
    }
}
