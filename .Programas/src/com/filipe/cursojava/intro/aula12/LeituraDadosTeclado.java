package com.filipe.cursojava.intro.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*System.out.println("Digite seu nome completo : ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é: " + nomeCompleto);

        System.out.println("Digite seu primeiro nome");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome);

        System.out.println("Digite a sua idade:" );
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " + idade + " anos");

        System.out.println("Digite a sua altura:" );
        double altura = scan.nextDouble();
        System.out.println("Sua altura é : " + altura + " cm");*/


        System.out.println("Digite as seguintes informações : Seu primeiro nome," +
                " sua idade, quantidade de filhos, altura, tem animais de estimação");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        float altura = scan.nextFloat();
        boolean temPet = scan.nextBoolean();

        System.out.println("Você digitou as seguintes informações : ");
        System.out.println("Seu primeiro nome " + primeiroNome);
        System.out.println("Sua idade " + idade);
        System.out.println("Quantidade de filhos " + qtdFilhos);
        System.out.println("Sua altura " + altura);
        System.out.println("Tem animais de Estimação " + temPet);

    }


}
