package com.filipe.cursojava.one.aula15.labs;

import java.util.Scanner;

//Faça um Programa que peça os 3 lados de um triângulo. O programa
//deverá informar se os valores podem ser um triângulo. Indique, caso
//os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
//escaleno.
//*Dicas:
//* Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
//* Triângulo Equilátero: três lados iguais;
//* Triângulo Isósceles: quaisquer dois lados iguais;
//* Triângulo Escaleno: três lados diferentes;
public class Ex15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o 1º valor do triângulo :");
        double valor1 = scan.nextDouble();

        System.out.println("Insira o 2º valor do triângulo :");
        double valor2 = scan.nextDouble();

        System.out.println("Insira o 3º valor do triângulo :");
        double valor3 = scan.nextDouble();

        if ((valor1+valor2 >= valor3) && (valor1+valor3 >= valor2) && (valor2+valor3 >= valor1)){
            if ((valor1 == valor2) && (valor1 == valor3) && (valor2 == valor3)) {
                System.out.println("É um Triângulo Equilátero!");
            } else if ((valor1 == valor2) || (valor1 == valor3) || (valor2 == valor3)){
                System.out.println("É um Triângulo Isósceles!");
            } else if ((valor1 != valor2) && (valor1 != valor3) && (valor2 != valor3)){
                System.out.println("É um Triângulo Escaleno!");
            }
        } else System.out.println("Não é um triângulo");
    }
}
