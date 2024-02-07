package com.filipe.cursojava.intro.aula15.labs;

import java.util.Scanner;

//Faça um programa para o cálculo de uma folha de pagamento,
//sabendo que os descontos são do Imposto de Renda, que depende do
//salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o
//FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é
//a empresa que deposita).O programa deverá pedir ao usuário o
//valor da sua hora e a quantidade de horas trabalhadas no mês.
//----------------------------------------------------------------
// Desconto do IR:
//Salário Bruto até 900 (inclusive) - isento
//Salário Bruto até 1500 (inclusive) - desconto de 5%
//Salário Bruto até 2500 (inclusive) - desconto de 10%
//Salário Bruto acima de 2500 - desconto de 20%
//----------------------------------------------------------------
// Imprima na tela as informações, dispostas conforme o exemplo abaixo.
// No exemplo o valor da hora é 5 e a quantidade de hora é 220.
// Salário Bruto: (5 * 220) : R$ 1100,00
//(-) IR (5%) : R$ 55,00
//(-) INSS ( 10%) : R$ 110,00
//FGTS (11%) : R$ 121,00
//Total de descontos : R$ 165,00
//Salário Liquido : R$ 935,00
public class Ex12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Vamos calcular os impostos sobre o seu salário.");
        System.out.println("Insira a quantidade de horas trabalhadas no mês: ");
        double horasTrab = scan.nextDouble();

        System.out.println("Insira o valor da hora trabalhada : ");
        double valorHoraTrab = scan.nextDouble();

        double salarioBruto = horasTrab * valorHoraTrab;

        double impostoRenda = 0;

        System.out.println("Salario bruto " +"("+ valorHoraTrab + "*" + horasTrab +")"+": R$"+salarioBruto);

        if ((salarioBruto > 901) && (salarioBruto <= 1500)){
            impostoRenda = salarioBruto*0.05;
            System.out.println("(-) IR (5%) R$" + impostoRenda);

        } else if ((salarioBruto >1501) && (salarioBruto <= 2500)){
            impostoRenda = salarioBruto*0.1;
            System.out.println("(-) IR (10%) R$" + impostoRenda);

        } else if (salarioBruto > 2501){
            impostoRenda = salarioBruto*0.2;
            System.out.println("(-) IR (20%) R$" + impostoRenda);
        } else{
            System.out.println("Isento");
        }

        double salarioMenosIR = salarioBruto - impostoRenda;

        double iNSS = salarioMenosIR*0.1;

        System.out.println("(-) INSS (10%) R$" + iNSS);

        double salarioMenosINSS = salarioMenosIR - iNSS;

        System.out.println("FGTS (11%) R$" + salarioBruto * 0.11);

        System.out.println("Total de descontos R$" + (iNSS + impostoRenda));

        System.out.println("Salario Liquido R$" + salarioMenosINSS);
    }
}
