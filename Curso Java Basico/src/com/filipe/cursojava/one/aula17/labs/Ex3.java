package com.filipe.cursojava.one.aula17.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

//Faça um programa que leia e valide as seguintes informações:
//a. Nome: maior que 3 caracteres;
//b. Idade: entre 0 e 150;
//c. Salário: maior que zero;
//d. Sexo: 'f' ou 'm';
//e. Estado Civil: 's', 'c', 'v', 'd';
public class Ex3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String formato = "R$#,##0.00";

        DecimalFormat df = new DecimalFormat(formato);

        String nome ;
        int idade ;
        double salario;
        String sexo;
        String estadoCivil;
        boolean infoValida = false;

        do{
            System.out.print("Insira seu nome : ");
            nome = scan.next();
            if(nome.length() >= 3) {
                infoValida = true;

            }else {
                System.out.println("!!! ERRO - Necessário 3 caracteres !!!");
            }
        } while(!infoValida);

        infoValida = false;


        do {
            System.out.print("Insira sua idade : ");
            idade = scan.nextInt();
            if (idade > 0 && idade < 150){
                infoValida = true;

            } else  {
                System.out.println("!!! ERRO - Idade inserida é invalida !!!");
            }
        }while (!infoValida);

        do {
            System.out.println("Insira o seu salario : ");
            salario = scan.nextDouble();

            if (salario < 0 ){
                System.out.println("!!! ERRO - Valor de salário inserido é invalida !!!");
            }
        }while (salario < 0 );


        do {
            System.out.println("Insira qual é o seu sexo (M - Masculino e F - Feminino) :");
            sexo = scan.next();

            if (!sexo.equalsIgnoreCase("m") && (!sexo.equalsIgnoreCase("f"))) {
                System.out.println("!!! ERRO - Sexo invalido !!!");
            }
        }while(!sexo.equalsIgnoreCase("m") && (!sexo.equalsIgnoreCase("f")));


        do {
            System.out.println("Insira seu estado civil (S - Solteiro, C - Casado, D - Divorciado, V - Viuvo) :");
            estadoCivil = scan.next();

            if ((!estadoCivil.equalsIgnoreCase("S")) && (!estadoCivil.equalsIgnoreCase("C")) && (
                    !estadoCivil.equalsIgnoreCase("D")) && (!estadoCivil.equalsIgnoreCase("V"))){
                System.out.println("!!! ERRO - Insira um valor válido !!!");
            }
        }while ((!estadoCivil.equalsIgnoreCase("S")) &&
                (!estadoCivil.equalsIgnoreCase("C")) &&
                (!estadoCivil.equalsIgnoreCase("D")) &&
                (!estadoCivil.equalsIgnoreCase("V")));


        if (sexo.equalsIgnoreCase("m")){
            sexo = "masculino";
        } else {
            sexo = "feminino";
        }

        if (estadoCivil.equalsIgnoreCase("S")){
            estadoCivil = "solteiro";
        } else if (estadoCivil.equalsIgnoreCase("C")){
            estadoCivil = "casado";
        } else if (estadoCivil.equalsIgnoreCase("D")){
            estadoCivil = "divorciado";
        } else {
            estadoCivil = "viuvo";
        }

        System.out.println("As seguintes informações foram digitadas :");
        System.out.println("Seu nome é " + nome);
        System.out.println("Sua idade é " + idade + " anos");
        System.out.println("Seu salário é R$" + df.format(salario));
        System.out.println("Sua orientação sexual é " + sexo);
        System.out.println("Seu estado civil é " + estadoCivil);
    }
}
