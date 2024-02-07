package com.filipe.cursojava.poo.aula35_recursividade.labs.ex02;

public class Ex02 {
    static int somatorio(int num1) {
        if (num1 == 1) {
            return 1;
        }
        return num1 + (somatorio(num1 - 1));
    }
}
