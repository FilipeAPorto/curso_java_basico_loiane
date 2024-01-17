package com.filipe.cursojava.poo.aula36_relacionamento.labs.ex02;

import java.util.Scanner;

public class TesteCurso {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int operacao, i = 1;
        boolean sair = false;
        double[] notas = new double[4];

        Curso curso = new Curso();

        Professor professor = new Professor();

        Aluno[] aluno = new Aluno[50];

        curso.setProfessor(professor); //Settando a classe professor dentro da classe curso.

        System.out.print("Informe o nome do curso : ");
        curso.setNomeCurso(scan.nextLine());

        System.out.print("Informe o nome do professor responsável : ");
        professor.setNomeProfessor(scan.nextLine());

        System.out.print("Informe o departamento : ");
        professor.setDepartamento(scan.nextLine());

        System.out.print("Informe o email : ");
        professor.setEmail(scan.nextLine());

        while (!sair) {
            do {
                System.out.println("\n1 - Cadastrar novo aluno");
                System.out.println("2 - Exibir lista dos alunos");
                System.out.println("3 - Exibir dados do professor responsável");
                System.out.println("0 - Sair");
                operacao = scan.nextInt();

                if (operacao < 0 || operacao > 3) {
                    System.out.println("*** ERRO - DIGITE UMA OPÇÃO VÁLIDA ***");
                }
            } while (operacao < 0 || operacao > 3);

            scan.nextLine();

            if (operacao == 1) {
                aluno[i] = new Aluno(); // Estanciando cada novo aluno para a classe Aluno.

                curso.setAlunos(aluno);  //Settando a classe aluno dentro da classe curso.

                System.out.print("Informe o nome do " + (i) + "º aluno : ");
                aluno[i].setNomeAluno(scan.nextLine());

                aluno[i].setNumAluno(i);

                for (int j = 0; j < 4; j++) {
                    do {
                        System.out.print("Insira a " + (j + 1) + "ª nota :");
                        notas[j] = scan.nextDouble();

                        if (notas[j] < 0 || notas[j] > 10) {
                            System.out.println("*** ERRO - INSIRA UMA NOTA VÁLIDA ***");
                        } else {
                            aluno[i].setNotas(notas);
                        }
                    } while (notas[j] < 0 || notas[j] > 10);
                }
                i++;
            } else if (operacao == 2) {

                curso.exibirListaAlunos();

                if (curso.getAlunos() != null) {
                    System.out.print("\nVerificar a média de qual aluno (Insira o numero do aluno ou 0 para a média da sala) :");
                    curso.setOperacao(scan.nextInt());

                    if (curso.getOperacao() == 0) {

                    } else {
                        curso.exibirMediaAluno();
                    }
                }
            } else if (operacao == 3) {
                curso.exibirDadosProfessor();
            } else {
                break;
            }
        }
    }
}
