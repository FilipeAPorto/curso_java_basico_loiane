package com.filipe.cursojava.intro.aula14;

import java.util.Scanner;

public class if_Else {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Entre com a sua idade : ");

        int idade = scan.nextInt();

        if (idade >= 18){
            System.out.println("É maior de idade!");
        } else {
            System.out.println("Não é maior de idade!");
        }

        //preco < R$10,00 = MUITO BARATO, PODE COMPRAR
        //R$10,00 < preco < R$15,00 = PEDIR DESCONTO
        //R$15,00 <= preco < R$17,00 = PESQUISAR MAIS
        //R$17,00 >= preco = MUITO CARO


        System.out.println("Entre com o preço do item");
        double preco = scan.nextDouble();

        if (preco <= 10){
            System.out.println("Está barato, pode comprar");
        } else if (preco > 10 && preco < 15){
            System.out.println("Você pode pedir um desconto.");
        } else if (preco >= 15 && preco < 17){
            System.out.println("Pode pesquisar mais.");
        } else {
            System.out.println("Muito caro.");
        }
    }


}
