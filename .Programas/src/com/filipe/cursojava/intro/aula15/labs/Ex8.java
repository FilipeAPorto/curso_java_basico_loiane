package com.filipe.cursojava.intro.aula15.labs;

import java.util.Scanner;

//Faça um programa que pergunte o preço de três produtos e informe
//qual produto você deve comprar, sabendo que a decisão é sempre
//pelo mais barato.
public class Ex8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o preço de 3 produtos. \nPrimeiro produto :");
        double preco1 = scan.nextDouble();

        System.out.println("Segundo produto :");
        double preco2 = scan.nextDouble();

        System.out.println("Terçeiro produto :");
        double preco3 = scan.nextDouble();


        if ((preco1 <= preco2) && (preco1 <= preco3)){
            System.out.println("Você deve comprar o primeiro produto!");
        } else if ((preco2 <= preco1) && (preco2 <= preco3)){
            System.out.println("Você deve comprar o segundo produto!");
        } else if ((preco3 <= preco1) && (preco3 <= preco2)){
            System.out.println("Você deve comprar o terceiro produto!");
        }
    }
}
