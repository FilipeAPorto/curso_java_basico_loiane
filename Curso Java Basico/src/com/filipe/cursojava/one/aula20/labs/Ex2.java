package com.filipe.cursojava.one.aula20.labs;

import java.util.Random;

/*Gere e imprima uma matriz M 10x10 com valores aleatórios entre 0-9.
Após isso indique qual é o maior e o menor valor da linha 5 e qual é o maior e o menor valor da coluna 7.*/
public class Ex2 {
    public static void main(String[] args) {

        Random gerador = new Random();

        int[][] matrizM = new int[10][10];

        System.out.println("\n**** Vamos criar uma matriz 10x10 Entre 10 e 99 ****\n");

        for(int i = 0;i < matrizM.length;i++){
            for(int j = 0;j < matrizM[i].length;j++){

               matrizM[i][j] = gerador.nextInt(10,99);

                System.out.print(matrizM[i][j] + " | ");
            }
            System.out.println();
        }

        //Codigo para verificar o maior e menor valor da linha 5.

        int linha5 = 4,coluna7 = 6;
        int maiorNumL5 = Integer.MIN_VALUE;
        int menorNumL5 = Integer.MAX_VALUE;

            for (int j=0;j < matrizM[linha5].length;j++){

                if (matrizM[linha5][j] > maiorNumL5){
                    maiorNumL5 = matrizM[linha5][j];
                }

                if (matrizM[linha5][j] < menorNumL5){
                    menorNumL5 = matrizM[linha5][j];
                }
            }
        System.out.println("\nNa linha "+(linha5+1) + " o maior valor inserido é " + maiorNumL5 + " e o menor valor inserido é " + menorNumL5);

            //Codigo para verificar o maior e o menor valor da coluna 7.

        int maiorNumC7 = Integer.MIN_VALUE;
        int menorNumC7 = Integer.MAX_VALUE;

        for (int i=0;i < matrizM.length;i++){

            if (matrizM[i][coluna7] > maiorNumC7){
                maiorNumC7 = matrizM[i][coluna7];
            }

            if (matrizM[i][coluna7] < menorNumC7){
                menorNumC7 = matrizM[i][coluna7];
            }
        }
        System.out.println("Na coluna "+(coluna7+1) + " o maior valor inserido é " + maiorNumC7 + " e o menor valor inserido é " + menorNumC7);
    }
}
