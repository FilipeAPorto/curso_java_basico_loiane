package com.filipe.cursojava.poo.aula34_var_met_estatic;

public class TesteCalculadora {

    static int resultSoma;


    public static void main(String[] args) {
        //MinhaCalculadora calc = new MinhaCalculadora();

        resultSoma = MinhaCalculadora.somar(1, 2);

        //calc.somar(1,2);

        somar2Valores(1, 2);

    }

    static int somar2Valores(int num1, int num2) {
        return MinhaCalculadora.somar(num1, num2);
    }
}
