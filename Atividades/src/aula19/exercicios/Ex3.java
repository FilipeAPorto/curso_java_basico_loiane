package aula19.exercicios;

/*Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o quadrado do respectivo elemento de A, ou seja:
B[i] = A[i] * A[I].*/
public class Ex3 {
    public static void main(String[] args) {

        int[] vetorA = new int[15];
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

        int[] vetorB = new int[15];
        vetorB[0] = vetorA[0]*vetorA[0];
        vetorB[1] = vetorA[1]*vetorA[1];
        vetorB[2] = vetorA[2]*vetorA[2];
        vetorB[3] = vetorA[3]*vetorA[3];
        vetorB[4] = vetorA[4]*vetorA[4];
        vetorB[5] = vetorA[5]*vetorA[5];
        vetorB[6] = vetorA[6]*vetorA[6];
        vetorB[7] = vetorA[7]*vetorA[7];
        vetorB[8] = vetorA[8]*vetorA[8];
        vetorB[9] = vetorA[9]*vetorA[9];
        vetorB[10] = vetorA[10]*vetorA[10];
        vetorB[11] = vetorA[11]*vetorA[11];
        vetorB[12] = vetorA[12]*vetorA[12];
        vetorB[13] = vetorA[13]*vetorA[13];
        vetorB[14] = vetorA[14]*vetorA[14];

        for (int i=0;i< vetorB.length;i++){

            System.out.println("Vetor B número "+(i+1) +" é "+ vetorB[i]);
        }


    }
}
