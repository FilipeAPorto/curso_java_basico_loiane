package com.filipe.cursojava.intro.aula13.labs;

import java.util.Scanner;

//Faça um Programa que peça dois números e imprima a soma.
public class Ex3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" Insira o primeiro numero : ");
        int numero1 = scan.nextInt();

        System.out.println("Insira o segundo numero : ");
        int numero2 = scan.nextInt();

        int resultado = numero1 + numero2;

        System.out.println("A soma dos 2 numeros é : " + resultado);
    }
}
