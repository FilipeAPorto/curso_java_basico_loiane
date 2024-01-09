package aula19_exercicios;

import java.util.Random;

/*Ler um vetor A com 10 elementos e construir um vetor B de mesmo
tipo e tamanho e com os mesmos elementos de A, sendo que estes
deverão estar invertidos, ou seja, o primeiro elemento de A passa a
ser o último de B, o segundo elemento de A passa a ser o penúltimo
de B e assim por diante.*/
public class Ex28 {
    public static void main(String[] args) {

        Random gerador = new Random();

        int[] vetorA = new int[10];

        for (int i=0;i< vetorA.length;i++){

            vetorA[i] = gerador.nextInt();
        }

        int[] vetorB = new int[10];
        vetorB[0] = vetorA[9];
        vetorB[1] = vetorA[8];
        vetorB[2] = vetorA[7];
        vetorB[3] = vetorA[6];
        vetorB[4] = vetorA[5];
        vetorB[5] = vetorA[4];
        vetorB[6] = vetorA[3];
        vetorB[7] = vetorA[2];
        vetorB[8] = vetorA[1];
        vetorB[9] = vetorA[0];

        for (int i=0;i< vetorB.length;i++){

            System.out.println(i+" - "+vetorA[i]+" - "+vetorB[i]);
        }
    }
}
