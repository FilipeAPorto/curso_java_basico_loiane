package com.filipe.cursojava.poo.aula33_sobrecarga.labs.ex04;

/*Reescreva o exercício 6 da aula 20 (Jogo da Velha). Desenvolva uma classe para representar o Jogo da Velha. Desenvolva
uma classe para testar o Jogo.*/
public class JogoDaVelha {

    private char[][] jogoDaVelha;
    private boolean ganhou = false, linhaValida, colunaValida;
    private char sinal;
    private int linha = 0, coluna = 0, jogada = 1;

    public JogoDaVelha() {
        jogoDaVelha = new char[3][3];
    }

    public JogoDaVelha(char[][] jogoDaVelha, boolean ganhou, boolean linhaValida,
                       boolean colunaValida, char sinal, int linha, int coluna, int jogada) {
        this.jogoDaVelha = new char[3][3];
        this.ganhou = ganhou;
        this.linhaValida = linhaValida;
        this.colunaValida = colunaValida;
        this.sinal = sinal;
        this.linha = linha;
        this.coluna = coluna;
        this.jogada = jogada;
    }

    public char[][] getJogoDaVelha() {
        return jogoDaVelha;
    }

    public void setJogoDaVelha(char[][] jogoDaVelha) {
        this.jogoDaVelha = jogoDaVelha;
    }

    public boolean isGanhou() {
        return ganhou;
    }

    public void setGanhou(boolean ganhou) {
        this.ganhou = ganhou;
    }

    public boolean isLinhaValida() {
        return linhaValida;
    }

    public void setLinhaValida(boolean linhaValida) {
        this.linhaValida = linhaValida;
    }

    public boolean isColunaValida() {
        return colunaValida;
    }

    public void setColunaValida(boolean colunaValida) {
        this.colunaValida = colunaValida;
    }

    public char getSinal() {
        return sinal;
    }

    public void setSinal(char sinal) {
        this.sinal = sinal;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public int getJogada() {
        return jogada;
    }

    public void setJogada(int jogada) {
        this.jogada = jogada;
    }


    public void verificarSinalJogo() {
        if (this.jogada % 2 != 0) {
            System.out.println("\nVez do jogador 1.");
            this.sinal = 'X';

        } else {
            System.out.println("\nVez do jogador 2.");
            this.sinal = 'O';
        }
    }

    public boolean verificarLinhaValida(int linhaInserida) {
        this.linhaValida = false;
        this.linha = linhaInserida;

        if (this.linha >= 1 && this.linha <= 3) {
            this.linhaValida = true;

        } else {
            System.out.println("\n*** ERRO - Linha inválida tente novamente ***\n");
        }
        return this.linhaValida;
    }


    public boolean verificarColunaValida(int colunaInserida) {
        this.colunaValida = false;
        this.coluna = colunaInserida;

        if (this.coluna >= 1 && this.coluna <= 3) {
            this.colunaValida = true;

        } else {
            System.out.println("\n*** ERRO - Coluna inválida tente novamente ***\n");
        }
        return this.colunaValida;
    }


    public void verificarJogadaValida() {
        this.linha--;
        this.coluna--;

        //Local ja Preenchido
        if (jogoDaVelha[linha][coluna] == 'X' || jogoDaVelha[this.linha][this.coluna] == 'O') {
            System.out.println("\n** Posição ja preenchida **\n");

        } else {
            // jogada válida
            this.jogoDaVelha[this.linha][this.coluna] = this.sinal;
            this.jogada++;
        }
    }


    public void imprimirTabuleiro() {
        for (int i = 0; i < this.jogoDaVelha.length; i++) {
            for (int j = 0; j < this.jogoDaVelha[i].length; j++) {

                System.out.print(this.jogoDaVelha[i][j] + " | ");
            }
            System.out.println();
        }
    }


    public void imprimirVerificacaoGanhador() {
        //Verificação de ganhador
        if ((jogoDaVelha[0][0] == 'X' && jogoDaVelha[0][1] == 'X' && jogoDaVelha[0][2] == 'X') || //linha 1
                (jogoDaVelha[1][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[1][2] == 'X') || // linha 2
                (jogoDaVelha[2][0] == 'X' && jogoDaVelha[2][1] == 'X' && jogoDaVelha[2][2] == 'X') || // linha 3
                (jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][0] == 'X' && jogoDaVelha[2][0] == 'X') || // coluna 1
                (jogoDaVelha[0][1] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][1] == 'X') || // coluna 2
                (jogoDaVelha[0][2] == 'X' && jogoDaVelha[1][2] == 'X' && jogoDaVelha[2][2] == 'X') ||  //coluna 3
                (jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][2] == 'X') ||   // diagonal
                (jogoDaVelha[0][2] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][0] == 'X')) {  // diagonal inversa

            ganhou = true;
            System.out.println("!!! PARABÉNS - JOGADOR 1 GANHOU !!!");

        } else if ((jogoDaVelha[0][0] == 'O' && jogoDaVelha[0][1] == 'O' && jogoDaVelha[0][2] == 'O') || //linha 1
                (jogoDaVelha[1][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[1][2] == 'O') || // linha 2
                (jogoDaVelha[2][0] == 'O' && jogoDaVelha[2][1] == 'O' && jogoDaVelha[2][2] == 'O') || // linha 3
                (jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][0] == 'O' && jogoDaVelha[2][0] == 'O') || // coluna 1
                (jogoDaVelha[0][1] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][1] == 'O') || // coluna 2
                (jogoDaVelha[0][2] == 'O' && jogoDaVelha[1][2] == 'O' && jogoDaVelha[2][2] == 'O') ||  //coluna 3
                (jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][2] == 'O') ||   // diagonal
                (jogoDaVelha[0][2] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][0] == 'O')) {  // diagonal inversa

            ganhou = true;
            System.out.println("!!! PARABÉNS - JOGADOR 2 GANHOU !!!");

        } else if (jogada > 9) {
            ganhou = true;
            System.out.println("Ninguêm ganhou a partida.");
        }
    }
}
