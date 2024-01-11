package com.filipe.cursojava.one.aula17.labs;

import java.util.Scanner;

/*Faça um programa que calcule o mostre a média aritmética de N notas.*/
public class Ex24_Loiane_Ex19 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int qtdNotas;
        double notas,media,total=0;

        do {
            System.out.println("Insira a quantidade de notas a ser calculada : ");
            qtdNotas = scan.nextInt();

            if (qtdNotas <= 1){
                System.out.println("** ERRO - Valor invalido inserido **\n");
            }

        }while (qtdNotas <= 1);

        media = qtdNotas;

        for (int i=1;i <= qtdNotas;i++){
            do {
                System.out.println("Insira a "+i+"ª Nota");
                notas = scan.nextDouble();

                if(notas < 0 ){
                    System.out.println("** ERRO - Valor invalido inserido **");
                }

                total += notas;

            }while (notas < 0);
        }
        total = total/media;

        System.out.println("A media entre as "+ qtdNotas+ " notas inseridas é de : "+total);
    }
}
