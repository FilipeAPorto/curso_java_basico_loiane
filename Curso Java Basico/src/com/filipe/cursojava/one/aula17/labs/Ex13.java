package com.filipe.cursojava.one.aula17.labs;

import java.util.Scanner;

//Faça um programa que peça dois números, base e expoente, calcule e
//mostre o primeiro número elevado ao segundo número. Não utilize a
//função de potência da linguagem.
public class Ex13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um numero inteiro : ");
        int num = scan.nextInt();

        System.out.println("Insira um expoente inteiro : ");
        int expo = scan.nextInt();

        int i = 1;
        int result = num;

        for (;i < expo;i++ ){
            result *= num;
        }

        System.out.println(num+"^"+expo+" = "+result);
    }
}
