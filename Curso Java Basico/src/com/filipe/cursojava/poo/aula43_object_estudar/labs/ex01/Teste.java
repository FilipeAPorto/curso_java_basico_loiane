package com.filipe.cursojava.poo.aula43_object_estudar.labs.ex01;

import java.util.Random;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        boolean sair = false;
        int operacao1, operacao2;

        ContaPoupanca contaPoup = new ContaPoupanca();
        ContaEspecial contaEsp = new ContaEspecial();

        System.out.println("*** BEM VINDO AO BANCO SACO FURADO ***");

        System.out.println("\nVamos criar sua conta ");

        System.out.print("Insira seu nome : ");
        contaPoup.setNomeCliente(scan.nextLine());
        contaEsp.setNomeCliente(contaPoup.getNomeCliente());

        contaPoup.setNumConta(random.nextInt(800));
        contaEsp.setNumConta(random.nextInt(800));

        while (!sair) {
            do {
                System.out.println("\nQual conta gostaria de gerenciar");
                System.out.println("1 - Conta Poupança");
                System.out.println("2 - Conta Especial");
                System.out.print("Digite : ");
                operacao1 = scan.nextInt();
                if (operacao1 < 0 || operacao1 > 2) {
                    System.out.println("*** ERRO - INSIRA UM VALOR VÁLIDO ***");
                }
            } while (operacao1 < 0 || operacao1 > 2);


            if (operacao1 == 1) {
                while (!sair) {
                    do {
                        System.out.println("\nQual operação realizar");
                        System.out.println("1 - Saque");
                        System.out.println("2 - Depóstio");
                        System.out.println("3 - Mostrar saldo ");
                        System.out.println("4 - Mostrar dados do cliente");
                        System.out.println("0 - Voltar");
                        System.out.print("Digite : ");
                        operacao2 = scan.nextInt();

                        if (operacao2 < 0 || operacao2 > 4) {
                            System.out.println("*** ERRO - INSIRA UM VALOR VÁLIDO ***");
                        }

                    } while (operacao2 < 0 || operacao2 > 4);

                    if (operacao2 == 1) {
                        System.out.print("\nQual valor sacar : ");
                        contaPoup.sacar(scan.nextDouble());

                        contaPoup.calcularNovoSaldo();

                        contaPoup.exibirSaldo();

                    } else if (operacao2 == 2) {
                        System.out.print("\nQual valor depositar : ");
                        contaPoup.depositar(scan.nextDouble());

                        contaPoup.calcularNovoSaldo();


                        contaPoup.exibirSaldo();

                    } else if (operacao2 == 3) {
                        contaPoup.exibirSaldo();

                    } else if (operacao2 == 4) {
                        contaPoup.exibirDadosCliente();

                    } else {
                        break;
                    }
                }
            } else if (operacao1 == 2) {
                while (!sair) {

                    do {
                        System.out.println("\nQual operação realizar");
                        System.out.println("1 - Saque");
                        System.out.println("2 - Depóstio");
                        System.out.println("3 - Mostrar saldo ");
                        System.out.println("4 - Mostrar dados do cliente");
                        System.out.println("0 - Voltar");
                        System.out.print("Digite : ");
                        operacao2 = scan.nextInt();

                        if (operacao2 < 0 || operacao2 > 4) {
                            System.out.println("*** ERRO - INSIRA UM VALOR VÁLIDO ***");
                        }
                    } while (operacao2 < 0 || operacao2 > 4);

                    if (operacao2 == 1) {
                        System.out.print("\nQual valor sacar : ");
                        contaEsp.sacar(scan.nextDouble());

                        contaEsp.exibirSaldo();

                    } else if (operacao2 == 2) {
                        System.out.print("\nQual valor depositar : ");
                        contaEsp.depositar(scan.nextDouble());

                        contaEsp.exibirSaldo();

                    } else if (operacao2 == 3) {
                        contaEsp.exibirSaldo();

                    } else if (operacao2 == 4) {
                        contaEsp.exibirDadosCliente();

                    } else {
                        break;
                    }
                }
            }
        }
    }
}