package com.filipe.cursojava.poo.aula34_var_met_estatic.labs.ex02;

import java.util.Scanner;

public class TesteMinhaCalculadora {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean sair = false;

        while (!sair) {
            System.out.println("Infome qual operação gostaria de realizar\n");

            do {
                System.out.println("1 - Soma");
                System.out.println("2 - Subtração");
                System.out.println("3 - Multiplicação");
                System.out.println("4 - Divisão");
                System.out.println("5 - Potenciação");
                System.out.println("0 - Sair");
                MinhaCalculadora.setOperador(scan.nextByte());

                if (MinhaCalculadora.getOperador() < 0 || MinhaCalculadora.getOperador() > 5) {
                    System.out.println("Insira uma opção válido");
                }

            } while (MinhaCalculadora.getOperador() < 0 || MinhaCalculadora.getOperador() > 5);


            if (MinhaCalculadora.getOperador() == 0) {
                System.out.println("!!! Desligando calculadora !!!");
                break;
            }

            System.out.print("Insira 1º numero :");
            MinhaCalculadora.setNum1(scan.nextDouble());

            System.out.print("Insira 2º numero :");
            MinhaCalculadora.setNum2(scan.nextDouble());

            if (MinhaCalculadora.getOperador() == 1) {
                MinhaCalculadora.somar(MinhaCalculadora.getNum1(), MinhaCalculadora.getNum2());

                MinhaCalculadora.exibirResultado();

            } else if (MinhaCalculadora.getOperador() == 2) {
                MinhaCalculadora.subtrair(MinhaCalculadora.getNum1(), MinhaCalculadora.getNum2());

                MinhaCalculadora.exibirResultado();

            } else if (MinhaCalculadora.getOperador() == 3) {
                MinhaCalculadora.multiplicar(MinhaCalculadora.getNum1(), MinhaCalculadora.getNum2());

                MinhaCalculadora.exibirResultado();

            } else if (MinhaCalculadora.getOperador() == 4) {
                MinhaCalculadora.dividir(MinhaCalculadora.getNum1(), MinhaCalculadora.getNum2());

                MinhaCalculadora.exibirResultado();

            } else if (MinhaCalculadora.getOperador() == 5) {
                MinhaCalculadora.potencia(MinhaCalculadora.getNum1(), MinhaCalculadora.getNum2());

                MinhaCalculadora.exibirResultado();
            }
        }
    }
}