package com.filipe.cursojava.tratamento.aula49;

public class TestandoFinally {
    public static void main(String[] args) {

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denominador = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {

                System.out.println(numeros[i] + " / " + denominador[i] + " = " + (numeros[i] / denominador[i]));
            } catch (ArithmeticException e) {
                System.out.println("Erro ao dividir por zero");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Posição do array inválida");
            } finally {  // O FINALLY É SEMPRE EXECUTADO , POREM ...
                System.out.println("Essa linha é impressa sempre após o try ou catch");
            }
        }
    }
}