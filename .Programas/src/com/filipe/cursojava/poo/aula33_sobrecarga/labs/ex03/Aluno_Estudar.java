package com.filipe.cursojava.poo.aula33_sobrecarga.labs.ex03;

/*Escreva uma classe para representar um Aluno. Adicione atributos relacionados às caracteristicas de um Aluno, como nome,
matricula, curso que está matriculado, nome de 3 disciplinas que está cursando e as notas dessas 3 disciplinas.
Desenvolva um método para verificar se o aluno está aprovado (nota maior ou igual a 7) em uma determinada disciplina.
Escreva um programa para testar essa classe, que pede as informações do aluno ao usuário e ao final informa o nome das disciplinas, mostra as
notas e mostra se o aluno foi aprovado ou não.*/
public class Aluno_Estudar {

    private String nome, matricula, curso;
    private String[] disciplinas;
    private double[] media;
    private double[][] notas;

    public Aluno_Estudar() {
        this.disciplinas = new String[3];
        this.media = new double[3];
        this.notas = new double[3][4];
    }

    public Aluno_Estudar(String nome, String matricula, String curso, String[] disciplinas, double[] media, double[][] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinas = new String[3];
        this.media = new double[3];
        this.notas = new double[3][4];
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double[] getMedia() {
        return media;
    }

    public void setMedia(double[] media) {
        this.media = media;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }

    public void mostarInfo() {

        System.out.println("\nNome do aluno(a) - " + nome);
        System.out.println("\nNúmero da matrícula - " + matricula);
        System.out.println("\nNome do curso - " + curso);
        System.out.println();

        obterMedia();

        for (int i = 0; i < disciplinas.length; i++) {
            if (media[i] >= 7) {
                System.out.println(disciplinas[i] + " - Média = " + media[i] + " - Aprovado!");
            } else {
                System.out.println(disciplinas[i] + " - Média = " + media[i] + " - Reprovado!");
            }
        }

    }

    private void obterMedia() {
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                media[i] += notas[i][j];
            }
            media[i] /= 4;
        }
    }

    //ESTUDAR - ARRAY COMO METODO
    public void settarDisciplinaPos(int posI, String nomeDisciplina) {
        this.disciplinas[posI] = nomeDisciplina;
    }

    //ESTUDAR - ARRAY COMO METODO
    public void settarNotasPos(int posI, int posJ, double valorNota) {
        this.notas[posI][posJ] = valorNota;
    }
}
