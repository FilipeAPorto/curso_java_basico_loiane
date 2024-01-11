package com.filipe.cursojava.one.aula19.labs;

/*Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a média aritmética simples dos elementos
ímpares armazenados neste vetor.*/
public class Ex14 {
    public static void main(String[] args) {

        int i=0;
        double total = 0;

        int[] vetorA = new int[10];
        vetorA[0] = 40;
        vetorA[1] = 29;
        vetorA[2] = 95;
        vetorA[3] = 76;
        vetorA[4] = 54;
        vetorA[5] = 90;
        vetorA[6] = 33;
        vetorA[7] = 27;
        vetorA[8] = 15;
        vetorA[9] = 87;

        for(;i< vetorA.length;i++){

                total += vetorA[i];
        }
        total = total/i;

        System.out.println(total);
    }
}
