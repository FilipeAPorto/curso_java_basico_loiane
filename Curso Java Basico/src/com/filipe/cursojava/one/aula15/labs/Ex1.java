package com.filipe.cursojava.one.aula15.labs;

import java.util.Scanner;

//Faça um Programa que peça dois números e imprima o maior deles.
public class Ex1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira 1 número aleatório");
        double numero1 = scan.nextDouble();

        System.out.println("Insira outro número aleatório");
        double numero2 = scan.nextDouble();

        if (numero1 > numero2){
            System.out.println("Maior numero é "+ numero1);
        } else if (numero1 < numero2) {
            System.out.println("O maior numero é "+numero2);
        } else
            System.out.println("Numeros iguais");

    }
}
