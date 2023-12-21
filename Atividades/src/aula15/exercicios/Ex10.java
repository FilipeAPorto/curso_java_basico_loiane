package aula15.exercicios;

import java.util.Scanner;

//Faça um Programa que pergunte em que turno você estuda. Peça
//para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
//mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
//Inválido!", conforme o caso.
public class Ex10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o valor corresponde ao seu turno\nM-Matutino ,V-Vespertino ou N-Noturno : ");
        String turno = scan.next();

        if (turno.equalsIgnoreCase("M")){
            System.out.println("Bom Dia!");

        } else if (turno.equalsIgnoreCase("V")){
            System.out.println("Boa Tarde!");

        } else if (turno.equalsIgnoreCase("N")){
            System.out.println("Boa Noite!");
        } else System.out.println("Valor Invalido!");
    }
}
