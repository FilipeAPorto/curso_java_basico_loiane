package com.filipe.cursojava.one.aula17.labs;

import java.util.Scanner;

/*Faça um programa que, dado um conjunto de N números, determine o
menor valor, o maior valor e a soma dos valores.*/
public class Ex18 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int conj = 0;
        int num1 = 0;
        int num2 = 0;

        do {
            System.out.println("\nInsira qual a quantidade do cojunto de numero inteiro  a ser analisados :");
            conj = scan.nextInt();

            if (conj < 1){
                System.out.println("ERRO! Valor invalido inserido ");
            }

        } while (conj <1);

        System.out.println("\nInsira o 1º Numero : ");
        num1 = scan.nextInt();

        int numMaior = num1;
        int numMenor = num1;

        for (int i=2; i<=conj;i++){

            System.out.println("\nInsira o " + i + "º Numero : ");
            num2 = scan.nextInt();

            //maior
            if (num2 >= numMaior){

                numMaior = num2;

            }else if (num2 < numMenor){

                numMenor = num2;
            }
        }

        System.out.println("O menor valor é " + numMenor + " e o maior valor é  "+ numMaior);
        System.out.println("A soma entre os dois valores é " + (numMenor+numMaior));
    }
}
