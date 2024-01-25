package com.filipe.cursojava.intro.aula19.labs;

/*Criar um vetor A com 10 elementos inteiros. Escreva um programa que
imprima cada elemento do vetor A e a relação de todos os pares de 0
até o respectivo elemento.*/
public class Ex34 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        vetorA[0] = 26;
        vetorA[1] = 15;
        vetorA[2] = 36;
        vetorA[3] = 50;
        vetorA[4] = 40;
        vetorA[5] = 41;
        vetorA[6] = 23;
        vetorA[7] = 8;
        vetorA[8] = 15;
        vetorA[9] = 20;

        for(int i=0;i< vetorA.length;i++){
            System.out.println("\nOs números pares do 0 até "+vetorA[i] + " são :");

            for(int j = 0;j <= vetorA[i];j++){
                if(j % 2 == 0){
                    System.out.print(" - " + j);
                }
            }
        }
    }
}
