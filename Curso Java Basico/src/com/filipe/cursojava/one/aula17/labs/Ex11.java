package com.filipe.cursojava.one.aula17.labs;

import java.util.Scanner;

//Altere o programa anterior para mostrar no final a soma dos números.
public class Ex11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um número :");
        int num1 = scan.nextInt();

        System.out.println("Insira outro número :");
        int num2 = scan.nextInt();

        int soma = 0;
        int somaAntes;

        if (num1 <= num2){
            for (;num1 <= num2;num1++){
                soma += num1;
                somaAntes = soma - num1;

                System.out.println(somaAntes + " + "+ num1 + " = " +soma);
            }
        } else for (;num1 >= num2;num1--) {
            soma += num1;
            somaAntes = soma - num1;

            System.out.println(somaAntes + " + "+ num1 + " = " +soma);
        }
    }
}
