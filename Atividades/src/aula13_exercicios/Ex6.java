package aula13_exercicios;

import java.util.Scanner;

//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
public class Ex6 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Vamos calcular a área de um circulo. \nInsira o valor do raio do circulo : ");
        double raio = scan.nextDouble();

        double resultado = Math.PI * Math.pow(raio , 2);


        System.out.println("A área do circulo é : " + resultado);


    }
}
