package aula15.exercicios;

import java.util.Scanner;

//Faça um Programa que leia um número inteiro menor que 1000 e
//imprima a quantidade de centenas, dezenas e unidades do mesmo.
//* Observando os termos no plural a colocação do "e", da vírgula
//entre outros. Exemplo:
//* 326 = 3 centenas, 2 dezenas e 6 unidades
//* 12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320,
//310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16
public class Ex19 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Insira um numero inteiro menor q 1000 : ");
        int numero = scan.nextInt();

        int centenas  = numero / 100;

    //O que sobrar depois que tiramos as centenas, são as dezenas
        int dezenas = (numero%100) / 10;

    //O que sobrar depois que tiramos as centenas e dezenas são as unidades
        int unidades = ((numero%100)%10);

        if (numero >= 1000){
            System.out.println("Erro! Número acima de 1000 foi inserido!");
        } else if (centenas<= 1){
            if(dezenas <= 1){
                if(unidades <=1){
                    System.out.println(centenas + " centena, " + dezenas + " dezena e " + unidades + " unidade.");
                } else System.out.println(centenas + " centena, " + dezenas + " dezena e " + unidades + " unidades.");
            } else System.out.println(centenas + " centena, " + dezenas + " dezenas e " + unidades + " unidades.");
        } else System.out.println(centenas + " centenas, " + dezenas + " dezenas e " + unidades + " unidades.");
    }
}
