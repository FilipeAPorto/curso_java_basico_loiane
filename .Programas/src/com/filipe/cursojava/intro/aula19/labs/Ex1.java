package com.filipe.cursojava.intro.aula19.labs;

/*Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou
seja, B[i] = A[i].*/
public class Ex1 {
    public static void main(String[] args) {

        int[] vetorA = new int[5];
        vetorA[0] = 2;
        vetorA[1] = 4;
        vetorA[2] = 6;
        vetorA[3] = 8;
        vetorA[4] = 10;

        for (int i=0;i< vetorA.length;i++) {

            System.out.println("Vetor A número "+(i+1) +" é "+ vetorA[i]);
        }

        int[] vetorB = new int[5];
        vetorB[0] = vetorA[0];
        vetorB[1] = vetorA[1];
        vetorB[2] = vetorA[2];
        vetorB[3] = vetorA[3];
        vetorB[4] = vetorA[4];

        for (int i=0;i< vetorB.length;i++) {

            System.out.println("Vetor B número "+(i+1) +" é "+ vetorB[i]);
        }
    }
}
