package com.filipe.cursojava.poo.aula45_casting_instanceof_estudar;

public class Teste {
    public static void main(String[] args) {

      /*  Aluno aluno = new Aluno();
        Pessoa pessoaAluno = aluno; // upcasting automatico


        Pessoa aluno2 = (Pessoa) new Aluno(); //upcasting manual

        Pessoa aluno3 = new Pessoa();
        Aluno aluno4 = (Aluno) aluno3; // downcasting vai dar erro */

        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor prof = new Professor();

        if (pessoa instanceof Pessoa){
            System.out.println("é do tipo Pessoa");
        }

        if (aluno instanceof Aluno){
            System.out.println("é do tipo Aluno");
        }

        if (prof instanceof Professor){
            System.out.println("é do tipo Professor");
        }

    }
}
