package aula17.exercicios;

import java.util.Scanner;

/*Faça um programa que mostre todos os primos entre 1 e N sendo N
um número inteiro fornecido pelo usuário. O programa deverá mostrar
também o número de divisões que ele executou para encontrar os
números primos. Serão avaliados o funcionamento, o estilo e o número
de testes (divisões) executados.*/
public class Ex23_Duvida {
    public static void main(String[] args) {

        int inicio, fim, primo = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Número inicial: ");
        inicio = entrada.nextInt();
        System.out.print("Número final: ");
        fim = entrada.nextInt();

        for (int i = inicio; i <= fim; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    primo++;
                }
            }
            if (primo == 2) {
                System.out.println("O número " + i + " é PRIMO!");
            }
            primo = 0;
        }

        entrada.close();

    }
}
