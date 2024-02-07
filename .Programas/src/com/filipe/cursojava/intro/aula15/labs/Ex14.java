package com.filipe.cursojava.intro.aula15.labs;

import java.util.Scanner;

//Faça um programa que lê as duas notas parciais obtidas por um aluno
//numa disciplina ao longo de um semestre, e calcule a sua média. A
//atribuição de conceitos obedece à tabela abaixo:
//* Média de Aproveitamento Conceito
//* Entre 9.0 e 10.0 A
//* Entre 7.5 e 9.0 B
//* Entre 6.0 e 7.5 C
//* Entre 4.0 e 6.0 D
//* Entre 4.0 e zero E
//* algoritmo deve mostrar na tela as notas, a média, o conceito
//correspondente e a mensagem “APROVADO” se o conceito for
//A, B ou C ou “REPROVADO” se o conceito for D ou E.
public class Ex14 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Vamos calcular as notas dos alunos.");

        System.out.println("Insira a 1ª nota parcial :");
        double nota1 = scan.nextDouble();

        System.out.println("Insira a 2ª nota parcial :");
        double nota2 = scan.nextDouble();

        System.out.println("As notas foram : "+ nota1 + " e "+ nota2);

        double media = (nota1+nota2)/2;

        System.out.println("A média foi : " + media);

        if ((media <= 10) && (media >= 9)){
            System.out.println("O conceito foi A");
            System.out.println("APROVADO");
        } else if ((media < 9) && (media >= 7.5)){
            System.out.println("O conceito foi B");
            System.out.println("APROVADO");
        } else if ((media < 7.5) && (media >= 6)) {
            System.out.println("O conceito foi C");
            System.out.println("APROVADO");
        } else if ((media < 6) && (media >= 4)) {
            System.out.println("O conceito foi D");
            System.out.println("REPROVADO");
        } else {
            System.out.println("O conceito foi E");
            System.out.println("REPROVADO");
        }
    }
}
