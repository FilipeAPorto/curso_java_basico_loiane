package com.filipe.cursojava.poo.aula33_sobrecarga.labs.ex03;

import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Aluno_Estudar aluno = new Aluno_Estudar();

        System.out.print("Insira seu nome :");
        aluno.setNome(scan.nextLine());

        System.out.print("Insira o seu curso : ");
        aluno.setCurso(scan.nextLine());

        System.out.print("Insira sua matrícula : ");
        aluno.setMatricula(scan.nextLine());

        for (int i = 0; i < aluno.getDisciplinas().length; i++) {
            System.out.print("Insira o nome da " + (i + 1) + "ª Disciplina : ");
            aluno.settarDisciplinaPos(i, scan.nextLine());
        }

        for (int i = 0; i < aluno.getNotas().length; i++) {
            System.out.println("Insira as notas da matéria " + aluno.getDisciplinas()[i]);
            for (int j = 0; j < aluno.getNotas()[i].length; j++) {
                do {
                    System.out.print((j + 1) + "ª nota :");
                    aluno.settarNotasPos(i,j, scan.nextDouble());

                    if (aluno.getNotas()[i][j] < 0 || aluno.getNotas()[i][j] > 10) {
                        System.out.println("*** ERRO - INSIRA UMA NOTA VÁLIDA ***");
                    }
                } while (aluno.getNotas()[i][j] < 0 || aluno.getNotas()[i][j] > 10);
            }
        }
        aluno.mostarInfo();
    }
}
