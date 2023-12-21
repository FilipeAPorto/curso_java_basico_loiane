package com.filipe.cursojava.aula16;

public class Loop_While_DoWhile {
    public static void main(String[] args) {

        int i = 1; //count ou cont
        int max = 10;

        System.out.println("Contando até "+ max);

        while (i <= max){
            System.out.println("valor de i é " + i);
            i++; //i = i+1; ou i +=1;
        }

        System.out.println(i); //valor de 11

        do {
            i++;
            System.out.println("valor de i é " + i);
        } while (i < 15); // Até o valor de while ser falso.

        System.out.println(i);
    }
}
