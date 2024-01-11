package com.filipe.cursojava.one.aula17.labs;

import java.util.Scanner;

//Faça um programa que receba dois números inteiros e gere os
//números inteiros que estão no intervalo compreendido por eles.
public class Ex10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um número :");
        int num1 = scan.nextInt();

        System.out.println("Insira outro número :");
        int num2 = scan.nextInt();

        if (num1 <= num2){
            for (;num1 <= num2;num1++){
                System.out.print(num1 + ",");
            }
        } else for (;num1 >= num2;num1--) {
            System.out.print(num1 + ",");
        }
    }
}
