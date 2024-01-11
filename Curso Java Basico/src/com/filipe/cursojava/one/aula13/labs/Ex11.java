package com.filipe.cursojava.one.aula13.labs;

import java.util.Scanner;

//Faça um Programa que peça 2 números inteiros e um número real.
//Calcule e mostre:
//a. o produto do dobro do primeiro com metade do segundo .
//b. a soma do triplo do primeiro com o terceiro.
//c. o terceiro elevado ao cubo.

public class Ex11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um numero inteiro : ");
        int numero1 = scan.nextInt();

        System.out.println("Insira outro numero inteiro :");
        int numero2 = scan.nextInt();

        System.out.println("Insira um numero real : ");
        double numero3 = scan.nextDouble();

        int resultadoA = (numero1*2) * (numero2/2);

        double resultadoB = (numero1*3) + numero3;

        double resultadoC = Math.pow(numero3 , 3);

        System.out.println("Resultado da A : " + resultadoA);
        System.out.println("Resultado da B : " + resultadoB);
        System.out.println("Resultado da C : " + resultadoC);

    }
}
