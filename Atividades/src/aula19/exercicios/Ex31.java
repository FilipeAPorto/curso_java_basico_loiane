package aula19.exercicios;

import java.util.Random;

/*Ler um vetor A com 20 elementos. Separar os elementos pares e
ímpares de A utilizando apenas um vetor extra B. Sugestão: no início
do vetor B armazene os elementos pares de A e nas posições
restantes do vetor B armazene os elementos de A que são ímpares.*/
public class Ex31 {
    public static void main(String[] args) {

        Random gerador = new Random();

        int[] vetorA = new int[20];

        for(int i=0;i< vetorA.length;i++) {
            vetorA[i] = gerador.nextInt();
        }

        int[] vetorB = new int[20];

        for (int i = 0,j = 0; i < vetorB.length;) {

            for (; i < vetorB.length;i++) {
                if (vetorA[i] % 2 == 0) {
                    vetorB[j] = vetorA[i];
                    j++;
                }
            }

           for(i=0;i< vetorB.length;i++){
               if (vetorA[i] % 2 != 0) {
                   vetorB[j] = vetorA[i];
                   j++;
               }
          }
        }

        for(int i=0;i< vetorB.length;i++){

            System.out.println((i+1)+" = "+vetorB[i]);
        }
    }
}
