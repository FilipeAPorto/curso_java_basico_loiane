package com.filipe.cursojava.one.aula13.labs;

import java.util.Scanner;

//Faça um Programa que peça a temperatura em graus Celsius,
//transforme e mostre em graus fahrenheit.

public class Ex10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Vamos converter Celsius para fahrenheit \nInsira o valor em Celsius");

        double celsius = scan.nextDouble();

        double fahren = celsius * 1.8 + 32;

        System.out.println("O valor em Fahrenheit é : " + fahren + "ºF");
    }

}
