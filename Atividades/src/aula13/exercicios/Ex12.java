package aula13.exercicios;

import java.util.Scanner;

//Tendo como dados de entrada a altura de uma pessoa, construa um
//algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
//(72.7*altura) - 58

public class Ex12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Vamos calcular seu peso ideal : \nInsira sua altura em metros : ");
        float altura = scan.nextFloat();

        float pesoIdeal = (72.7f*altura) - 58f;

        System.out.println("Seu pesso ideal é : " + pesoIdeal + "Kg");


    }


}
