package com.filipe.cursojava.one.aula19.labs;

/*Ler um vetor A com 10 elementos inteiros correspondentes as idades
de um grupo de pessoas. Escreva um programa que determine e
escreva a menor e a maior idades e suas respectivas posições.*/
public class Ex18 {
    public static void main(String[] args) {

        int menor=Integer.MAX_VALUE,maior=Integer.MIN_VALUE,a=0,b=0;

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
        vetorA[9] = 80;

        for(int i=0;i<vetorA.length;i++){
            if (maior<vetorA[i]){
                maior = vetorA[i];
                a=i;
            }

            if (menor>vetorA[i]){
                menor = vetorA[i];
                b=i;
            }
        }
        System.out.println("\nA maior idade é "+ maior + " anos e esta na posição "+(a+1));
        System.out.println("\nA menor idade é "+ menor + " anos e esta na posição "+(b+1));

    }
}
