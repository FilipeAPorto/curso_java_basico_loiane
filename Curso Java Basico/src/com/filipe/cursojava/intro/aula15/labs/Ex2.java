package com.filipe.cursojava.intro.aula15.labs;

import java.util.Scanner;

//Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
public class Ex2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um numero aleatório (Positivo ou negativo) : ");

        double numero = scan.nextDouble();

        if (numero >= 0){
            System.out.println("Numero é Positivo!");
        } else System.out.println("Numero é Negativo!");
    }
}
