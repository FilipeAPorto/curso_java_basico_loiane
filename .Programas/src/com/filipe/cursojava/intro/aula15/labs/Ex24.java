package com.filipe.cursojava.intro.aula15.labs;

import java.util.Scanner;

//Faça um Programa que leia 2 números e em seguida pergunte ao
//usuário qual operação ele deseja realizar. O resultado da operação
//deve ser acompanhado de uma frase que diga se o número é:
//. par ou ímpar;
//a. positivo ou negativo;
//b. inteiro ou decimal.
public class Ex24 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um numero :");
        double numero1 = scan.nextDouble();

        System.out.println("Insira outro numero :");
        double numero2 = scan.nextDouble();

        System.out.println("Qual operação realizar: A - Adição ; S - Subtração ; M - Multiplicação ; D - Divisão.");
        String operacao = scan.next();

        double resultado = 0;

        if (operacao.equals("A")) {
            resultado = numero1 + numero2;
        }else if (operacao.equals("S")){
            resultado = numero1 - numero2;
        }else if (operacao.equals("M")){
            resultado = numero1 * numero2;
        }else if(operacao.equals("D")){
            resultado = numero1/numero2;
        }

        double resultado1 = resultado % 2;

        if(resultado1 == 0){
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é impar.");
        }
        if (resultado > 0 ){
            System.out.println("O número é positivo.");
        }else System.out.println("O número é negativo.");

        if(resultado1 == 0){
            System.out.println("O número é inteiro.");
        } else {
            System.out.println("O número é decimal.");
        }
    }
}
