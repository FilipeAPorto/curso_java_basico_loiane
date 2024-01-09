package aula19_exercicios;

import java.util.Random;

/*Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
que verifique se "todos" os elementos do vetor A são pares. Se pelo
menos um elemento do vetor não for par o processo de repetição para
percorrer os elementos do vetor deve ser encerrado.*/
public class Ex23 {
    public static void main(String[] args) {

        Random gerador = new Random();

        int[] vetorA = new int[10];

        for ( int i = 0;i< vetorA.length;i++){
            vetorA[i] = gerador.nextInt();

            System.out.println((i+1) + " - " + vetorA[i]);

            if (vetorA[i] % 2 != 0){
                break;
            }
        }
    }
}
