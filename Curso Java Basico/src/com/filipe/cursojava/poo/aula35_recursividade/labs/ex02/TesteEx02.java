package com.filipe.cursojava.poo.aula35_recursividade.labs.ex02;

import java.util.Scanner;

public class TesteEx02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Insira um numero :");
        int a = Ex02.somatorio(scan.nextInt());

        System.out.println(a);
    }
}
