package com.filipe.cursojava.tratamento.aula52.labs_estudar;

public class Contato {

    private String nome, telefone, email;
    private int id;
    private static int contador = 0;


    public Contato() {
        contador++;
        id = contador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "ID: " + id + " - Nome : " + nome + " - Telefone : " + telefone + " - E-mail : " + email;
    }
}
