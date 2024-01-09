package aula19_exercicios;

/*Criar um vetor A com 10 elementos inteiros. Implementar um programa
que determine a soma dos elementos armazenados neste vetor que
são múltiplos de 5.*/
public class Ex13 {
    public static void main(String[] args) {

        int total = 0;

        int[] vetorA = new int[10];
        vetorA[0] = 40;
        vetorA[1] = 29;
        vetorA[2] = 95;
        vetorA[3] = 76;
        vetorA[4] = 54;
        vetorA[5] = 90;
        vetorA[6] = 33;
        vetorA[7] = 27;
        vetorA[8] = 15;
        vetorA[9] = 87;

        for(int i=0;i< vetorA.length;i++){

            if (vetorA[i] % 5 == 0){

                total += vetorA[i];
            }
        }

        System.out.println("\nA soma dos vetores multiplos de 5 é "+total);

    }
}
