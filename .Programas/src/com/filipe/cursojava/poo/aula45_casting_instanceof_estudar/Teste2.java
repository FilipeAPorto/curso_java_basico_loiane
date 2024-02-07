package com.filipe.cursojava.poo.aula45_casting_instanceof_estudar;

public class Teste2 {

    public static void main(String[] args) {

        Object obj1 = obterString(); //downcasting
        String s1 = (String) obj1;

        Object obj2 = "Minha String"; //upcasting
        String s2 = (String) obj2; // downcasting


        Object obj3 = new Object();
       // String s3 = (String) obj3;

        Object obj4 = obetInteiro();
       // String s4 = (String) obj4; // Não funciona
    }

    public static String obterString() {
        return "Minha String";
    }

    public static int obetInteiro() {
        return 1;
    }
}
