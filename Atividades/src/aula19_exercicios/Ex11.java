package aula19_exercicios;

/*Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a quantidade de elementos armazenados neste
vetor que são pares.*/
public class Ex11 {
    public static void main(String[] args) {

        int par = 0;

        int[] vetorA = new int[10];
        vetorA[0] = 4;
        vetorA[1] = 2;
        vetorA[2] = 9;
        vetorA[3] = 7;
        vetorA[4] = 5;
        vetorA[5] = 9;
        vetorA[6] = 3;
        vetorA[7] = 2;
        vetorA[8] = 1;
        vetorA[9] = 8;

        for (int i=0;i< vetorA.length;i++){

            if (vetorA[i] % 2 == 0){
                par++;
            }
        }
        System.out.println("\nSão no total "+ par + " números pares nos vetores.");
    }
}
