package com.filipe.cursojava.intro.aula17.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

/*O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende
implantar a metodologia da tabelinha, que já é um sucesso na sua loja
de 1,99. Você foi contratado para desenvolver o programa que monta
a tabela de preços de pães, de 1 até 50 pães, a partir do preço do pão
informado pelo usuário, conforme o exemplo abaixo:
* Preço do pão: R$ 0.18
* Panificadora Pão de Ontem - Tabela de preços
* 1 - R$ 0.18
* 2 - R$ 0.36
* ...
* 50 - R$ 9.00
*/
public class Ex30 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String formato = "R$ #,##0.00";
        DecimalFormat df = new DecimalFormat(formato);

        int qtdPao;
        double valorPao,total=0;

        do {
            System.out.print("Insira a quantidade de pães (Máximo 50) : ");
            qtdPao = scan.nextInt();

            if ((qtdPao <= 0) || (qtdPao > 50)){
                System.out.println("\n** ERRO - INSIRA UMA QUANTIDADE VÁLIDA **");
            }
        }while ((qtdPao <= 0) || (qtdPao > 50));

        do{
            System.out.print("insira o valor do pão : ");
            valorPao = scan.nextDouble();

            if(valorPao <= 0){
                System.out.println("\n** ERRO - INSIRA UM VALOR VÁLIDO **");
            }
        } while (valorPao <= 0);


        System.out.println("##### Panificadora Pão de Ontem ##### \n** Tabela de preços **");
        System.out.println("Preço unitário - R$"+ df.format(valorPao));

        for (int i=1;i<=qtdPao;i++) {

            total += valorPao;
            System.out.println(i + "       -       " + df.format(total));
        }
    }
}
