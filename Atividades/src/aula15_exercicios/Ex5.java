package aula15_exercicios;

import java.util.Scanner;

//Faça um programa para a leitura de duas notas parciais de um aluno.
//O programa deve calcular a média alcançada por aluno e apresentar:
//a -  A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
//b -  A mensagem "Reprovado", se a média for menor do que sete;
//c -  A mensagem "Aprovado com Distinção", se a média for igual a dez.
public class Ex5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a primeira nota do aluno :");
        double nota1 = scan.nextDouble();

        System.out.println("Insira a segunda nota do aluno : ");
        double nota2 = scan.nextDouble();

        double notaFinal = (nota1 + nota2)/2;

        if (notaFinal == 10){
            System.out.println("APROVADO COM DISTINÇÃO!");
        }else if(notaFinal >= 7){
            System.out.println("APROVADO!");
        } else {
            System.out.println("REPROVADO!");
        }
    }
}
