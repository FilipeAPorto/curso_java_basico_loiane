package aula17_exercicios;

import java.util.Scanner;

/*Faça um programa que peça para n pessoas a sua idade, ao final o
programa devera verificar se a média de idade da turma varia entre 0 e
25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta
ou idosa, conforme a média calculada.*/
public class Ex25_Loiane_Ex20 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int qtdPessoa,idade;
        double media,total=0;

        do {
            System.out.print("Insira a quantidade de pessoas da turma : ");
            qtdPessoa = scan.nextInt();

            if (qtdPessoa <= 1){
                System.out.println("** ERRO - Valor invalido inserido **\n");
            }

        }while (qtdPessoa <= 1);

        media = qtdPessoa;

        for (int i=1;i <= qtdPessoa;i++){
            do {
                System.out.print("Insira a "+i+"ª idade : ");
                idade = scan.nextInt();

                if(idade < 0 ){
                    System.out.println("** ERRO - Valor invalido inserido **");
                }

                total += idade;

            }while (idade < 0);
        }

        total = total/media;


        if ((total >= 0 ) && (total <= 25)){

            System.out.println("Media de idade da turma é "+total +"\nA turma é Jovem !");

        }else if ((total >=26) && (total <=60)){

            System.out.println("Media de idade da turma é "+total +"\nA turma é adulta !");
        } else
            System.out.println("Media de idade da turma é "+total +"\nA turma é Idosa !");
    }
}
