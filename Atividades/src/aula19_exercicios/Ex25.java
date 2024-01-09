package aula19_exercicios;

import java.util.Random;

/*Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
a) Bi deverá receber 1 quando Ai for par; b) Bi deverá receber 0
quando Ai for ímpar.*/
public class Ex25 {
    public static void main(String[] args) {

        Random gerador = new Random();

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        for(int i=0;i< vetorA.length;i++) {
            vetorA[i] = gerador.nextInt();
        }

        for(int i=0;i< vetorB.length;i++){

            if (vetorA[i] % 2 == 0){

                vetorB[i] = 1;
            } else {
                vetorB[i] = 0;
            }
            System.out.println(i+" - "+vetorB[i]);
        }
    }
}
