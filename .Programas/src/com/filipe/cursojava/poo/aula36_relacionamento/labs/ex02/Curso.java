package com.filipe.cursojava.poo.aula36_relacionamento.labs.ex02;

public class Curso {

    private String nomeCurso, horario;
    private Aluno[] alunos;
    private Professor professor;
    private int operacao;

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public int getOperacao() {
        return operacao;
    }

    public void setOperacao(int operacao) {
        this.operacao = operacao;
    }

    void exibirListaAlunos() {
        System.out.println();
        if (getAlunos() != null) {
            for (int i = 1; i < getAlunos().length; i++) {
                if (getAlunos()[i] != null) {
                    System.out.println(getAlunos()[i].getNumAluno() + " - " + getAlunos()[i].getNomeAluno());
                } else {
                    break;
                }
            }
        } else {
            System.out.println("Não há alunos cadastrados");
        }
    }

    void exibirMediaAluno() {
        if (getAlunos()[getOperacao()] != null) {
            for (int i = 0; i < getAlunos()[getOperacao()].getNotas().length; i++) {
                getAlunos()[getOperacao()].setMediaAlunos(getAlunos()[getOperacao()].getNotas()[i]);
            }

            if ((getAlunos()[getOperacao()].getMediaAlunos() / 4 >= 7)) {
                System.out.println("Aprovado - Média " + (getAlunos()[getOperacao()].getMediaAlunos() / 4));
            } else {
                System.out.println("Reprovado - Média " + (getAlunos()[getOperacao()].getMediaAlunos() / 4));
            }
        } else {
            System.out.println("\nAluno não cadastrado");
        }
    }

    void exibirDadosProfessor() {
        System.out.println("Professor - " + getProfessor().getNomeProfessor());
        System.out.println("Departamento - " + getProfessor().getDepartamento());
        System.out.println("E-mail - " + getProfessor().getEmail());
    }

   /* void exibirMediaSala() {
        for (int i = 1; i < getAlunos()[i].getNotas().length; i++) {
            for (int j = 0; j < getAlunos()[i].getNotas()[j];j++) {
                getAlunos()[i].setMediaNotas(getAlunos()[].getNotas()[i]);
            }
        }

        System.out.println();

    }*/
}
