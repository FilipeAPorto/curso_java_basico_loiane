package com.filipe.cursojava.intro.aula17.labs;

import java.util.Scanner;

//Faça um programa que leia 5 números e informe a soma e a média dos números.
public class Ex8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double num,media,soma=0;

        for (int i=0;i<5;i++){

            System.out.println("Insira um numero :" );
            num = scan.nextDouble();

            soma += num; //Símbolo += é utilizado para atribuir a uma variável o valor desta variável somada ao valor de um operando.
        }

        media = soma / 5;

        System.out.println("A soma dos numeros é "+soma);
        System.out.println("A média sera de "+media);
    }
}
