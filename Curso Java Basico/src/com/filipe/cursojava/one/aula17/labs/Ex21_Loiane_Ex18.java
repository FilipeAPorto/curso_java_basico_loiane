package com.filipe.cursojava.one.aula17.labs;

import java.util.Scanner;

/*Faça um programa que peça um número inteiro e determine se ele é
ou não um número primo. Um número primo é aquele que é divisível
somente por ele mesmo e por 1. */
public class Ex21_Loiane_Ex18 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        boolean primo = true;

        System.out.print("Insira um número inteiro: ");
        num = scan.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                System.out.println("Não é um número primo");
                primo = false;
            }
        }
        if (primo){
            System.out.println("É um número primo.");
        }
    }
}