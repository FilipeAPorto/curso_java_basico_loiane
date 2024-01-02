package aula19.exercicios;

/*Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a 0 e 1,
sugestão: A[i] = (int)Math.round(Math.random() * 1);
Pede-se para implementar um programa que determine o percentual de
números 0's e 1's existentes no vetor A.*/
public class Ex22 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        double num0=0,num1=0;

        for (int i=0;i< vetorA.length;i++){

            vetorA[i] = (int)Math.round(Math.random() * 1);

            if (vetorA[i] == 0 ){
                num0++;
            } else {
                num1++;
            }
        }

        num0 = (num0 / vetorA.length) * 100;
        num1 = (num1 / vetorA.length) * 100;

        System.out.println("São "+(int)num0 + "% de numero(s) ZERO e "+(int)num1 + "% de numero(s) UM.");
    }
}
