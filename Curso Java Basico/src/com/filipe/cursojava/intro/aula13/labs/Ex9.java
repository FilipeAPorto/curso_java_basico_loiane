package com.filipe.cursojava.intro.aula13.labs;

//Faça um Programa que peça a temperatura em graus fahrenheit ,
//transforme e mostre a temperatura em graus Celsius.
//o C = (5 * (F-32) / 9).

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Vamos converter Farenheit para Celsius \nInsira o valor em Fahrenheit  : ");
        double fahren = scan.nextDouble();

        double celsius = 5 * (fahren - 32) /9;

        System.out.println("A temperatura em Celsius é : " + celsius + "ºC");

    }

}
