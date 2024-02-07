package com.filipe.cursojava.intro.aula15.labs;

import java.util.Scanner;

//Faça um Programa que peça um número e informe se o número é inteiro ou decimal.
// Dica: utilize uma função de arredondamento.
public class Ex23 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um numero : ");

        double numero = scan.nextDouble();

        numero = numero % 1;

        if (numero == 0){
            System.out.println("O número é inteiro!");
        } else System.out.println("O número é decimal!");
    }
}
