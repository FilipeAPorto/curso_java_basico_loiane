package com.filipe.cursojava.poo.aula35_recursividade;

public class TesteCalculadora {

    public static void main(String[] args) {

        int fatorialNR = MinhaCalculadora.fatorialNaoRecursivo(5);

        System.out.println(fatorialNR);

        int fatorialR = MinhaCalculadora.fatorial(5);

        System.out.println(fatorialR);
    }
}
