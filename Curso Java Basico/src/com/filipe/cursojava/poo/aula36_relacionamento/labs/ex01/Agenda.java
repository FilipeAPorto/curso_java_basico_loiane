package com.filipe.cursojava.poo.aula36_relacionamento.labs.ex01;

public class Agenda {

    private String NomeAgenda;
    private ContatoAgenda[] contatos;
    private int operacao;

    public String getNomeAgenda() {
        return NomeAgenda;
    }

    public void setNomeAgenda(String nomeAgenda) {
        NomeAgenda = nomeAgenda;
    }

    public ContatoAgenda[] getContatos() {
        return contatos;
    }

    public void setContatos(ContatoAgenda[] contatos) {
        this.contatos = contatos;
    }

    public int getOperacao() {
        return operacao;
    }

    public void setOperacao(int operacao) {
        this.operacao = operacao;
    }

    void exibirContatos() {
        System.out.println("*** Agenda " + getNomeAgenda() + " ***");
        if (getContatos() != null) {
            for (int i = 1; i < getContatos().length; i++) {
                if (getContatos()[i] != null) {
                    System.out.print((i) + " - ");
                    System.out.print(getContatos()[i].getNome());
                    System.out.println();
                } else {
                    break;
                }
            }
        } else {
            System.out.println("Não há contatos cadastrados.");
        }
    }

    void exibirInfoContatos() {
        if (getContatos()[getOperacao()] != null) {
            System.out.println("*** Agenda "+ getNomeAgenda()+" ***");
            System.out.println("Nome = " + getContatos()[getOperacao()].getNome());
            System.out.println("Numero telefone = " + getContatos()[getOperacao()].getTelefone());
            System.out.println("E-mail = " + getContatos()[getOperacao()].getEmail());
            System.out.println();
        } else {
            System.out.println("*** Contato não cadastrado ***");
        }
    }
}