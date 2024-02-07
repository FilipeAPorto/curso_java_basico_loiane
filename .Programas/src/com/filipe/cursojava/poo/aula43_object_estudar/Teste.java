package com.filipe.cursojava.poo.aula43_object_estudar;

public class Teste {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setCurso("Ciencia da Computação");
        double[] notas = {10,9,8,7};
        aluno.setNotas(notas);


        System.out.println(aluno); // Variaveis do tipo não primitivo,
        // alterando o toString ele imprime a informação que vc quiser.

        String s1 = "Ola Teste";
        String s2 = "Ola TestE";

        System.out.println(s1.equalsIgnoreCase(s2));

        Aluno aluno2 = new Aluno();
        aluno.setCurso("Ciencia da Computação");
        double[] notas2 = {10,9,8,7};
        aluno2.setNotas(notas2);

        System.out.println(aluno == aluno2); // Comparando as referencias na memória.
        System.out.println(aluno.equals(aluno2));
    }
}
