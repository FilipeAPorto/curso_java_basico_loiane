package com.filipe.cursojava.intro.aula13.labs;

import java.util.Scanner;

public class Ex2 {

    //Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a sua idade: ");
        int idade = scan.nextInt();

        System.out.println("Agora escreva o seu numero de telefone \nQual é o DDD : ");
        byte ddd = scan.nextByte();

        System.out.println("Escreva seu numero de telefone: ");
        long numero1 = scan.nextLong();

        System.out.println("\nSua idade é : " + idade + " anos");
        System.out.println("O seu numero de telefone é : " + ddd + "-" + numero1);

    }
}
