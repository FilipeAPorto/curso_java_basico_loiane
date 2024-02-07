package com.filipe.cursojava.intro.aula17.labs;

import java.util.Scanner;

//Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
//qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
//numero ele deseja ver a tabuada. A saída deve ser conforme o
//exemplo abaixo:
//* Tabuada de 5:
//* 5 X 1 = 5
//* 5 X 2 = 10
//* ...
//* 5 X 10 = 50
public class Ex12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada de qual numero você gostaria (entre 1 e 10) : ");
        int num = scan.nextInt();

        int multiplicador = 1;

        System.out.println("Tabuada do " + num);

        for ( ;multiplicador <= 10;multiplicador++){

            System.out.println(num + " x " + multiplicador + " = " + num*multiplicador);
        }
    }
}
