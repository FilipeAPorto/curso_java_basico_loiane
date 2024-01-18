package com.filipe.cursojava.poo.aula41_classes_abstratas_estudar;

public abstract class Pessoa { //A classe não pode ser instanciada, somente as classes filhas.

    private String nome, endereco, telefone, cpf;

    public Pessoa() {
    }

    public Pessoa(String nome, String endereco, String telefone) {
        super();
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public abstract String obterEtiquetaEndereco();


    public abstract void imprimirEtiquetaEndereco();


}
