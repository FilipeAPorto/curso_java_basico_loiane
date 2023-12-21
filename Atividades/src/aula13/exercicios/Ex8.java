package aula13.exercicios;

import java.util.Scanner;

//Faça um Programa que pergunte quanto você ganha por hora e o
//número de horas trabalhadas no mês. Calcule e mostre o total do seu
//salário no referido mês.

public class Ex8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Vamos calcular seu salário mensal. \nInsira seus ganhos por hora trabalhada : ");
        double ganhoshora = scan.nextDouble();

        System.out.println("Insira o número de horas trabalhadas no mês : ");
        double horastrab = scan.nextDouble();

        double salario = ganhoshora * horastrab;

        System.out.println("Seu salário mensal é : R$" + salario) ;





    }
}
