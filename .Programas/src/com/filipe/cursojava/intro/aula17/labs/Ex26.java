package com.filipe.cursojava.intro.aula17.labs;

import java.util.Scanner;

/*Numa eleição existem três candidatos. Faça um programa que peça o
número total de eleitores. Peça para cada eleitor votar e ao final
mostrar o número de votos de cada candidato.*/
public class Ex26 {
    public static void main(String[] args) {

        int qtdEleitores,voto,cand1=0,cand2=0,cand3=0;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Insira a quantidade de total de eleitores :");
            qtdEleitores = scan.nextInt();

            if (qtdEleitores < 1 ){
                System.out.println("Quantidade de eleitores insuficientes ");
            }

        } while (qtdEleitores < 1 );

        for (int i=1;i<=qtdEleitores;i++){

            do {
                System.out.println("\nEleitor numero " + i + " vote no seu candidato.\n");

                System.out.println("Candidato 1 - Rouba e não faz nada - aperte 13");
                System.out.println("Candidato 2 - fala merda mas faz - aperte 22");
                System.out.println("Candidato 3 - Rouba mais faz - Aperte 25");
                System.out.print("Aperte o numero correspondente : ");
                voto = scan.nextInt();

                if ((voto != 25) && (voto != 13) && (voto != 22)){
                    System.out.println("\n***Numero de Candidato invalido - insira o número correto***");
                }

                if (voto == 13){
                    cand1++;
                } else if (voto == 22){
                    cand2++;
                } else if (voto == 25){
                    cand3++;
                }

            } while ((voto != 25) && (voto != 13) && (voto != 22));

            System.out.println("O candidato 1 teve " + cand1 + " votos");
            System.out.println("O candidato 2 teve " + cand2 + " votos");
            System.out.println("O candidato 3 teve " + cand3 + " votos");
        }

    }
}
