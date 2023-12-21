package aula13.exercicios;

import java.util.Scanner;

//Faça um programa para uma loja de tintas. O programa deverá pedir o
//tamanho em metros quadrados da área a ser pintada. Considere que a
//cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a
//tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao
//usuário a quantidades de latas de tinta a serem compradas e o preço
//total.
public class Ex16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o tamanho da área a ser pintada (m²)");
        double area = scan.nextDouble();

        double coberturaLata = 18*3;

        double qtdLatas = area / coberturaLata ;

        double valorLata = 80.00;

        double valorLataTotal = qtdLatas * valorLata;


        System.out.println("\nPara essa metragem deve-se comprar " + qtdLatas+ " lata(s) de tinta(s)\n" +
                "O valor total será : R$" + valorLataTotal);

    }
}
