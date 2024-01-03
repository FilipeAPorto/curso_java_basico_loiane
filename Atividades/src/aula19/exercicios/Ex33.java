package aula19.exercicios;

/*Criar um vetor A com 10 elementos inteiros. Escreva um programa que
imprima cada elemento do vetor A e uma mensagem indicando se o
respectivo elemento é um número primo ou não.*/
public class Ex33 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        vetorA[0] = 40;
        vetorA[1] = 29;
        vetorA[2] = 31;
        vetorA[3] = 37;
        vetorA[4] = 5;
        vetorA[5] = 8;
        vetorA[6] = 3;
        vetorA[7] = 41;
        vetorA[8] = 5;
        vetorA[9] = 87;

        for(int i=0;i< vetorA.length;i++){
            if(vetorA[i] % 2 == 0 || vetorA[i] % 3 ==0){

                System.out.println(vetorA[i] + " - Não é primo");

            } else {
                System.out.println(vetorA[i] + " - É primo");

            }
        }
    }
}
