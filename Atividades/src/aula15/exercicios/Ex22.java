package aula15.exercicios;

import java.util.Scanner;

//Faça um Programa que peça um número inteiro e determine se ele é
//par ou impar. Dica: utilize o operador módulo (resto da divisão).
public class Ex22 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um numero inteiro : ");
        int numero = scan.nextInt();

        numero = numero % 2;

        if (numero == 1){
            System.out.println("O número digitado é impar!");
        } else {
            System.out.println("O numero digitado é par!");
        }
    }
}
