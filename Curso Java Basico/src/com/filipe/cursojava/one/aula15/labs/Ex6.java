package com.filipe.cursojava.one.aula15.labs;

import java.util.Scanner;

//Faça um Programa que leia três números e mostre o maior deles.
public class Ex6 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o 1º número inteiro :");
        int numero1 = scan.nextInt();

        System.out.println("Insira o 2º número inteiro :");
        int numero2 = scan.nextInt();

        System.out.println("Insira o 3º número inteiro : ");
        int numero3 = scan.nextInt();


        if ((numero1 >= numero2) && (numero1 >= numero3)) {
            System.out.println("O maior número inteiro é : "+ numero1);
        } else if ((numero2 >= numero1) && (numero2 >= numero3)){
            System.out.println("O maior número inteiro é : "+ numero2);
        } else if ((numero3 >= numero1) && (numero3 >= numero2)){
            System.out.println("O maior número inteiro é : "+ numero3);
        }

        System.out.println("Entre os números inteiro " + numero1 + " " + numero2 + " " + numero3);
    }
}
