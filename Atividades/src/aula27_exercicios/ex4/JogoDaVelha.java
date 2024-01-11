package aula27_exercicios.ex4;

/*Reescreva o exercício 6 da aula 20 (Jogo da Velha). Desenvolva uma classe para representar o Jogo da Velha. Desenvolva
uma classe para testar o Jogo.*/
public class JogoDaVelha {

    char[][] jogoDaVelha = new char[3][3];
    boolean ganhou = false, linhaValida = false, colunaValida = false;
    char sinal;
    int linha = 0, coluna = 0, jogada = 1;


    void verificarSinalJogo() {
        if (jogada % 2 != 0) {
            System.out.println("\nVez do jogador 1.");
            sinal = 'X';

        } else {
            System.out.println("\nVez do jogador 2.");
            sinal = 'O';
        }
    }

    boolean verificarLinhaValida(int linhaInserida) {
        linhaValida = false;
        linha = linhaInserida;

        if (linha >= 1 && linha <= 3) {

            linhaValida = true;
        } else {
            System.out.println("\n*** ERRO - Linha inválida tente novamente ***\n");
        }
        return linhaValida;
    }


    boolean verificarColunaValida(int colunaInserida) {
        colunaValida = false;
        coluna = colunaInserida;

        if (coluna >= 1 && coluna <= 3) {
            colunaValida = true;

        } else {
            System.out.println("\n*** ERRO - Coluna inválida tente novamente ***\n");
        }
        return colunaValida;
    }


    void verificarJogadaValida() {
        linha--;
        coluna--;

        //Local ja Preenchido
        if (jogoDaVelha[linha][coluna] == 'X' || jogoDaVelha[linha][coluna] == 'O') {
            System.out.println("\n** Posição ja preenchida **\n");

        } else {
            // jogada válida
            jogoDaVelha[linha][coluna] = sinal;
            jogada++;
        }
    }


    void imprimirTabuleiro() {
        for (int i = 0; i < jogoDaVelha.length; i++) {
            for (int j = 0; j < jogoDaVelha[i].length; j++) {

                System.out.print(jogoDaVelha[i][j] + " | ");
            }
            System.out.println();
        }
    }


    void imprimirVerificacaoGanhador() {
        //Verificação de ganhador
        if ((jogoDaVelha[0][0] == 'X' && jogoDaVelha[0][1] == 'X' && jogoDaVelha[0][2] == 'X') || //linha 1
                (jogoDaVelha[1][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[1][2] == 'X') || // linha 2
                (jogoDaVelha[2][0] == 'X' && jogoDaVelha[2][1] == 'X' && jogoDaVelha[2][2] == 'X') || // linha 3
                (jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][0] == 'X' && jogoDaVelha[2][0] == 'X') || // coluna 1
                (jogoDaVelha[0][1] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][1] == 'X') || // coluna 2
                (jogoDaVelha[0][2] == 'X' && jogoDaVelha[1][2] == 'X' && jogoDaVelha[2][2] == 'X') ||  //coluna 3
                (jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][2] == 'X')) {  // diagonal

            ganhou = true;
            System.out.println("!!! PARABÉNS - JOGADOR 1 GANHOU !!!");

        } else if ((jogoDaVelha[0][0] == 'O' && jogoDaVelha[0][1] == 'O' && jogoDaVelha[0][2] == 'O') || //linha 1
                (jogoDaVelha[1][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[1][2] == 'O') || // linha 2
                (jogoDaVelha[2][0] == 'O' && jogoDaVelha[2][1] == 'O' && jogoDaVelha[2][2] == 'O') || // linha 3
                (jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][0] == 'O' && jogoDaVelha[2][0] == 'O') || // coluna 1
                (jogoDaVelha[0][1] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][1] == 'O') || // coluna 2
                (jogoDaVelha[0][2] == 'O' && jogoDaVelha[1][2] == 'O' && jogoDaVelha[2][2] == 'O') ||  //coluna 3
                (jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][2] == 'O')) {  // diagonal)

            ganhou = true;
            System.out.println("!!! PARABÉNS - JOGADOR 2 GANHOU !!!");

        } else if (jogada > 9) {
            ganhou = true;
            System.out.println("Ninguêm ganhou a partida.");
        }
    }
}
