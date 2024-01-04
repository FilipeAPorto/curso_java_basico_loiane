package aula20.exercicios;

import java.util.Scanner;

/*Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
Após isso determine o maior número da matriz e a sua posição (linha, coluna).*/
public class Ex1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] matrizM = new int[4][4];

        System.out.println("Vamos criar uma matriz 4x4.");

        for(int i = 0;i < matrizM.length;i++){
            for(int j = 0;j < matrizM[i].length;j++){

                do {
                    System.out.print("Insira um valor de 0 a 9 para a " + (i + 1) + "ª linha e " + (j + 1) + "ª coluna :");
                    matrizM[i][j] = scan.nextInt();
                    if (matrizM[i][j] < 0 || matrizM[i][j]>9){
                        System.out.println("*** ERRO - INSIRA UM VALOR VÁLIDO ***\n");
                    }
                }while (matrizM[i][j] < 0 || matrizM[i][j]>9);
            }
            System.out.println();
        }

        int maiorNum = Integer.MIN_VALUE,linha=0,coluna=0;

         for(int i = 0;i < matrizM.length;i++){
            for(int j = 0;j < matrizM[i].length;j++){

                if (matrizM[i][j] > maiorNum){
                    maiorNum = matrizM[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        System.out.println("O maior valor da matriz é "+maiorNum+" e esta na posição "+(linha+1)+" - "+(coluna+1));
    }
}