package aula17_exercicios;

import java.util.Scanner;

//Faça um programa que leia 5 números e informe o maior número.
public class Ex7_IntegerMinValue {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num ;
        int maior = Integer.MIN_VALUE;//Representa o menor valor da variavel

        for (int i=0;i<5;i++) {
            System.out.println("Insira um valor");
            num = scan.nextInt();

            if (num > maior) {
                maior = num;
            }
        }
        System.out.println(maior);
    }
}
