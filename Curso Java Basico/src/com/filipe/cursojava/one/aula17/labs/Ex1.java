package com.filipe.cursojava.one.aula17.labs;

import java.util.Scanner;

//Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e
// continue pedindo até que o usuário informe um valor válido.
public class Ex1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double i = 0;

        do{
            System.out.print("\nInsira uma nota de 0 a 10 : ");
            i = scan.nextDouble();

            if ((i < 0) || (i > 10)){
                System.out.println("Valor de nota incorreto !");
            }

        } while ((i < 0) || (i > 10)); // até a Expressão ficar falsa.

        System.out.println("A nota inserida foi " + i);
    }
}
