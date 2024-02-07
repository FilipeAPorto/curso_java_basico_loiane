package com.filipe.cursojava.tratamento.aula52;

public class UsandoMinhaException {

    public static void main(String[] args) {

        int[] numeros = {4, 8, 5, 21, 16, 32, 64, 128};
        int[] denominador = {2, 0, 2, 8, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                if (numeros[i] % 2 != 0) {
                    //Lançar a exception aqui
                    throw new DivisaoNaoExata_Revisar(numeros[i], denominador[i]);
                }

                System.out.println(numeros[i] + " / " + denominador[i] + " = " + (numeros[i] / denominador[i]));
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata_Revisar e) {
                System.out.println("Occoreu um erro");
                e.printStackTrace();
            }
        }
    }
}
