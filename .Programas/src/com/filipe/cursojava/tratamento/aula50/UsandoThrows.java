package com.filipe.cursojava.tratamento.aula50;

import java.util.Scanner;

public class UsandoThrows {

    public static void main(String[] args) {
        System.out.println("Entre com um número decimal");
        try {
            double num = leNumero();
            System.out.println("Você digitou "+ num);
        } catch (Exception e) {
            System.out.println("Entrada Inválida");
            e.printStackTrace();
        } //Mensagem de erro mais amigavel para usuário final, somente no log deixar o e.printStackTrace
    }

    public static double leNumero() throws Exception{
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        return num;
    }
}
