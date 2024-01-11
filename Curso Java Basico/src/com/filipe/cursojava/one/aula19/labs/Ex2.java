package com.filipe.cursojava.one.aula19.labs;

/*Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os elementos do vetor A multiplicados
por 2, ou seja: B[i] = A[i] * 2.*/
public class Ex2 {
    public static void main(String[] args) {

        int[] vetorA = new int[8];
        vetorA[0] = 1;
        vetorA[1] = 3;
        vetorA[2] = 5;
        vetorA[3] = 7;
        vetorA[4] = 9;
        vetorA[5] = 11;
        vetorA[6] = 13;
        vetorA[7] = 15;

        for (int i=0;i< vetorA.length;i++){

            System.out.println("Vetor A número "+(i+1) +" é "+ vetorA[i]);
        }

        int[] vetorB = new int[8];
        vetorB[0] = vetorA[0] * 2;
        vetorB[1] = vetorA[1] * 2;
        vetorB[2] = vetorA[2] * 2;
        vetorB[3] = vetorA[3] * 2;
        vetorB[4] = vetorA[4] * 2;
        vetorB[5] = vetorA[5] * 2;
        vetorB[6] = vetorA[6] * 2;
        vetorB[7] = vetorA[7] * 2;

        for (int i=0;i< vetorB.length;i++){

            System.out.println("Vetor B número "+(i+1) +" é "+ vetorB[i]);
        }
    }
}
