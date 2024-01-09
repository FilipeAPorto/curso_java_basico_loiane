package aula19_exercicios;

import static java.lang.Math.sqrt;

/*Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tamanho, sendo que cada elemento do vetor B deverá ser a
raiz quadrada do respectivo elemento de A, ou seja:
B[i] = sqrt(A[i]).*/
public class Ex4 {
    public static void main(String[] args) {

        double[] vetorA = new double[15];
        vetorA[0] = 1;
        vetorA[1] = 2;
        vetorA[2] = 3;
        vetorA[3] = 4;
        vetorA[4] = 5;
        vetorA[5] = 6;
        vetorA[6] = 7;
        vetorA[7] = 8;
        vetorA[8] = 9;
        vetorA[9] = 10;
        vetorA[10] = 11;
        vetorA[11] = 12;
        vetorA[12] = 13;
        vetorA[13] = 14;
        vetorA[14] = 15;

        for (int i=0;i< vetorA.length;i++){

            System.out.println("Vetor A número "+(i+1) +" é "+ vetorA[i]);
        }

        double[] vetorB = new double[15];
        vetorB[0] = sqrt(vetorA[0]);
        vetorB[1] = sqrt(vetorA[1]);
        vetorB[2] = sqrt(vetorA[2]);
        vetorB[3] = sqrt(vetorA[3]);
        vetorB[4] = sqrt(vetorA[4]);
        vetorB[5] = sqrt(vetorA[5]);
        vetorB[6] = sqrt(vetorA[6]);
        vetorB[7] = sqrt(vetorA[7]);
        vetorB[8] = sqrt(vetorA[8]);
        vetorB[9] = sqrt(vetorA[9]);
        vetorB[10] = sqrt(vetorA[10]);
        vetorB[11] = sqrt(vetorA[11]);
        vetorB[12] = sqrt(vetorA[12]);
        vetorB[13] = sqrt(vetorA[13]);
        vetorB[14] = sqrt(vetorA[14]);

        for (int i=0;i< vetorB.length;i++){

            System.out.println("Vetor B número "+(i+1) +" é "+ vetorB[i]);
        }

    }
}
