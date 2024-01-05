package aula20.exercicios;

/*Capture do teclado valores para preenchimento de uma matriz M 3x3.
Após a captura imprima a matriz criada e encontre a quantidade de números pares, a quantidade de números ímpares.*/

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        int[][] matrizM = new int[3][3];

        Scanner scan = new Scanner(System.in);

        for (int i = 0;i < matrizM.length;i++){
            for(int j = 0;j < matrizM[i].length;j++){

                System.out.print("Insira o "+(j+1)+"º numero da "+(i+1)+"ª coluna :");
                matrizM[i][j] = scan.nextInt();
            }
            System.out.println();
        }

        int par=0,impar=0;

        for (int i = 0;i < matrizM.length;i++){
            for(int j = 0;j < matrizM[i].length;j++) {

                if (matrizM[i][j] % 2 == 0){
                    par++;
                } else {
                    impar++;
                }
            }
        }
        System.out.println("Numeros Pares - "+par +" \nNumeros Impares - " + impar);
    }
}
