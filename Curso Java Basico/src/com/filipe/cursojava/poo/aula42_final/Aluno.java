package com.filipe.cursojava.poo.aula42_final;

public class Aluno  { //Herança

    private String curso;
    private double[] notas;


    public Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String curso, double[] notas) {
        //super(nome, endereco, telefone);
        this.curso = curso;
        this.notas = notas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }


    public String obterEtiquetaEndereco() {
        String s = "Endereço do Aluno : ";
       // s += this.getEndereco();

        return s;
    }

   /*
    public void imprimirEtiquetaEndereco() {
        System.out.println(this.obterEtiquetaEndereco());
    }*/
}