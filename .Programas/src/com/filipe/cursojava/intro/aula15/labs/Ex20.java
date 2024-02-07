package com.filipe.cursojava.intro.aula15.labs;

import java.util.Scanner;

//Faça um Programa para leitura de três notas parciais de um aluno. O
//programa deve calcular a média alcançada por aluno e presentar:
//. A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
//a. A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;
//b. A mensagem "Aprovado com Distinção", se a média for igual a 10.
public class Ex20 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Vamos verificar se o aluno em questão foi aprovado!");
        System.out.println("Insira a primeira nota parcial : ");
        double nota1 = scan.nextDouble();

        System.out.println("Insira a segunda nota parcial : ");
        double nota2 = scan.nextDouble();

        System.out.println("Insira a terçeira nota parcial : ");
        double nota3 = scan.nextDouble();

        double media = (nota1+nota2+nota3)/3;

        if (media == 10){
            System.out.println("Aprovado com Distinção!\nSua média foi " + media);
        } else if ((media < 10) && (media >= 7)){
            System.out.println("Aprovado!\nSua média foi " + media);
        }else System.out.println("Reprovado!\nSua média foi " + media);
    }
}
