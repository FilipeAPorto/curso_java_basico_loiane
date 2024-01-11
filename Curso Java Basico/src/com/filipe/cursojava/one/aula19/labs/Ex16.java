package com.filipe.cursojava.one.aula19.labs;

/*Criar um vetor A com 10 elementos inteiros. Escrever um programa
que calcule e escreva: a) a soma de elementos armazenados neste
vetor que são inferiores a 15; b) a quantidade de elementos
armazenados no vetor que são iguais a 15; e c) a média dos
elementos armazenados no vetor que são superiores a 15.*/
public class Ex16 {
    public static void main(String[] args) {

        int itemA=0,itemB=0,itemC=0,media=0;

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

        for(int i=0;i< vetorA.length;i++) {

            if (vetorA[i]<15){

                itemA += vetorA[i];

            } else if (vetorA[i] == 15){

                itemB++;

            } else if(vetorA[i]>15){

                itemC += vetorA[i];

                media++;
            }
        }

        System.out.println("\nA soma dos elementos menores que 15 é "+itemA);
        System.out.println("\nA quantidade de elementos iguais a 15 é "+itemB);
        System.out.println("\nA media dos elementos maiores que 15 é "+itemC/media);


    }
}
