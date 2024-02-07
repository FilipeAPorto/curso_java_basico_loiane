package com.filipe.cursojava.intro.aula17.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

/*O Sr. Manoel Joaquim possui uma grande loja de artigos de R$ 1,99,
com cerca de 10 caixas. Para agilizar o cálculo de quanto cada cliente
deve pagar ele desenvolveu um tabela que contém o número de itens
que o cliente comprou e ao lado o valor da conta. Desta forma a
atendente do caixa precisa apenas contar quantos itens o cliente está
levando e olhar na tabela de preços. Você foi contratado para
desenvolver o programa que monta esta tabela de preços, que conterá
os preços de 1 até 50 produtos, conforme o exemplo abaixo:
*Lojas Quase Dois - Tabela de preços
* 1 - R$ 1.99
* 2 - R$ 3.98
* ...
* 50 - R$ 99.50
*/
public class Ex29_Estudar_Decimal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String formato = "R$ #,##0.00";

        DecimalFormat df = new DecimalFormat(formato);

        int qtdItem;
        double valorUn=1.99,total=0;

        do {
            System.out.print("Insira a quantidade de itens : ");
            qtdItem = scan.nextInt();

            if ((qtdItem <= 0) || (qtdItem > 50)){
                System.out.println("\n** ERRO - INSIRA UMA QUANTIDADE VÁLIDA **");
            }
        }while ((qtdItem <= 0) || (qtdItem > 50));

        System.out.println("##### Lojas Quase Dois ##### \n** Tabela de preços **");

        for (int i=1;i<=qtdItem;i++){

            total += valorUn;
            System.out.println("Item "+i+"    -    "+df.format(total));
        }
    }
}
