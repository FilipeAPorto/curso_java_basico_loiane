package aula19.exercicios;

import java.util.Scanner;

/*Implementar um programa que obtenha a cotação do dólar (U$) em
relação ao real (R$) e a seguir armazene em vetor A com 20 elementos as seguintes conversões:
A[i] = cotação do dolar * i, para todos i variando de 1 até 20.*/
public class Ex20 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double dolar;
        double[] vetorA = new double[20];

        do {
            System.out.print("Insira o valor do dolar atual :");
            dolar = scan.nextDouble();

            if (dolar<0){
                System.out.println("*** ERRO - Insira um valor válido ***");
            }
        }while(dolar<0);

        for (int i=0;i< vetorA.length;i++){

            vetorA[i] = dolar * i;

            System.out.println(i+" - "+vetorA[i]);
        }
    }
}
