package com.filipe.cursojava.poo.aula34_var_met_estatic.labs.ex01;

public class TesteContador {

    static void imprimirInformacoes() {
        System.out.println(Contador.retornarContador());
    }

    public static void main(String[] args) {



        imprimirInformacoes();

        Contador.incrementarContador();

        imprimirInformacoes();

        Contador.zerarContador();

        imprimirInformacoes();

        Contador.incrementarContador();
        Contador.incrementarContador();
        Contador.incrementarContador();
        Contador.incrementarContador();
        Contador.incrementarContador();
        Contador.incrementarContador();

        imprimirInformacoes();

        Contador count = new Contador();

        imprimirInformacoes();

    }
}
