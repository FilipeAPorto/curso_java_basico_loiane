package com.filipe.cursojava.one.aula20.labs;

/*Modifique o programa anterior de maneira a guardar os compromissos de tod-o o ano, organizados por mês, dia e hora
(só 8 horas por dia).*/

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int opcao, mes, dia, hora;
        int horaInicio = 9;
        boolean sair = false;

        String[][][] agendaPessoal = new String[12][31][8];

        while (!sair) { // verificação de valor válido.
            System.out.println("***** AGENDA PESSOAL *****");
            System.out.println("1 - Agendar compromissos");
            System.out.println("2 - Consultar compromissos");
            System.out.println("0 - Finalizar programa");
            System.out.print("Digite :");
            opcao = scan.nextInt();

            if (opcao == 1) { //adicionar compromisso.

                //Solicitação do mês - Verificação de valor válido de 1 até 12.
                do {
                    System.out.print("\nQual MÊS você gostaria de agendar o compromisso ? :");
                    mes = scan.nextInt();

                    if (mes <= 0 || mes > 12) {
                        System.out.println("\n*** ERRO - INSIRA UM MÊS VÁLIDO ***");
                    }
                } while (mes <= 0 || mes > 12);


                //Solicitação do dia - Verificação de valor válido de 1 até 31.
                do {
                    System.out.print("\nQual DIA você gostaria de agendar o compromisso ? :");
                    dia = scan.nextInt();


                    if (dia <= 0 || dia > 31) {
                        System.out.println("\n*** ERRO - INSIRA UM DIA VÁLIDO ***");
                    }
                } while (dia <= 0 || dia > 31);


                //Solicitação da hora - Verificação de valor válido de 9 até 16.
                do {
                    System.out.print("\nQual o horário das 9 às 16 horas você gostaria de agendar o compromisso ? :");
                    hora = scan.nextInt();

                    if (hora < 9 || hora > 16) {
                        System.out.println("\n*** ERRO - INSIRA UM HORÁRIO VÁLIDO ***");
                    }
                } while (hora < 9 || hora > 16);

                scan.nextLine(); // Para tirar o "bug" do proximo nextLine (Compromisso).

                mes--; // Para adicionar a mês no array correto, pois o array começa com 0 e mês começa com 1.
                dia--; // Para adicionar o dia no array correto, pois o array começa com 0 e dia começa com 1.
                hora = hora - horaInicio; // Para adicionar a hora de abertura no array correto.


                //solicitação da informação.
                System.out.print("\nDigite a informação :");
                agendaPessoal[mes][dia][hora] = scan.nextLine();

                System.out.println("\n ** AGENDADO **\n" + "Dia " + (dia + 1) + "/" + (mes + 1) + "/24 às " + (hora + horaInicio) + " Horas");
                System.out.println("Compromisso : " + agendaPessoal[mes][dia][hora] + "\n");

            } else if (opcao == 2) { //Verificar compromisso.

                do {
                    System.out.println("Qual mês gostaria de consultar ? :");
                    mes = scan.nextInt();

                    if (mes <= 0 || mes > 12) {
                        System.out.println("\n*** ERRO - INSIRA UM MÊS VÁLIDO ***\n");
                    }
                } while (mes <= 0 || mes > 12);

                //Solicitação do dia - Verificação de valor válido de 1 até 31.
                do {
                    System.out.print("Qual dia gostaria de consultar ? :");
                    dia = scan.nextInt();

                    if (dia <= 0 || dia > 31) {
                        System.out.println("\n*** ERRO - INSIRA UM DIA VÁLIDO ***\n");
                    }
                } while (dia <= 0 || dia > 31);

                //Solicitação da hora - Verificação de valor válido de 0 até 24
                do {
                    System.out.print("Qual o horário você gostaria de agendar o compromisso ? :");
                    hora = scan.nextInt();
                    if (hora < 9 || hora > 16) {
                        System.out.println("\n*** ERRO - INSIRA UM HORÁRIO VÁLIDO ***");
                    }
                } while (hora < 9 || hora > 16);

                mes--; // Para adicionar a mês no array correto, pois o array começa com 0 e mês começa com 1.
                dia--; // Para adicionar o dia no array correto, pois o array começa com 0 e dia começa com 1.
                hora = hora - horaInicio; // Para adicionar a hora de abertura no array correto.

                System.out.println("\nA informação é " + agendaPessoal[mes][dia][hora] + "\n");

            } else if (opcao == 0) {
                sair = true;

            } else {
                System.out.println("\n*** ERRO - INSIRA O VALOR VÁLIDO ***\n");
            }
        }
    }
}

