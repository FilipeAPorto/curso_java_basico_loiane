package com.filipe.cursojava.poo.aula35_recursividade;

public class MinhaCalculadora {

    private static int resultado, num;


    static int fatorialNaoRecursivo(int num1) {

        if (num1 == 0){
            return 1;
        }


        resultado = 1;

        for (int i=num1; i > 1; i--) {

             resultado  *= i;
        }

        return resultado;
    }

    //fotorial(5) = 5 * fatorial(4)
    //fotorial(4) = 4 * fatorial(3)
    //fotorial(3) = 3 * fatorial(2)
    //fotorial(2) = 2 * fatorial(1)
    //fotorial(1) = 1 * fatorial(0)
    //fotorial(0) = 1;
    public static int fatorial(int num){

        if (num == 0){
            return 1;
        }
        return num *(fatorial(num-1));
    }
}
