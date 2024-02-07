package com.filipe.cursojava.intro.aula19.labs;

/*Criar um vetor A com 11 elementos, indexados de 0 até 10. Sendo que
cada elemento do vetor A é formado pela potência de base 2 elevado
ao expoente igual a posição do respectivo elemento, ou seja:
A[i] = 2^i. Sugestão int A[11];*/
public class Ex36 {
    public static void main(String[] args) {

        double[] vetorA = new double[11];

        for (int i = 0;i < vetorA.length;i++){

            vetorA[i] = Math.pow(2,i);

            System.out.println("2^"+(i) +" = "+(int)vetorA[i]);
        }
    }
}
