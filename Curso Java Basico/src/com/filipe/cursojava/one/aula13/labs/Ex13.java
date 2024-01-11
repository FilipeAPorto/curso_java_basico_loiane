package com.filipe.cursojava.one.aula13.labs;

import java.util.Scanner;

//Tendo como dados de entrada a altura e o sexo de uma pessoa,construa um algoritmo que calcule seu peso ideal,
// utilizando as seguintes fórmulas:
//. Para homens: (72.7*h) - 58
//a. Para mulheres: (62.1*h) - 44.7 (h = altura)
//b. Peça o peso da pessoa e informe se ela está dentro, acima ou abaixo do peso.
public class Ex13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Vamos verificar se você esta dentro do peso. \nInsira sua altura : ");
        double altura = scan.nextDouble();

        System.out.println("Você é do sexo masculino ou feminino : ");
        String sexo = scan.next();

        System.out.println("Informe seu peso atual : ");
        double pesoAtual = scan.nextDouble();

        if (sexo.equals("masculino")){
            double pesoIdealMasc = ((72.7*altura) - 58);

            if (pesoAtual <= pesoIdealMasc){
                System.out.println("Você esta dentro do peso!");
            } else { System.out.println("Você esta acima do peso!");
            }

        } else if (sexo.equals("feminino")){
            double pesoIdealFem = ((62.1*altura) - 44.7);

            if (pesoAtual <= pesoIdealFem){
                System.out.println("Você esta dentro do peso!");
            } else {
                System.out.println("Você esta acima do peso!");
            }

        } else {
            System.out.println("Preencha as informações corretamente");
        }
    }
}