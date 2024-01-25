package com.filipe.cursojava.intro.aula13.labs;

import java.util.Scanner;

//Faça um Programa que converta metros para centímetros.
public class Ex5 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Vamos converter metros para centimetros!\nInsira o valor em metros : ");

        double metro = scan.nextDouble();

        int conversao = (int) (metro * 100);

        System.out.println("\nA conversão de " + metro + "m para cm da : " + conversao + "cm");
    }

}
