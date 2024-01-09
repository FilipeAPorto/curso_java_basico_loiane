package aula17_exercicios;

import java.util.Scanner;

//Faça um programa que peça 10 números inteiros, calcule e mostre a
//quantidade de números pares e a quantidade de números impares.
public class Ex14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int par =0;
        int impar =0;
        int num;

        for (int i=1 ;i<=10;i++ ){

            System.out.println("Insira um numero inteiro :");
            num = scan.nextInt();

            num = num%2;

            if (num == 0 ){
                par++;
            }

            if (num == 1) {
                impar++;
            }
        }
        System.out.println("São no total " + par + " par(es) e " + impar + " impar(es) ");
    }
}
