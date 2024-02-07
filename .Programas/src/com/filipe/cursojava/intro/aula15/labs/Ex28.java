package com.filipe.cursojava.intro.aula15.labs;

import java.util.Scanner;

//O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:
//x          | Até 5 Kg       | Acima de 5 Kg
//File Duplo | R$ 4,90 por Kg | R$ 5,80 por Kg
//Alcatra    | R$ 5,90 por Kg | R$ 6,80 por Kg
//Picanha    | R$ 6,90 por Kg | R$ 7,80 por Kg
//Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção,
// porém não há limites para a quantidade de carne por cliente. Se compra for feita no cartão Tabajara o
// cliente receberá ainda um desconto de 5% sobre o total a compra.
// Escreva um programa que peça o tipo e a quantidade de carne comprada pelo usuário e gere
//um cupom fiscal, contendo as informações da compra: tipo e quantidade de carne,
// preço total, tipo de pagamento, valor do desconto e valor a pagar.
public class Ex28 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("\nBem vindo ao Hipermercado Tabajara!\n");

        System.out.println("Qual o tipo da carne : 1 - File Duplo; 2 - Alcatra ; 3 - Picanha");

        int numCarne = scan.nextInt();

        if (numCarne > 3) {
            System.out.println("Tipo de carne indisponivel");
            return;
        }
        System.out.println("\nQual a quantidade em Kg : ");
        double qtdCarne = scan.nextDouble();

        double valorCarne = 0;
        double valorTotal = 0;
        String tipoCarne = "";


        if (numCarne == 1) {
            tipoCarne = "File Duplo";
            if (qtdCarne <= 5) {
                valorCarne = 4.90;
            } else {
                valorCarne = 5.80;
            }
        } else if (numCarne == 2) {
            tipoCarne = "Alcatra";
            if (qtdCarne <= 5) {
                valorCarne = 5.90;
            } else {
                valorCarne = 6.80;
            }
        } else if (numCarne == 3) {
            tipoCarne = "Picanha";
            if (qtdCarne <= 5) {
                valorCarne = 6.90;
            } else {
                valorCarne = 7.80;
            }


        }
        valorTotal = valorCarne * qtdCarne;


        System.out.println("Forma de pagamento : 1 - Dinheiro ; 2 - Cartão Comum ; 3 - Cartão Hipermercado Tabajara");
        int formaPgto = scan.nextInt();

        double valorDesc = 0;

        if (formaPgto == 3) {
            valorDesc = valorTotal * 0.05;
        } else if (formaPgto <= 2) {
            valorDesc = 0;
        } else {
            System.out.println("Forma de pagamento inexistente");
            return;
        }


        System.out.println("***CUPOM FISCAL***");
        System.out.println("Tipo da carne: " + tipoCarne);
        System.out.println("Quantidade de Carne : " + qtdCarne + "Kg");
        System.out.println("Preço da carne R$" + valorCarne);


        if (formaPgto == 1) {
            System.out.println("Forma de pagamento - Dinheiro");
            System.out.println("Sem desconto");
            System.out.println("Valor total R$" + valorTotal);

        } else if (formaPgto == 2) {
            System.out.println("Forma de pagamento - Cartão Comum");
            System.out.println("Sem desconto");
            System.out.println("Valor total R$" + valorTotal);

        } else if (formaPgto == 3) {
            System.out.println("Valor total sem desconto R$" + valorTotal);
            System.out.println("Forma de pagamento - Cartão Hipermercado Tabajara");
            System.out.println("Valor do desconto R$" + valorDesc);
            System.out.println("Valor total R$" + (valorTotal - valorDesc));


        }
    }
}