package aula15.exercicios;

import java.util.Scanner;

//Faça um Programa que leia três números e mostre-os em ordem decrescente.
public class Ex9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira 3 números inteiros aleatórios\nInsira o primeiro número : ");
        int numero1 = scan.nextInt();

        System.out.println("Insira o segundo número :");
        int numero2 = scan.nextInt();

        System.out.println("Insira o terceiro número :");
        int numero3 = scan.nextInt();

        if ((numero1 > numero2) && (numero1 > numero3) && (numero2 > numero3)){
            System.out.println("A ordem decrescente dos numeros é : " + numero1 + " " + numero2 + " "+ numero3);
        } else if ((numero1 < numero2) && (numero1 < numero3) && (numero2 < numero3)){
            System.out.println("A ordem decrescente dos numeros é : " + numero3 + " " + numero2 + " " + numero1);
        } else if ((numero1 < numero2) && (numero1 < numero3) && (numero2 > numero3)){
            System.out.println("A ordem decrescente dos numeros é : " + numero2 + " " + numero3 + " " + numero1);
        } else if ((numero1 < numero2) && (numero1 > numero3) && (numero2 > numero3)) {
            System.out.println("A ordem decrescente dos numeros é : " + numero2 + " " + numero1 + " " + numero3);
        }
    }
}
