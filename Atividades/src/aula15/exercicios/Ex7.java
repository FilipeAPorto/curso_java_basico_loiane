package aula15.exercicios;

import java.util.Scanner;

//Faça um Programa que leia três números e mostre o maior e o menor deles.
public class Ex7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o 1º número inteiro :");
        int numero1 = scan.nextInt();

        System.out.println("Insira o 2º número inteiro :");
        int numero2 = scan.nextInt();

        System.out.println("Insira o 3º número inteiro : ");
        int numero3 = scan.nextInt();


        if ((numero1 >= numero2) && (numero1 >= numero3)) {
            System.out.println("O maior número inteiro é : "+ numero1);
        } else if ((numero2 >= numero1) && (numero2 >= numero3)){
            System.out.println("O maior número inteiro é : "+ numero2);
        } else if ((numero3 >= numero1) && (numero3 >= numero2)){
            System.out.println("O maior número inteiro é : "+ numero3);
        }

        if ((numero1 <= numero2) && (numero1 <= numero3)) {
            System.out.println("O menor número inteiro é : "+ numero1);
        } else if ((numero2 <= numero1) && (numero2 <= numero3)){
            System.out.println("O menor número inteiro é : "+ numero2);
        } else if ((numero3 <= numero1) && (numero3 <= numero2)){
            System.out.println("O menor número inteiro é : "+ numero3);
        }
    }
}
