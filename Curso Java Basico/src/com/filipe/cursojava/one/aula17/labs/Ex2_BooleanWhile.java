package com.filipe.cursojava.one.aula17.labs;

import java.util.Scanner;

//Faça um programa que leia um nome de usuário e a sua senha e não
//aceite a senha igual ao nome do usuário, mostrando uma mensagem
//de erro e voltando a pedir as informações.
public class Ex2_BooleanWhile {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String user;
        String senha;
        boolean infoValida = false;

        do {
            System.out.print("Insira um nome de usuário : ");
            user = scan.next();

            System.out.print("Insira uma senha : ");
            senha = scan.next();

            if (user.equalsIgnoreCase(senha)) {
                System.out.println("!!!! Usuario igual ao senha, insira novamente. !!!!\n");
            } else {
                System.out.println("***Usuario e senha definido com sucesso!***");
                infoValida = true;
            }
        } while (!infoValida);
    }
}
