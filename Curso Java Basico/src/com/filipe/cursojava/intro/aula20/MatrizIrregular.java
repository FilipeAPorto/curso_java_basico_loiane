package com.filipe.cursojava.intro.aula20;

import java.util.Scanner;

public class MatrizIrregular {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o numero de pessoas que serão entrevistadas :");
        int numEntrevistados = scan.nextInt();

        String[][] nomesFilhos = new String[numEntrevistados][];

        for (int i = 0;i< nomesFilhos.length;i++) {

            System.out.print("Entre com a quantidade de filhos :");
            int qtdFilhos = scan.nextInt();

            nomesFilhos[i] = new String[qtdFilhos];

            for (int j=0;j<nomesFilhos[i].length;j++){

                System.out.println("Digite o nome do " + (j+1)+"º filho");
                nomesFilhos[i][j] = scan.next();
            }
        }
        for (int i = 0;i< nomesFilhos.length;i++) {
            System.out.println("Pessoa "+ (i+1) + " tem "+ nomesFilhos[i].length + " filhos");

            for (int j=0;j<nomesFilhos[i].length;j++){
                System.out.println(nomesFilhos[i][j]);
            }
        }
    }
}
