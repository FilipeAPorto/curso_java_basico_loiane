package com.filipe.cursojava.one.aula19.labs;

/*Ler um vetor A com 10 elementos inteiros correspondentes as idades
de um grupo de pessoas. Escreva um programa que determine e
escreva a quantidade de pessoas que possuem idade superior a 35 anos.*/
public class Ex17 {
    public static void main(String[] args) {

        int pessoa = 0;

        int[] vetorA = new int[10];
        vetorA[0] = 40;
        vetorA[1] = 29;
        vetorA[2] = 15;
        vetorA[3] = 76;
        vetorA[4] = 5;
        vetorA[5] = 8;
        vetorA[6] = 3;
        vetorA[7] = 27;
        vetorA[8] = 15;
        vetorA[9] = 87;


        for (int i=0;i< vetorA.length;i++){

            if (vetorA[i] >= 35){

                pessoa++;
            }
        }

        System.out.println("\nA quantidade de pessoas que possuem idade superior a 35 anos são " + pessoa);

    }
}
