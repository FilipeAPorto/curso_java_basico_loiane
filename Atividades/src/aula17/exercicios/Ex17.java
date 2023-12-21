package aula17.exercicios;

import java.util.Scanner;

/*Faça um programa que calcule o fatorial de um número inteiro
fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120*/
public class Ex17 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um numero inteiro : ");

        long num1 = scan.nextInt();
        long num2;
        long i;

        i = num1;

        long numInicial = i;

        for (; i > 1; i--){

            num2 = i - 1;

            num1 = num1 * num2;
        }

        System.out.println("O fatorial do numero " + numInicial + " é " + num1);
    }
}
