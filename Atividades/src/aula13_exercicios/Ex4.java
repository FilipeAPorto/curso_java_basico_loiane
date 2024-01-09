package aula13_exercicios;

import java.util.Scanner;

//Faça um Programa que peça as 4 notas bimestrais e mostre a média.
public class Ex4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Vamos inserir as notas bimestrais do aluno.");
        System.out.println("Insira a nota do 1º Bimestre");
        double bimestre1 = scan.nextDouble();

        System.out.println("Insira a nota do 2º Bimestre");
        double bimestre2 = scan.nextDouble();

        System.out.println("Insira a nota do 3º Bimestre");
        double bimestre3 = scan.nextDouble();

        System.out.println("Insira a nota do 4º Bimestre");
        double bimestre4 = scan.nextDouble();

        double media = (bimestre1+bimestre2+bimestre3+bimestre4) / 4;

        System.out.println("A média de notas do aluno é : " + media);


    }

}
