package com.filipe.cursojava.intro.aula19.labs;

/*Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
um vetor C, onde cada elemento de C é a divisão dos respectivos
elementos em A e B, ou seja:
C[i] = A[i] / float(B[i]).*/
public class Ex9 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        vetorA[0] = 9;
        vetorA[1] = 5;
        vetorA[2] = 6;
        vetorA[3] = 1;
        vetorA[4] = 2;
        vetorA[5] = 7;
        vetorA[6] = 3;
        vetorA[7] = 8;
        vetorA[8] = 7;
        vetorA[9] = 10;

        double[] vetorB = new double[10];
        vetorB[0] = 10;
        vetorB[1] = 9;
        vetorB[2] = 8;
        vetorB[3] = 7;
        vetorB[4] = 6;
        vetorB[5] = 5;
        vetorB[6] = 4;
        vetorB[7] = 3;
        vetorB[8] = 2;
        vetorB[9] = 1;

        double[] vetorC = new double[10];
        vetorC[0] = vetorA[0] / vetorB[0];
        vetorC[1] = vetorA[1] / vetorB[1];
        vetorC[2] = vetorA[2] / vetorB[2];
        vetorC[3] = vetorA[3] / vetorB[3];
        vetorC[4] = vetorA[4] / vetorB[4];
        vetorC[5] = vetorA[5] / vetorB[5];
        vetorC[6] = vetorA[6] / vetorB[6];
        vetorC[7] = vetorA[7] / vetorB[7];
        vetorC[8] = vetorA[8] / vetorB[8];
        vetorC[9] = vetorA[9] / vetorB[9];

        for (int i=0;i< vetorB.length;i++) {

            System.out.println("Vetor C número " + (i + 1) + " é " + vetorC[i]);
        }
    }
}
