package aula15.exercicios;

import java.util.Scanner;

//Faça um Programa para um caixa eletrônico.
// O programa deverá perguntar ao usuário a valor do saque e depois informar quantas notas
//de cada valor serão fornecidas. As notas disponíveis serão as de 1, 5,
//10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de 600 reais.
// O programa não deve se preocupar com a quantidade de notas existentes na máquina.
//Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100,
// uma nota de 50, uma nota de 5 e uma nota de 1;
//Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma nota de 50,
//quatro notas de 10, uma nota de 5 e quatro notas de 1.
public class Ex21 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira qual o valor deseja sacar (entre 10 e 600): ");
        int valor = scan.nextInt();

        if ((valor >= 10) && (valor <= 600)) {

            int cem = valor / 100;
            valor = valor - (cem * 100);

            int cinquenta = valor / 50;
            valor = valor - (cinquenta * 50);

            int dez = valor / 10;
            valor = valor - (dez * 10);

            int cinco = valor / 5;
            valor = valor - (cinco * 5);

            int um = valor;

            if (cem > 0) {
                System.out.println(cem + " nota(s) de cem.");
            }

            if (cinquenta > 0) {
                System.out.println(cinquenta + " nota(s) de cinquenta.");
            }

            if (dez > 0) {
                System.out.println(dez + " nota(s) de dez");
            }

            if (cinco > 0) {
                System.out.println(cinco + "nota(s) de cinco");
            }

            if (um > 0) {
                System.out.println(um + " nota(s) de um");
            }
        } else System.out.println("Valor invalido foi inserido.");
    }
}
