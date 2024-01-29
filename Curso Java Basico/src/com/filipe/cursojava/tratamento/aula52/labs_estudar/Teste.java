package com.filipe.cursojava.tratamento.aula52.labs_estudar;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) { // ID incorreto - ARRUMAR INFORMAÇÕES DE CONSULTA

        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();

        System.out.println("\n&&& Agenda Pessoal &&&");

        int opcao = 0;

        while (opcao != 3) {
            opcao = obterOpcaoMenu(scan);

            if (opcao == 1) { // Consultar Contato
                consultarContato(scan, agenda);
            } else if (opcao == 2) { // Adicionar contato
                adicionarContato(scan, agenda);
            }
        }
    }

    static void consultarContato(Scanner scan, Agenda agenda) {
        String nomecontato = lerInformacaoString(scan, "Entre com o nome do contato a ser pesquisado");
        try {
            if (agenda.consultaContatoPorNome(nomecontato) >= 0) {
                System.out.println("Contato existe");
            }
        } catch (ContatoNaoExisteException e) {
            System.out.println(e.getMessage());
        }
    }

    static void adicionarContato(Scanner scan, Agenda agenda) {
        System.out.println("Criando um contato , entre com as informações");
        String nome = lerInformacaoString(scan, "Entre com o nome do contato : ");
        String telefone = lerInformacaoString(scan, "Entre com o telefone do contato :");
        String email = lerInformacaoString(scan, "Entre com o email do contato :");

        Contato contato = new Contato();
        contato.setNome(nome);
        contato.setTelefone(telefone);
        contato.setEmail(email);

        System.out.println("Contato a Ser criado: ");
        System.out.println(contato);

        try {
            agenda.adicionarContato(contato);
        } catch (AgendaCheiaException e) {
            System.out.println(e.getMessage());

            System.out.println("Contatos da agenda");
            System.out.println(agenda);
        }

    }

    static String lerInformacaoString(Scanner scan, String msg) { // PASSO 2
        System.out.println(msg);
        String entrada = scan.nextLine();
        return entrada;
    }

    static int obterOpcaoMenu(Scanner scan) { // PASSO 1
        boolean entradaValida = false;
        int opcao = 0;

        while (!entradaValida) {
            System.out.println("1 - Consultar um contato da agenda");
            System.out.println("2 - Adicionar um contato da agenda");
            System.out.println("3 - Sair");
            System.out.print("Digite a opção desejada : ");

            try {
                String entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao == 1 || opcao == 2 || opcao == 3) {
                    entradaValida = true;
                } else {
                    throw new Exception("Entrada inválida");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente");
            }
        }
        return opcao;
    }
}


