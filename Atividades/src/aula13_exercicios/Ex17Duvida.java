package aula13_exercicios;

import java.util.Scanner;

/*Faça um Programa para uma loja de tintas. O programa deverá pedir o
tamanho em metros quadrados da área a ser pintada. Considere que a
cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a
tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em
galões de 3,6 litros, que custam R$ 25,00.
Informe ao usuário as quantidades de tinta a serem compradas
e os respectivos preços em 3 situações:
a - comprar apenas latas de 18 litros;
b - comprar apenas galões de 3,6 litros;
c - misturar latas e galões, de forma que o preço seja o menor.
Acrescente 10% de folga e sempre arredonde os
valores para cima, isto é, considere latas cheias.*/
public class Ex17Duvida {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o tamanho da área a ser pintada (m²)");
        double area = scan.nextDouble();

        double coberturaLata = 18*6;
        double coberturaGalao = 3.6*6;

        double valorLata = 80.00;
        double valorGalao = 25.00;

        double qtdLata =  area/coberturaLata+((area/coberturaLata)*0.1);
        double qtdGalao = area/coberturaGalao+((area/coberturaGalao)*0.1);


        System.out.println("Comprando somente Latas de 18L serão :"+ qtdLata + " no valor de R$" + qtdLata * valorLata );

        System.out.println("Comprando somente galões de 3,6L serão : "+ qtdGalao + " no valor de R$" + qtdGalao * valorGalao);

        //FALTA A ULTIMA PARTE "C".
    }
}
