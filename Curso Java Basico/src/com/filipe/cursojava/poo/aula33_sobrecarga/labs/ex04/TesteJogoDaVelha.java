package com.filipe.cursojava.poo.aula33_sobrecarga.labs.ex04;

import java.util.Scanner;

public class TesteJogoDaVelha {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        JogoDaVelha jogo = new JogoDaVelha();


        System.out.println("*** INICIANDO JOGO DA VELHA ***");
        System.out.println("Jogador 1 - X"); // impar
        System.out.println("Jogador 2 - O"); //par

        while (!jogo.isGanhou()) {

            jogo.verificarSinalJogo();

            do {
                System.out.print("Entre com a linha (1, 2 ou 3) :");
                jogo.setLinha(scan.nextInt());

                jogo.verificarLinhaValida(jogo.getLinha());

            } while (!jogo.isLinhaValida());


            do {
                System.out.print("Entre com a coluna (1, 2 ou 3) :");
                jogo.setColuna(scan.nextInt());

                jogo.verificarColunaValida(jogo.getColuna());

            } while (!jogo.isColunaValida());

            jogo.verificarJogadaValida();

            jogo.imprimirTabuleiro();

            jogo.imprimirVerificacaoGanhador();

        }
    }
}
