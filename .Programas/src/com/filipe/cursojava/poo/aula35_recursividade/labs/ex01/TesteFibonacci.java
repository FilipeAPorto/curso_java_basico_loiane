package com.filipe.cursojava.poo.aula35_recursividade.labs.ex01;

import java.util.Scanner;

public class TesteFibonacci {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Insira quantas casas deseja do fibonacci :");
        int j = scan.nextInt();

        for (int i=0;i<j;i++){
            System.out.print(Fibonacci.fibonacci(i) + " ");
        }
    }
}
