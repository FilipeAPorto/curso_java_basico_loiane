package com.filipe.cursojava.intro.aula17.labs;

/*A série de Fibonacci é formada pela seqüência
0,1,1,2,3,5,8,13,21,34,55,... Faça um programa que gere a série até
que o valor seja maior que 500.*/
public class Ex16 {
    public static void main(String[] args) {

        int num1 = 1;
        int i = 1;
        int num2 = 0;


        for (;num1 < 500;i++){

            num1 = num1 + num2;

            num2 = num1 - num2 ;

            System.out.print(num1 + " - ");
        }
    }
}
