package com.filipe.cursojava.poo.aula25_26_27_metodo.labs.ex4;

import java.util.Scanner;

public class TesteJogoDaVelha {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        JogoDaVelha jogo = new JogoDaVelha();


        System.out.println("*** INICIANDO JOGO DA VELHA ***");

        System.out.println("Jogador 1 - X"); // impar
        System.out.println("Jogador 2 - O"); //par

        while (!jogo.ganhou) {

            jogo.verificarSinalJogo();

            do {
                System.out.print("Entre com a linha (1, 2 ou 3) :");
                jogo.linha = scan.nextInt();

                jogo.verificarLinhaValida(jogo.linha);

            } while (!jogo.linhaValida);


            do {
                System.out.print("Entre com a coluna (1, 2 ou 3) :");
                jogo.coluna = scan.nextInt();

                jogo.verificarColunaValida(jogo.coluna);

            } while (!jogo.colunaValida);

            jogo.verificarJogadaValida();

            jogo.imprimirTabuleiro();

            jogo.imprimirVerificacaoGanhador();

        }
    }
}
