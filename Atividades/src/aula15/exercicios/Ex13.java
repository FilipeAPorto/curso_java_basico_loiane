package aula15.exercicios;

import java.util.Scanner;

//Faça um Programa que leia um número e exiba o dia correspondente
//da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
//aparecer valor inválido.
public class Ex13 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um numero entre 1 e 7 :");
        int diaDaSemana = scan.nextInt();

        switch (diaDaSemana) {
            case 1:
                System.out.println("Segunda - Feira");
                break;
            case 2:
                System.out.println("Terça - Feira");
                break;
            case 3:
                System.out.println("Quarta - Feira");
                break;
            case 4:
                System.out.println("Quinta - Feira");
                break;
            case 5:
                System.out.println("Sexta - Feira");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Valor Invalido!");
        }
    }
}
