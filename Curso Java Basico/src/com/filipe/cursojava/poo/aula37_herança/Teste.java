package com.filipe.cursojava.poo.aula37_herança;

public class Teste {
    public static void main(String[] args) {


        Aluno aluno = new Aluno();

        Professor professor = new Professor();

        aluno.setNome("Maria");

        System.out.println(aluno.getNome());
    }
}
