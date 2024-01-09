package com.filipe.cursojava.one.aula17;

public class LoopFor {
    public static void main(String[] args) {

        //for (inicialização;condição;atualização){
          //  bloco codigo
       // }


        //FORMA NORMAL
        for (int i = 0; i < 5 ; i++) {
            System.out.println("i tem valor: " + i);
        }
        for (int i = 5; i >= 0 ; i--) {
            System.out.println("i tem valor: " + i);
        }

        //FORMA MAIS COMPLEXA E COMPLETA
        for (int i = 0 , j = 10;i < j;i++,j--){
            System.out.println("i = " + i + "  j = " + j);
        }


        int count = 0;
        for ( ;count < 10 ; ){
            System.out.println("Valor de count : " + count);
            count += 2;
        } //SEMPRE USAR CHAVES

        int soma = 0;
        for (int i=1; i < 5 ;soma += i++);
        System.out.println("O valor da soma é " + soma);

    }
}
