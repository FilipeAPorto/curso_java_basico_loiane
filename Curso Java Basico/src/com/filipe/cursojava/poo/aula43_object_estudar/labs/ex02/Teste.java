package com.filipe.cursojava.poo.aula43_object_estudar.labs.ex02;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        int operacao1, operacao2, i = 0, j = 0;
        boolean sair = false;

        Scanner scan = new Scanner(System.in);

        PessoaFisica[] fisica = new PessoaFisica[500]; //ARRAY
        PessoaJuridica[] juridica = new PessoaJuridica[500]; //ARRAY

        System.out.println("\n$$$ BEM VINDO AO SISTEMA RECEITA FEDERAL $$$");

        while (!sair) {
            do {
                System.out.println("\nDigite o número correspondente");
                System.out.println("1 - Cadastrar contribuinte");
                System.out.println("2 - Exibir lista de contribuintes");
                System.out.println("0 - Sair do programa");
                operacao1 = scan.nextInt();

                if (operacao1 < 0 || operacao1 > 2) {
                    System.out.println("*** ERRO - INSIRA UM NÚMERO VÁLIDO ***");
                }
            } while (operacao1 < 0 || operacao1 > 2);

            if (operacao1 == 1) {
                while (!sair) {
                    do {
                        System.out.println("\nCadastrando Contribuinte");
                        System.out.println("1 - Pessoa Física");
                        System.out.println("2 - Pessoa Jurídica");
                        System.out.println("0 - Voltar");
                        operacao2 = scan.nextInt();

                        if (operacao2 < 0 || operacao2 > 2) {
                            System.out.println("*** ERRO - INSIRA UM NÚMERO VÁLIDO ***");
                        }
                    } while (operacao2 < 0 || operacao2 > 2);

                    if (operacao2 == 1) {
                        fisica[i] = new PessoaFisica(); // Instanciamento

                        System.out.print("Nome : ");
                        scan.nextLine(); // Tirar "BUG"
                        fisica[i].setNome(scan.nextLine());

                        System.out.print("Insira o valor da renda BRUTA : ");
                        fisica[i].setRendaBruta(scan.nextDouble());

                        fisica[i].calcularImposto();

                        i++;

                    } else if (operacao2 == 2) {

                        juridica[j] = new PessoaJuridica(); // Instanciamento

                        System.out.print("Nome : ");
                        scan.nextLine(); // Tirar "BUG"
                        juridica[j].setNome(scan.nextLine());

                        System.out.print("Insira o valor da renda BRUTA : ");
                        juridica[j].setRendaBruta(scan.nextDouble());

                        juridica[j].calcularImposto();

                        j++;

                    } else
                        sair = true;
                }
                sair = false;

            } else if (operacao1 == 2) {

                if (fisica[0] != null || juridica[0] != null) {

                    for (int k = 0; k < i; k++) {
                        System.out.println(fisica[k]);
                    }
                    for (int k = 0; k < j; k++) {
                        System.out.println(juridica[k]);
                    }
                } else {
                    System.out.println("Nenhum contribuinte cadastrado");
                }
            } else {
                sair = true;
            }
        }
    }
}