package com.filipe.cursojava.one.aula17.labs;

import java.util.Scanner;

/*Faça um programa que calcule o valor total investido por um
colecionador em sua coleção de CDs e o valor médio gasto em cada
um deles. O usuário deverá informar a quantidade de CDs e o valor
para em cada um.*/
public class Ex28_Loiane_Ex22 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int qtdCD;
        double valorCD,valorTotal =0,media;

        do{
            System.out.print("Insira a quantidade de CDs de sua coleção :");
            qtdCD = scan.nextInt();

            if (qtdCD <= 0){
                System.out.println("\n** ERRO - Valor inválido inserido **");
            }

        }while (qtdCD <=0);

        for (int i=1;i<=qtdCD;i++){

            do {
                System.out.print("Insira o valor em R$ do " + i + " CD : ");
                valorCD = scan.nextDouble();

                if (valorCD <= 0){
                    System.out.println("\n** Valor do CD inserido é abaixo de 0 - Insira novamente **");
                }

            }while (valorCD <=0);

            valorTotal += valorCD;
        }

        media = valorTotal/qtdCD;

        System.out.println("\nValor total investido na coleção foi de R$"+valorTotal);
        System.out.println("O valor médio da coleção é de R$"+media+" por CD colecionado.");
    }
}
