package com.filipe.cursojava.intro.aula13.labs;

import java.util.Scanner;

public class Ex18 {

//Faça um programa que peça o tamanho de um arquivo para download
//(em MB) e a velocidade de um link de Internet (em Mbps), calcule e
//informe o tempo aproximado de download do arquivo usando este link
//(em minutos).

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o tamanho do arquivo em MB :");
        double arquivo = scan.nextDouble();

        System.out.println("Informe a velocidade do Link de internet (em Mbps" );
        double veloc = scan.nextDouble();

        double tempo = arquivo / (veloc/8);

        System.out.println("O arquivo será baixado em "+tempo+ "segundos.");


    }
}
