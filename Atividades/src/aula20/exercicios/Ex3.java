package aula20.exercicios;

/*Capture do teclado valores para preenchimento de uma matriz M 3x3.
Após a captura imprima a matriz criada e encontre a quantidade de números pares, a quantidade de números ímpares.*/

import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {

        int[][] matrizM = new int[3][3];

        //teste
        Random gerador = new Random();


        for (int i = 0;i < matrizM.length;i++){
            for(int j = 0;j < matrizM[i].length;j++){

                matrizM[i][j] = gerador.nextInt();
            }
        }

        int par=0,impar=0;

        for (int i = 0;i < matrizM.length;i++){
            for(int j = 0;j < matrizM[i].length;j++) {

                if (matrizM[i][j] % 2 == 0){

                    par++;
                } else {

                    impar++;
                }
                System.out.println(matrizM[i][j]);
            }
            System.out.println();
        }
        System.out.println("Numeros Pares - "+par +" \nNumeros Impares - " + impar);
    }
}
