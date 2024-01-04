package aula20.exercicios;

import java.util.Scanner;

/*Gere e imprima uma matriz M 10x10 com valores aleatórios entre 0-9.
Após isso indique qual é o maior e o menor valor da linha 5 e qual é o maior e o menor valor da coluna 7.*/
public class Ex2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] matrizM = new int[10][10];

        System.out.println("Vamos criar uma matriz 10x10.");

        for(int i = 0;i < matrizM.length;i++){

            System.out.println("Insira um valor de 0 a 9.");

            for(int j = 0;j < matrizM[i].length;j++){

                do {
                    System.out.print("Para a " + (i + 1)+ "ª linha "+ (j + 1) + "ª coluna :");
                    matrizM[i][j] = scan.nextInt();
                    if (matrizM[i][j] < 0 || matrizM[i][j]>9){
                        System.out.println("*** ERRO - INSIRA UM VALOR VÁLIDO ***\n");
                    }
                }while (matrizM[i][j] < 0 || matrizM[i][j]>9);
            }
           System.out.println();
        }

        //Codigo para verificar o maior e menor valor da linha 5.

        int linha5 = 4,coluna7 = 6;
        int maiorNum = Integer.MIN_VALUE;
        int menorNum = Integer.MAX_VALUE;

            for (int j=0;j < matrizM[linha5].length;j++){

                if (matrizM[linha5][j] > maiorNum){
                    maiorNum = matrizM[linha5][j];
                }

                if (matrizM[linha5][j] < menorNum){
                    menorNum = matrizM[linha5][j];
                }
            }
        System.out.println("Na linha "+(linha5+1) + " o maior valor inserido é " + maiorNum + " e o menor valor inserido é " + menorNum);


            //Codigo para verificar o maior e o menor valor da coluna 7.

        maiorNum = Integer.MIN_VALUE;
        menorNum = Integer.MAX_VALUE;

        for (int i=0;i < matrizM[linha5].length;i++){

            if (matrizM[i][coluna7] > maiorNum){
                maiorNum = matrizM[i][coluna7];
            }

            if (matrizM[i][coluna7] < menorNum){
                menorNum = matrizM[i][coluna7];
            }
        }
        System.out.println("Na linha "+(coluna7+1) + " o maior valor inserido é " + maiorNum + " e o menor valor inserido é " + menorNum);
    }
}
