package aula17.exercicios;

import java.util.Scanner;

/*Faça um programa que peça um número inteiro e determine se ele é
ou não um número primo. Um número primo é aquele que é divisível
somente por ele mesmo e por 1. */
public class Ex21_Duvida {
    public static void main(String[] args) {

        int num1 = 1, num2, primo = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Número inteiro: ");
        num2 = scan.nextInt();

        for (int i = num1; i <= num2; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    primo++;
                    System.out.println("A "+primo);
                }
                System.out.println("B");
            }
            /*if (primo == 2) {
                System.out.println("O número " + i + " é PRIMO!");
            }
            primo = 0;*/
        }

        //entrada.close();


    }
}

        /* Scanner scan = new Scanner(System.in);

        int num1;
        int num2 = 0;
        int num3;
        int i = 2;
        boolean primo = false;

        do {
            System.out.println("Insira um número inteiro positivo : ");
            num1 = scan.nextInt();

        }while (num1 < 2);

        num3 = num1 - 1;

        for (;i<num3;i++){

            num2 = num1%i;


            System.out.println(i+" - "+num2);
        }

        if ((num2 != 0) || (num1 == 2)){
            System.out.println("É primo" + num2);
        } else System.out.println("Não é primo" + num2);*/