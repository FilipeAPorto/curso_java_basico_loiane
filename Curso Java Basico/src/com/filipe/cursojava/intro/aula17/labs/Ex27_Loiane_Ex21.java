package com.filipe.cursojava.intro.aula17.labs;

import java.util.Scanner;

/*Faça um programa que calcule o número médio de alunos por turma.
Para isto, peça a quantidade de turmas e a quantidade de alunos para
cada turma. As turmas não podem ter mais de 40 alunos.*/
public class Ex27_Loiane_Ex21 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int turma,aluno;
        double media,total=0;

        do {
            System.out.print("Insira a quantidade de turmas :");
            turma = scan.nextInt();

            if (turma <= 0){
                System.out.println("**ERRO - A quantidade de turmas inseridas é invalida**");
            }
        }while (turma <= 0);

        for (int i=1;i<=turma;i++){

            do {
                System.out.print("Insira a quantidade de alunos da " + i + "ª turma (máximo permitido - 40 alunos): ");
                aluno = scan.nextInt();

                if (aluno > 40){
                    System.out.println("\n**ERRO - A quantidade de alunos inseridos é acima do maximo permitido**");
                } else if (aluno <=0){
                    System.out.println("\n**ERRO - A quantidade de alunos inseridos é invalido**");
                }

            }while (aluno <= 0 || aluno > 40);

            total += aluno;
        }
        media = total/turma;

        System.out.println("\nSão "+total+" alunos em "+turma+" turmas.\nA média é de "+media+" alunos para cada turma");
    }
}
