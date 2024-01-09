package aula19_exercicios;

/*Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
a) Bi deverá receber 'a' quando Ai for menor que 7; b) Bi deverá
receber 'b' quando Ai for igual a 7; c) Bi deverá receber 'c' quando Ai for
maior que 7 e menor que 10; d) Bi deverá receber 'd' quando Ai for
igual a 10; e e) Bi deverá receber 'e' quando Ai for maior que 10.
Sugestão: char B[10];*/
public class Ex27 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        vetorA[0] = 6;
        vetorA[1] = 5;
        vetorA[2] = 18;
        vetorA[3] = 8;
        vetorA[4] = 9;
        vetorA[5] = 5;
        vetorA[6] = 7;
        vetorA[7] = -8;
        vetorA[8] = 2;
        vetorA[9] = 10;

        char[] vetorB = new char[10];

        for (int i=0;i< vetorB.length;i++){

            if (vetorA[i]<7){
                vetorB[i] = 'a';
            } else if (vetorA[i]==7){
                vetorB[i] = 'b';
            } else if (vetorA[i]>7 && vetorA[i]<10){
                vetorB[i] = 'c';
            } else if (vetorA[i]==10){
                vetorB[i] = 'd';
            } else if (vetorA[i]>10){
                vetorB[i] = 'e';
            }
            System.out.println((i+1)+" - "+vetorB[i]);
        }
    }
}
