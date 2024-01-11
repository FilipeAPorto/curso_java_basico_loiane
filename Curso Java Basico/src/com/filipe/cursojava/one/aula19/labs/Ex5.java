package com.filipe.cursojava.one.aula19.labs;

/*Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o respectivo elemento de A multiplicado por sua posição (ou
índice), ou seja:
B[i] = A[i] * i.*/
public class Ex5 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        vetorA[0] = 0;
        vetorA[1] = 1;
        vetorA[2] = 2;
        vetorA[3] = 3;
        vetorA[4] = 4;
        vetorA[5] = 5;
        vetorA[6] = 6;
        vetorA[7] = 7;
        vetorA[8] = 8;
        vetorA[9] = 9;

        for (int i=0;i< vetorA.length;i++){

            System.out.println("Vetor A número "+(i) +" é "+ vetorA[i]);
        }

        int[] vetorB = new int[10];
        vetorB[0] = vetorA[0] * 0;
        vetorB[1] = vetorA[1] * 1;
        vetorB[2] = vetorA[2] * 2;
        vetorB[3] = vetorA[3] * 3;
        vetorB[4] = vetorA[4] * 4;
        vetorB[5] = vetorA[5] * 5;
        vetorB[6] = vetorA[6] * 6;
        vetorB[7] = vetorA[7] * 7;
        vetorB[8] = vetorA[8] * 8;
        vetorB[9] = vetorA[9] * 9;

        for (int i=0;i< vetorB.length;i++){

            System.out.println("Vetor B número "+(i) +" é "+ vetorB[i]);
        }
    }
}
