package com.filipe.cursojava.poo.aula25_26_27_metodo.labs.ex3;

import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Insira seu nome :");
        aluno.nome = scan.nextLine();

        System.out.print("Insira sua matrícula : ");
        aluno.matricula = scan.nextLine();

        System.out.print("Insira o seu curso : ");
        aluno.curso = scan.nextLine();


        for (int i = 0; i < aluno.disciplinas.length; i++) {
            System.out.print("Insira o nome da " + (i + 1) + "ª Disciplina : ");
            aluno.disciplinas[i] = scan.next();
        }

        for (int i = 0; i < aluno.notas.length; i++) {
            System.out.println("Insira as notas da matéria " + aluno.disciplinas[i]);
            for (int j = 0; j < aluno.notas[i].length; j++) {
                do {
                    System.out.print((j + 1) + "ª nota :");
                    aluno.notas[i][j] = scan.nextDouble();

                    if (aluno.notas[i][j] < 0 || aluno.notas[i][j] > 10) {
                        System.out.println("*** ERRO - INSIRA UMA NOTA VÁLIDA ***");
                    }
                } while (aluno.notas[i][j] < 0 || aluno.notas[i][j] > 10);
            }
        }
        aluno.mostarInfo();
    }
}
