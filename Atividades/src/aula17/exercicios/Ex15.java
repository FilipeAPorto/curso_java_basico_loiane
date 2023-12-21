package aula17.exercicios;

import java.util.Scanner;

/*A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,...
Faça um programa capaz de gerar a série até o n−ésimo termo. Fn = F(n-1) + F(n-2).*/
public class Ex15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira quantos intervalos você precisa da sequência de Fibonacci : ");
        int n = scan.nextInt();

        int num1 = 1;
        int i = 1;
        int num2 = 0;

        for (;i < n;i++){

             num1 = num1 + num2;

             num2 = num1 - num2 ;

            System.out.print(num1 + " - ");
        }
        //System.out.println("Após "+n+" numeros o valor de Fibonacci ficou assim "+num1);
    }
}
