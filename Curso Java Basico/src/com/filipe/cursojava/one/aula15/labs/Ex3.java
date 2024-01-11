package com.filipe.cursojava.one.aula15.labs;

import java.util.Scanner;

//Faça um Programa que verifique se uma letra digitada é "F" ou "M".
//Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
public class Ex3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("F OU M ?");
        String sexo = scan.next();


        if (sexo.equalsIgnoreCase("M")){
            System.out.println("Masculino");
        } else if(sexo.equalsIgnoreCase("F")){
            System.out.println("Feminino");
        } else System.out.println("Sexo inválido");
    }
}
