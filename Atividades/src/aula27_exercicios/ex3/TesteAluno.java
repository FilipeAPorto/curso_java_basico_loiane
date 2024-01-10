package aula27_exercicios.ex3;

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

            System.out.print("Insira a " + (i + 1) + "ª nota da matéria " + aluno.disciplinas[i] + " : ");
            aluno.notas[i] = scan.nextDouble();
        }
        aluno.verificarAprovacao();
    }
}
