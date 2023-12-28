package aula19.exercicios;

/*Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o resto da divisão do respectivo elemento de A por 2 (dois), ou
seja: B[i] := A[i] % 2.*/
public class Ex10 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        vetorA[0] = 9;
        vetorA[1] = 5;
        vetorA[2] = 4;
        vetorA[3] = 1;
        vetorA[4] = 3;
        vetorA[5] = 9;
        vetorA[6] = 8;
        vetorA[7] = 5;
        vetorA[8] = 4;
        vetorA[9] = 1;


        int[] vetorB = new int[10];
        vetorB[0] = vetorA[0] % 2;
        vetorB[1] = vetorA[1] % 2;
        vetorB[2] = vetorA[2] % 2;
        vetorB[3] = vetorA[3] % 2;
        vetorB[4] = vetorA[4] % 2;
        vetorB[5] = vetorA[5] % 2;
        vetorB[6] = vetorA[6] % 2;
        vetorB[7] = vetorA[7] % 2;
        vetorB[8] = vetorA[8] % 2;
        vetorB[9] = vetorA[9] % 2;

        for (int i=0;i< vetorB.length;i++){

            System.out.println("Vetor B número " + (i + 1) + " é " + vetorB[i]);

        }
    }
}
