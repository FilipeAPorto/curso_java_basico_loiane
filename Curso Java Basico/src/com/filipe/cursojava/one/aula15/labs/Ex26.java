package com.filipe.cursojava.one.aula15.labs;

import java.util.Scanner;

//Um posto está vendendo combustíveis com a seguinte tabela de descontos:
//* Álcool:
//a. até 20 litros, desconto de 3% por litro
//b. acima de 20 litros, desconto de 5% por litro

//* Gasolina:
//c. até 20 litros, desconto de 4% por litro
//d. acima de 20 litros, desconto de 6% por litro
//Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível
//(codificado da seguinte forma: A-álcool, G - gasolina),calcule e imprima o valor a ser pago pelo cliente
//sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.
public class Ex26 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("\nQual tipo de combustivel você deseja abastecer (G - Gasolina ou A - Alcool) ?");
        String tipoComb = scan.next();

        System.out.println("Quantos litros você deseja ?");
        double litros = scan.nextDouble();

        double valorAlcool = 1.90;
        double valorGasolina = 2.50;
        double valorDesc = 0;

        if (tipoComb.equalsIgnoreCase("A")){
            if(litros < 20){
                valorDesc = (valorAlcool - (valorAlcool * 0.03)) * litros;
            }else if(litros >= 20){
                valorDesc = (valorAlcool - (valorAlcool * 0.05)) * litros;
            }
            System.out.println("Valor a ser pago R$" + valorDesc);
        }else if (tipoComb.equalsIgnoreCase("G")){
            if(litros < 20){
                valorDesc = (valorGasolina - (valorGasolina * 0.04)) * litros;
            }else if(litros >= 20){
                valorDesc = (valorGasolina - (valorGasolina * 0.06)) * litros;
            }
            System.out.println("Valor a ser pago R$" + valorDesc);
        }
    }
}
