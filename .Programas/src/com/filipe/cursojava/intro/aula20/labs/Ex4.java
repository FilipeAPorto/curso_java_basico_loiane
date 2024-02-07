package com.filipe.cursojava.intro.aula20.labs;

import java.util.Scanner;

/*Faça um programa para armazenar em uma matriz os compromissos de uma agenda pessoal.
Cada dia do mês deve conter 24 horas, onde para cada uma destas 24 horas podemos associar uma tarefa
específica (compromisso agendado). O programa deve ter um menu onde o usuário indica o dia do mês
que deseja alterar e a hora, entrando em seguida com o compromisso, ou então, o usuário pode também consultar a
agenda, fornecendo o dia e a hora para obter o compromisso armazenado.*/
public class Ex4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int opcao, dia, hora;
        boolean sair = false;

        String[][] agendaPessoal = new String[31][24];

        while (!sair) { // verificação de valor válido.
            System.out.println("***** AGENDA PESSOAL *****");
            System.out.println("*1 - Agendar compromissos");
            System.out.println("*2 - Consultar compromissos");
            System.out.println("*0 - Finalizar programa");
            System.out.print("Digite :");
            opcao = scan.nextInt();

            if (opcao == 1) { //adicionar compromisso.

                //Solicitação do dia - Verificação de valor válido de 1 até 31.
                do {
                    System.out.print("Qual dia você gostaria de agendar o compromisso ? :");
                    dia = scan.nextInt();


                    if (dia <= 0 || dia > 31) {
                        System.out.println("\n*** ERRO - INSIRA UMA DATA VÁLIDA ***\n");
                    }
                } while (dia <= 0 || dia > 31);

                //Solicitação da hora - Verificação de valor válido de 0 até 24
                do {
                    System.out.print("Qual o horário você gostaria de agendar o compromisso ? :");
                    hora = scan.nextInt();

                    if (hora == 24) {
                        System.out.println("\n*** ERRO - Para inserir compromisso no horário 24, insira no horário 0(Zero) ***\n");
                    }
                    if (hora < 0 || hora > 24) {
                        System.out.println("\n*** ERRO - INSIRA UM HORÁRIO VÁLIDO ***\n");
                    }
                } while (hora < 0 || hora >= 24);

                scan.nextLine(); // Para tirar o "bug" do proximo nextLine (Compromisso).

                dia--; // Para adicionar a data no array correto, pois o array começa com 0 e dia começa com 1.

                //solicitação da informação.
                System.out.print("Digite a informação :");
                agendaPessoal[dia][hora] = scan.nextLine();

                System.out.println("\n ** AGENDADO **\n" + "Dia " + (dia + 1) + " às " + hora + " Horas");
                System.out.println("Compromisso : " + agendaPessoal[dia][hora] + "\n");

            } else if (opcao == 2) { //Verificar compromisso.

                //Solicitação do dia - Verificação de valor válido de 1 até 31.
                do {
                    System.out.print("Qual dia gostaria de consultar ? :");
                    dia = scan.nextInt();

                    if (dia <= 0 || dia > 31) {
                        System.out.println("\n*** ERRO - INSIRA UMA DATA VÁLIDA ***\n");
                    }
                } while (dia <= 0 || dia > 31);

                //Solicitação da hora - Verificação de valor válido de 0 até 24
                do {
                    System.out.print("Qual o horário você gostaria de agendar o compromisso ? :");
                    hora = scan.nextInt();
                    if (hora < 0 || hora > 24) {
                        System.out.println("\n*** ERRO - INSIRA UM HORÁRIO VÁLIDO ***\n");
                    }
                } while (hora < 0 || hora > 24);

                dia--; // Para verificar a data no array correto, pois o array começa com 0 e dia começa com 1.

                System.out.println("\nA informação é " + agendaPessoal[dia][hora] + "\n");

            } else if (opcao == 0) {
                sair = true;
            } else {
                System.out.println("\n*** ERRO - INSIRA O VALOR VÁLIDO ***\n");
            }
        }
    }
}
