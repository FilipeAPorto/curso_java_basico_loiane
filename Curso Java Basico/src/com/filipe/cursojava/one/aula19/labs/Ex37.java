package com.filipe.cursojava.one.aula19.labs;

/*Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tamanho, sendo que cada elemento do vetor B seja o fatorial
do elemento correspondente em A.*/
public class Ex37 {
    public static void main(String[] args) {

        int[] vetorA = new int[15];

        vetorA[0] = 1;
        vetorA[1] = 2;
        vetorA[2] = 3;
        vetorA[3] = 4;
        vetorA[4] = 5;
        vetorA[5] = 6;
        vetorA[6] = 7;
        vetorA[7] = 8;
        vetorA[8] = 9;
        vetorA[9] = 10;
        vetorA[10] = 11;
        vetorA[11] = 12;
        vetorA[12] = 13;
        vetorA[13] = 14;
        vetorA[14] = 15;

        long[] vetorB = new long[15];

        for (int i=0;i< vetorA.length;i++) {

            long k=1;

            System.out.print("\nO fatorial de  "+vetorA[i]+ " é ");

            for (int j = vetorA[i]; j > 0; j--) {

                k *= j;
            }

            vetorB[i] = k;

            System.out.println(vetorB[i]);
        }
    }
}
