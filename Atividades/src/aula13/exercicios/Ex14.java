package aula13.exercicios;

import java.util.Scanner;

//João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento
// diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido
//pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00
// por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes)
// e verifique se há excesso. Se houver, gravar na variável excesso e na variável multa o valor da multa que
// João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.
public class Ex14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o peso em kG de peixe : ");
        double pesoPeixe = scan.nextDouble();

        double pesoLimite = 50;

        if (pesoPeixe <= pesoLimite){
            System.out.println("Dentro do limite maximo permitido !");
        } else {
            double pesoAcima = pesoPeixe - pesoLimite;
            double multa = pesoAcima * 4;

            System.out.println("Acima do limite maximo permitido");
            System.out.println("Peso acima é de : " + pesoAcima + " kG");
            System.out.println("Valor da multa é R$" + multa);
        }
    }
}
