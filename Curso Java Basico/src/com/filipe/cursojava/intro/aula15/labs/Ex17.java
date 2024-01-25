package com.filipe.cursojava.intro.aula15.labs;

import java.util.Scanner;

//Faça um Programa que peça um número correspondente a um
//determinado ano e em seguida informe se este ano é ou não bissexto.
public class Ex17 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um número correspondente  a um determinado ano :");
        int ano = scan.nextInt();

        int anoBi = ano % 4;

        if (anoBi == 0){
            System.out.println("É ano bissexto!");
        } else System.out.println("Não é ano bissexto!");
    }
}
