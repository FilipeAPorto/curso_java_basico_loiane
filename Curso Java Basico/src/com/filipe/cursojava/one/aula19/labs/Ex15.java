package com.filipe.cursojava.one.aula19.labs;

/*Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
que defina o percentual de elementos pares e ímpares,
respectivamente, armazenados neste vetor.*/
public class Ex15 {
    public static void main(String[] args) {

        double impar=0,par=0;
        int i=0;

        int[] vetorA = new int[10];
        vetorA[0] = 40;
        vetorA[1] = 29;
        vetorA[2] = 95;
        vetorA[3] = 76;
        vetorA[4] = 54;
        vetorA[5] = 91;
        vetorA[6] = 33;
        vetorA[7] = 27;
        vetorA[8] = 15;
        vetorA[9] = 87;

        for(;i<vetorA.length;i++){

            if (vetorA[i] % 2 == 0){
                par++;

            } else {
                impar++;

            }
        }
        System.out.println("São "+(par/i)*100+"% de números pares");
        System.out.println("São "+(impar/i)*100+"% de números impares");


    }
}
