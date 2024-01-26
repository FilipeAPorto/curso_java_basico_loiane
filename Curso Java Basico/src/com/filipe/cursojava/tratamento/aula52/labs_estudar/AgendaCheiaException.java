package com.filipe.cursojava.tratamento.aula52.labs_estudar;

public class AgendaCheiaException extends Exception {

    @Override
    public String getMessage() {
        return "Agenda já esta cheia";
    }
}
