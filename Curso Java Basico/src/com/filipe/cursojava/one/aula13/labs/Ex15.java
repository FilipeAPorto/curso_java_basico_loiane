package com.filipe.cursojava.one.aula13.labs;

import java.util.Scanner;

//Faça um Programa que pergunte quanto você ganha por hora e o
//número de horas trabalhadas no mês. Calcule e mostre o total do seu
//salário no referido mês, sabendo-se que são descontados 11% para o
//Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
//programa que nos dê:
//. salário bruto.
//a. quanto pagou ao INSS.
//b. quanto pagou ao sindicato.
//c. o salário líquido.
//d. calcule os descontos e o salário líquido, conforme a tabela
//abaixo:
//+ Salário Bruto : R$ - IR (11%) : R$ - INSS
//(8%) : R$ - Sindicato ( 5%) : R$ = Salário
//Liquido : R$
//Obs.: Salário Bruto - Descontos = Salário Líquido.
public class Ex15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Vamos calcular seu salário mensal. \nInsira seus ganhos por hora trabalhada : ");
        double ganhoshora = scan.nextDouble();

        System.out.println("Insira o número de horas trabalhadas no mês : ");
        double horastrab = scan.nextDouble();

        double salarioBruto = ganhoshora * horastrab;

        double ir = salarioBruto * 0.11;
        double inss = (salarioBruto - ir) * 0.08;
        double sindi = (salarioBruto - ir - inss) * 0.05;
        double salarioLiquido = salarioBruto - ir - inss - sindi;
        double totalDescontos = ir + inss + sindi;

        System.out.println("Seu salário bruto mensal é : R$" + salarioBruto) ;
        System.out.println("Pagou de INSS : R$" + inss);
        System.out.println("Pagou de sindicato : R$" + sindi);
        System.out.println("Total de descontos : R$" + totalDescontos);
        System.out.println("Salário Liquido : R$" + salarioLiquido);








    }
}
