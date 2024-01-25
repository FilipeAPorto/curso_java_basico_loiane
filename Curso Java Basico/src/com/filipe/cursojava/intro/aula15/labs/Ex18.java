package com.filipe.cursojava.intro.aula15.labs;

import java.util.Scanner;

//Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.
public class Ex18 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Vamos verificar se a data é valida ");

        System.out.println("Primeiro insira o valor do dia no formato dd :");
        int dia = scan.nextInt();

        if (dia <= 31) {
            System.out.println("Agora insira o valor do mês no formato mm :");
            int mes = scan.nextInt();

            if (mes <= 12) {
                System.out.println("Agora Insira o valor do ano no formato aaaa");
                int ano = scan.nextInt();
                System.out.println("Esta da é Válida!");

            } else {
                System.out.println("Mês invalido!");
            }

        } else System.out.println("dia invalida!");

    }
}
