package com.filipe.cursojava.one.aula19.labs;

/*Criar um vetor A com 5 elementos inteiros. Escreva um programa que
imprima a tabuada de cada um dos elementos do vetor A.*/
public class Ex32 {
    public static void main(String[] args) {

        int result = 0;

        int[] vetorA = new int[5];
        vetorA[0] = 2;
        vetorA[1] = 4;
        vetorA[2] = 5;
        vetorA[3] = 7;
        vetorA[4] = 9;

        for(int i=0;i< vetorA.length;i++){
            System.out.println("\nTabuada do " + vetorA[i]);

            for(int j=1;j<=10;j++){
                result = vetorA[i] *j;

                System.out.println(vetorA[i] + "x" + j + " = "+ result);
            }
        }
    }
}
