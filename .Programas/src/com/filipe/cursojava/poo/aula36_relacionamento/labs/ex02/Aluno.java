package com.filipe.cursojava.poo.aula36_relacionamento.labs.ex02;

public class Aluno {

    private String nomeAluno;
    private int numAluno;
    private double[] notas;
    private double mediaAlunos;
    private double mediaSala;

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getNumAluno() {
        return numAluno;
    }

    public void setNumAluno(int numAluno) {
        this.numAluno = numAluno;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double getMediaAlunos() {
        return mediaAlunos;
    }

    public void setMediaAlunos(double mediaAlunos) {
        this.mediaAlunos += mediaAlunos;
    }

    public double getMediaSala() {
        return mediaSala;
    }

    public void setMediaSala(double mediaSala) {
        this.mediaSala = mediaSala;
    }
}
