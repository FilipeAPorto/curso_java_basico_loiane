package com.filipe.cursojava.poo.aula33_sobrecarga.labs.ex02;

import java.util.Scanner;

public class TesteContaCorrente {
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();
        Scanner scan = new Scanner(System.in);

        conta.setSaldo(5);
        conta.setChequeEspecial(true);
        conta.setLimiteTotal(100);
        conta.setLimiteUsado(conta.getLimiteTotal());
        conta.setNomeBanco("BANCO SACO FURADO");

        conta.setNomeProprietario("Antonio Braga Brito");
        conta.setNumAgencia(0552);
        conta.setNumConta(05321450);

        boolean sair = false;
        int operacao;
        double valorSaque, valorDeposito;

        conta.exibirInformacoes();

        while (!sair) {
            do {
                System.out.println("Gostaria de realizar qual operação ?");
                System.out.println("1 - Consultar Saldo");
                System.out.println("2 - Sacar");
                System.out.println("3 - Depósito");
                System.out.println("4 - Consultar uso do Cheque Especial");
                System.out.println("0 - Finalizar operações");
                operacao = scan.nextInt();

                if (operacao < 0 || operacao > 4) {
                    System.out.println("\n*** ERRO - Operação inválida ***\n");
                }
            } while (operacao < 0 || operacao > 4);

            //Consulta saldo
            if (operacao == 1) {

                conta.consultarSaldo();


                //Saque
            } else if (operacao == 2) {

                do {
                    System.out.print("Qual valor gostaria de sacar ? :");
                    valorSaque = scan.nextDouble();
                    if (valorSaque <= 0) {
                        System.out.println("*** ERRO - Valor inválido para saque - Informe um valor positivo ***");
                    }
                } while (valorSaque <= 0);

                conta.sacar(valorSaque);

                //Depósito
            } else if (operacao == 3) {

                do {
                    System.out.print("Qual é o valor do depósito :");
                    valorDeposito = scan.nextDouble();

                    if (valorDeposito <= 0) {
                        System.out.println("*** ERRO - Valor inválido para depósito - Informe um valor positivo ***");
                    }
                } while (valorDeposito <= 0);

                conta.depositar(valorDeposito);


                //Verificar uso do cheque especial
            } else if (operacao == 4) {

                conta.verificarUsoChequeEspecial();

                //Sair
            } else {
                System.out.println("&&& O Banco Saco Furado Agradece a Preferência &&&");
                sair = true;
            }
        }
    }
}