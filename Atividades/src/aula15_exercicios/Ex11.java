package aula15_exercicios;

import java.util.Scanner;
//Faça um programa que recebe o salário de um colaborador e o
//reajuste segundo o seguinte critério, baseado no salário atual:
//a - salários até R$ 280,00 (incluindo) : aumento de 20%
//b -  salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
//c - salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
//d - salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
//e - o salário antes do reajuste;
//f - o percentual de aumento aplicado;
//g - o valor do aumento;
//h - o novo salário, após o aumento.
public class Ex11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Reajuste salárial");
        System.out.println("Insira o seu salário: ");
        double salario = scan.nextDouble();

        double salarioAumento = 0;

        System.out.println("\nO valor do salário anterior era de : R$"+ salario+"\n");

        if(salario < 280){
           salarioAumento = (salario*0.2) + salario;
            System.out.println("O percentual de aumento foi de " + 20+"%");

        } else if ((salario >= 280) && (salario < 700)){
            salarioAumento = (salario*0.15) + salario;
            System.out.println("O percentual de aumento foi de " + 15+"%");

        } else if ((salario >= 700) && (salario < 1500)){
            salarioAumento = (salario*0.1) + salario;
            System.out.println("O percentual de aumento foi de " + 10+"%");

        } else if(salario >= 1500){
            salarioAumento = (salario*0.05) + salario;
            System.out.println("O percentual de aumento foi de " + 5+"%");
        }

        System.out.println("\nO valor de aumento foi de : R$" + (salarioAumento - salario));
        System.out.println("\nO novo salário sera de : R$"+salarioAumento);
    }
}
