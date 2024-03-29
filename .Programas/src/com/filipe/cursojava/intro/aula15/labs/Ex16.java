package com.filipe.cursojava.intro.aula15.labs;

import java.util.Scanner;

//Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c. O programa
//deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:
//a. Se o usuário informar o valor de A igual a zero, a equação não é
//do segundo grau e o programa não deve fazer pedir os demais valores, sendo encerrado;
//b. Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa;
//c. Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
//d. Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;
public class Ex16 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Vamos calcular a raiz da equação do segundo grau.");
        System.out.println("Insira o valor de a :");
        double valorA = scan.nextDouble();

        if (valorA == 0) {
            System.out.println("A equação não é do segundo grau!");
        } else {
            System.out.println("Insira o valor de b :");
            double valorB = scan.nextDouble();

            System.out.println("Insira o valor de c :");
            double valorC = scan.nextDouble();

            double delta = (Math.pow(valorB , 2) - (4*valorA*valorC));

            if (delta < 0){
                System.out.println("A equação não possui raizes reais!");
            } else if (delta == 0){
                System.out.println("A equação possui apenas uma raiz real!");
            } else if(delta > 0){
                System.out.println("A equação possui duas raiz reais!");
            }
        }
    }
}
