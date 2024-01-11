package aula27_exercicios.ex3;

/*Escreva uma classe para representar um Aluno. Adicione atributos relacionados às caracteristicas de um Aluno, como nome,
matricula, curso que está matriculado, nome de 3 disciplinas que está cursando e as notas dessas 3 disciplinas.
Desenvolva um método para verificar se o aluno está aprovado (nota maior ou igual a 7) em uma determinada disciplina.
Escreva um programa para testar essa classe, que pede as informações do aluno ao usuário e ao final informa o nome das disciplinas, mostra as
notas e mostra se o aluno foi aprovado ou não.*/
public class Aluno {

    String nome, matricula, curso;
    String[] disciplinas = new String[3];
    double[] media = new double[3];
    double[][] notas = new double[3][4];


    void mostarInfo() {

        System.out.println("\nNome do aluno(a) - " + nome);

        System.out.println("\nNúmero da matrícula - " + matricula);

        System.out.println("\nNome do curso - " + curso);

        System.out.println();


        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                media[i] += notas[i][j];
            }
            media[i] /= 4;
        }

        for (int i = 0; i < disciplinas.length; i++) {
            if (media[i] >= 7) {
                System.out.println(disciplinas[i] + " - Média = " + media[i] + " - Aprovado!");
            } else {
                System.out.println(disciplinas[i] + " - Média = " + media[i] + " - Reprovado!");
            }
        }
    }
}
