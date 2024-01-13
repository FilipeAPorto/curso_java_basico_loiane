package com.filipe.cursojava.poo.aula34_var_met_estatic.labs.ex02;

public class MinhaCalculadora {

    private static double resultado, num1, num2, operador;
    private static String sinal;

    public MinhaCalculadora() {
    }

    public static double getNum1() {
        return num1;
    }

    public static void setNum1(double num1) {
        MinhaCalculadora.num1 = num1;
    }

    public static double getNum2() {
        return num2;
    }

    public static void setNum2(double num2) {
        MinhaCalculadora.num2 = num2;
    }

    public static double getOperador() {
        return operador;
    }

    public static void setOperador(double operador) {
        MinhaCalculadora.operador = operador;
    }

    static double somar(double num1, double num2) {

        resultado = num1 + num2;

        sinal = " + ";

        return resultado;
    }


    static double subtrair(double num1, double num2) {
        resultado = num1 - num2;

        sinal = " - ";

        return resultado;
    }

    static double multiplicar(double num1, double num2) {
        resultado = num1 * num2;

        sinal = " * ";

        return resultado;
    }

    static double dividir(double num1, double num2) {
        resultado = num1 / num2;

        sinal = " / ";

        return resultado;
    }

    static double potencia(double num1, double num2) {
        resultado = Math.pow(num1, num2);

        sinal = " ^ ";

        return resultado;
    }

    static void exibirResultado() {
        System.out.println(num1 + sinal + num2 + " = " + resultado);
        System.out.println();
    }
}
