package com.filipe.cursojava.intro.aula20.labs;

import java.util.Random;

/*Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
Após isso determine o maior número da matriz e a sua posição (linha, coluna).*/
public class Ex1 {
    public static void main(String[] args) {

        Random gerador = new Random();

        int[][] matrizM = new int[4][4];

        System.out.println("Gerando uma matriz 4x4.");

        for(int i = 0;i < matrizM.length;i++){
            for(int j = 0;j < matrizM[i].length;j++){

                matrizM[i][j] = gerador.nextInt(100);

                System.out.print(matrizM[i][j]+ " ");
            }
            System.out.println();
        }

        int maiorNum = Integer.MIN_VALUE,linha=0,coluna=0;

         for(int i = 0;i < matrizM.length;i++){
            for(int j = 0;j < matrizM[i].length;j++){

                if (matrizM[i][j] > maiorNum){
                    maiorNum = matrizM[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        System.out.println("\nO maior valor da matriz é "+maiorNum);
        System.out.println("Esta na linha " +(linha+1));
        System.out.println("Esta na coluna "+(coluna+1));
    }
}