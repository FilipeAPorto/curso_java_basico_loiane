package aula19.exercicios;

import java.util.Random;

/*Ler um vetor A com 20 elementos. Construir dois vetores B e C, sendo
que nos vetor B e C serão armazenados o valores pares e ímpares de
A, respectivamente.*/
public class Ex30 {
    public static void main(String[] args) {

        Random gerador = new Random();

        int[] vetorA = new int[20];
        int[] vetorB = new int[20];
        int[] vetorC = new int[20];

        for(int i=0;i< vetorA.length;i++){
            vetorA[i] = gerador.nextInt();

            if(vetorA[i] % 2 == 0){
                vetorB[i] = vetorA[i];
            } else {
                vetorC[i] = vetorA[i];
            }

            if (vetorB[i]!=0) {
                System.out.println((i+1)+" = "+vetorB[i]+" - (PAR)");
            } else if (vetorC[i]!=0){
                System.out.println((i+1)+" = "+vetorC[i]+" - (IMPAR)");
            }
        }
    }
}
