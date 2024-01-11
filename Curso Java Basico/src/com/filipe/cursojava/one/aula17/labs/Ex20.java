package com.filipe.cursojava.one.aula17.labs;

import java.util.Scanner;

/*Altere o programa de cálculo do fatorial, permitindo ao usuário calcular
o fatorial várias vezes e limitando o fatorial a números inteiros positivos
e menores que 16. */
public class Ex20 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long num1;
        long num2;
        long i;

        do {
            System.out.println("Insira um numero inteiro entre 1 e 16: ");
            num1 = scan.nextInt();

            if ((num1 > 16) || (num1 < 1)){
                System.out.println("**ERRO** Valor inserido inválido\n");
            }

        } while ((num1 > 16) || (num1 < 1)) ;


        i = num1;

        long numInicial = i;

        for (; i > 1; i--){

            num2 = i - 1;

            num1 = num1 * num2;
        }

        System.out.println("O fatorial do numero " + numInicial + " é " + num1);
    }
}
