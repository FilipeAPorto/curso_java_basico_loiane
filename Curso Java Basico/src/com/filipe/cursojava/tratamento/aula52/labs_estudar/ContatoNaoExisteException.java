package com.filipe.cursojava.tratamento.aula52.labs_estudar;

public class ContatoNaoExisteException extends Exception {

    private String nomeContato;

    public ContatoNaoExisteException(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public String getMessage() {
        return "Contato " + nomeContato + " não existe na agenda!\n";
    }
}
