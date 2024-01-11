package com.filipe.cursojava.one.aula19.labs;

import java.util.Scanner;

/*Ler as duas notas bimestrais para um conjunto de 10 alunos.
Armazenar as notas informadas em dois vetores “Nota1” e “Nota2” do
tipo real. Escreva um programa que calcule a média aritmética simples
das notas informadas armazenando o resultado em um vetor “Result”
de mesmo tipo e tamanho. Ao mostrar os resultados exibir a situação
de cada aluno. Se a média calculada for superior ou igual a 7 o aluno
estará “aprovado”, caso contrário, a situação do aluno será “reprovado”.*/
public class Ex19 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] nota1 = new double[10];
        double[] nota2 = new double[10];
        double[] result = new double[10];

        System.out.println("Vamos inserir 2 notas bimestrais dos 10 alunos");

        for (int i=0;i<nota1.length;i++){

            do {
                System.out.print("\nInsira a PRIMEIRA nota do " + (i + 1) + "º aluno : ");
                nota1[i] = scan.nextDouble();

                if (nota1[i]<0 || nota1[i]>10){
                    System.out.println("*** Erro - Insira um valor válido ***");
                }

            }while(nota1[i]<0 || nota1[i]>10);

            do {
                System.out.print("\nInsira a SEGUNDA nota do " + (i + 1) + "º aluno : ");
                nota2[i] = scan.nextDouble();

                if (nota2[i]<0 || nota2[i]>10){
                    System.out.println("*** Erro - Insira um valor válido ***");
                }

            }while(nota2[i]<0 || nota2[i]>10);

            result[i] = (nota1[i] + nota2[i]) / 2;
        }

        for(int i=0;i< result.length;i++){

            if (result[i]>= 7) {
                System.out.println("A média das 2 notas inseridas do aluno " + (i + 1) + " é " + result[i] +" e o aluno esta APROVADO.");
            } else {
                System.out.println("\nA média das 2 notas inseridas do aluno " + (i + 1) + " é " + result[i] +" e o aluno esta REPROVADO.");

            }
        }
    }
}
