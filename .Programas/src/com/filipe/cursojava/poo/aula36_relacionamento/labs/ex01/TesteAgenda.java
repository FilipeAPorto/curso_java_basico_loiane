package com.filipe.cursojava.poo.aula36_relacionamento.labs.ex01;

import java.util.Scanner;

public class TesteAgenda {
    public static void main(String[] args) {

        boolean sair = false;
        int operacao, j = 1;

        Scanner scan = new Scanner(System.in);

        Agenda agenda = new Agenda(); //Estanciando a classe Agenda

        ContatoAgenda[] cont = new ContatoAgenda[500]; //Novo Array

        System.out.print("Insira um nome pra sua agenda : ");
        agenda.setNomeAgenda(scan.nextLine());

        while (!sair) {

            do {

                System.out.println("\n1 - Criar novo contato");
                System.out.println("2 - Consultar contatos cadastrados");
                System.out.println("0 - Sair");
                operacao = scan.nextInt();

                if (operacao < 0 || operacao > 2){
                    System.out.println("*** ERRO - DIGITE UMA OPÇÃO VÁLIDA ***");
                }
            }while (operacao < 0 || operacao > 2);

            scan.nextLine();

            if (operacao == 1) {
                cont[j] = new ContatoAgenda(); // Estanciando a classe ContatoAgenda, 1 pra cada novo contato.

                agenda.setContatos(cont); //Settando a estancia cont(ContatoAgenda) dentro da classe agenda.

                System.out.print("Insira o nome do contato : ");
                cont[j].setNome(scan.nextLine());

                System.out.print("Insira o numero de telefone do contato " + agenda.getContatos()[j].getNome() + " :");
                cont[j].setTelefone(scan.nextLine());

                System.out.print("Insira o email do contato " + agenda.getContatos()[j].getNome() + " : ");
                cont[j].setEmail(scan.nextLine());

                System.out.println(agenda.getContatos()[j].getNome());

                j++;

            } else if (operacao == 2) {
                agenda.exibirContatos();

                if (agenda.getContatos() != null) {

                    System.out.print("\nGostaria de verificar informações de qual contato ? (Digite o numero respectivo do contato ou" +
                            " digite 0 para retornar.) : ");
                    agenda.setOperacao(scan.nextInt());

                    if (agenda.getOperacao() == 0) {

                    }else {
                        agenda.exibirInfoContatos();
                    }
                }
            } else if (operacao == 0) {
                sair = true;
            }
        }
    }
}