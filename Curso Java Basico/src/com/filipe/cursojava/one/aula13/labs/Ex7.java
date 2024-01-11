package com.filipe.cursojava.one.aula13.labs;

import java.util.Scanner;

//Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
public class Ex7 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Vamos calcular a área de um quadrado \nInsira o valor do lado do quadrado : ");
        double lado1 = scan.nextDouble();

        double resultado = Math.pow(lado1 , 2);

        System.out.println("A área do quadrado é : " + resultado);

        System.out.println("\nO dobro desta área é : " + resultado * 2);
    }
}
