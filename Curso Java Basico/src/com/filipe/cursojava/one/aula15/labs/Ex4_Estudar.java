package com.filipe.cursojava.one.aula15.labs;

import java.util.Scanner;

//Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
public class Ex4_Estudar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira uma letra : ");
        String letra = scan.next();

        if (letra.length() > 1){
            System.out.println("Não é uma letra valida!");
        }else {


            switch (letra) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    System.out.println("VOGAL!");
                    break;
                default:
                    System.out.println("CONSOANTE!");
            }
        }

    }
}
