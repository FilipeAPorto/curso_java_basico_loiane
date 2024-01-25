package com.filipe.cursojava.intro.aula19.labs;

/*Ler dois vetores A e B com 10 elementos cada. Construir um vetor C,
sendo este a junção dos dois outros vetores. Os primeiros 10
elementos de C deverão receber os elementos de A e os últimos
elementos C deverão receber os elementos de B. Desta forma, C
deverá ter o dobro de elementos de A e B, ou seja, 20 elementos.*/

public class Ex29 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        vetorA[0] = 85;
        vetorA[1] = 36;
        vetorA[2] = 90;
        vetorA[3] = 87;
        vetorA[4] = 2;
        vetorA[5] = 94;
        vetorA[6] = 18;
        vetorA[7] = 36;
        vetorA[8] = 96;
        vetorA[9] = 23;

        int[] vetorB = new int[10];
        vetorB[0] = 96;
        vetorB[1] = 21;
        vetorB[2] = 65;
        vetorB[3] = 98;
        vetorB[4] = 2;
        vetorB[5] = 74;
        vetorB[6] = 25;
        vetorB[7] = 64;
        vetorB[8] = 46;
        vetorB[9] = 68;

        int[] vetorC = new int[20];

        for (int i=0,j=10;i<vetorA.length;i++,j++){

            vetorC[i] = vetorA[i];
            vetorC[j] = vetorB[i];
        }

        for (int i=0;i< vetorC.length;i++){

            System.out.println((i+1)+" - "+vetorC[i]);
        }
    }
}
