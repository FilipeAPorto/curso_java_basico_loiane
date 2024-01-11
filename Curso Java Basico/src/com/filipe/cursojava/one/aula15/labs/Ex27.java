package com.filipe.cursojava.one.aula15.labs;

import java.util.Scanner;

//Uma fruteira está vendendo frutas com a seguinte tabela de preços:
//x       | Até 5 Kg       | Acima de 5 Kg
//Morango | R$ 2,50 por Kg | R$ 2,20 por Kg
//Maçã    |R$ 1,80 por Kg  |R$ 1,50 por Kg
//Se o cliente comprar mais de 8 Kg em frutas ou o valor total da
//compra ultrapassar R$ 25,00, receberá ainda um desconto de
//10% sobre este total. Escreva um algoritmo para ler a
//quantidade (em Kg) de morangos e a quantidade (em Kg) de
//maças adquiridas e escreva o valor a ser pago pelo cliente.
public class Ex27 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira quantos Kg quer de morango : ");
        double kgMorango = scan.nextDouble();

        System.out.println("Insira quantos Kg quer de maçã : ");
        double kgMaca = scan.nextDouble();

        double valorMorango = 0;
        double valorMaca = 0;

        if(kgMorango <= 5){
            valorMorango = 2.5;
        }else {
            valorMorango = 2.2;
        }
        if(kgMaca <= 5){
            valorMaca = 1.8;
        }else {
            valorMaca = 1.5;
        }

        double valorTotal = (valorMaca*kgMaca)+(valorMorango*kgMorango);

        if (((kgMaca+kgMorango) > 8) || (valorTotal > 25)){
            valorTotal = valorTotal - (valorTotal*0.1);
        }
        System.out.println("Quantidade de Kg de morango " +kgMorango + "\nQuantidade de Kg de maça " + kgMaca);
        System.out.println("O valor total foi de R$"+valorTotal);
    }
}
