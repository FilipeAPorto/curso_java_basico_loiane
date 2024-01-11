package com.filipe.cursojava.one.aula17.labs;

import java.util.Scanner;

/*Altere o programa anterior para que ele aceite apenas números entre 0
e 1000. */
public class Ex19 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int conj = 0;
        int num1 = 0;
        int num2 = 0;

        do {
            System.out.println("\nInsira qual a quantidade do cojunto de numero inteiro  a ser analisados :");
            conj = scan.nextInt();

            if (conj < 1){
                System.out.println("ERRO! Valor invalido inserido ");
            }

        } while (conj <1);

       do {
           System.out.println("\nInsira o 1º Numero entre 0 e 1000: ");
           num1 = scan.nextInt();

           if ((num1 < 0 ) || (num1 > 1000)){
               System.out.println("ERRO! Valor invalido inserido ");
           }

       }while ((num1 < 0 ) || (num1 > 1000));


            int numMaior = num1;
            int numMenor = num1;

            for (int i=2; i<=conj;i++){

                do {
                    System.out.println("\nInsira o " + i + "º Numero entre 0 e 1000: ");
                    num2 = scan.nextInt();

                    if ((num2 < 0 ) || (num2 > 1000)){
                        System.out.println("ERRO! Valor invalido inserido ");
                    }

                }while ((num2 < 0 ) || (num2 > 1000));

                if (num2 >= numMaior){

                    numMaior = num2;

                }else if (num2 < numMenor){

                    numMenor = num2;
                }
            }
            System.out.println("O menor valor é " + numMenor + " e o maior valor é  "+ numMaior);
            System.out.println("A soma entre os dois valores é " + (numMenor+numMaior));

    }
}
