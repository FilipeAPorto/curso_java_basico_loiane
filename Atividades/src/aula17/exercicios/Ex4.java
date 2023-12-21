package aula17.exercicios;

/*Supondo que a população de um país "A" seja da ordem de 80 mil habitantes com uma taxa anual de crescimento de 3%
e que a população de "B" seja 200 mil habitantes com uma taxa de crescimento de 1.5%.
Faça um programa que calcule e escreva o número de anos necessários para que a população do país "A" ultrapasse ou iguale a
população do país "B", mantidas as taxas de crescimento.*/
public class Ex4 {
    public static void main(String[] args) {

        double paisA = 80000;
        double paisB = 200000;
        int ano = 0;


        while (paisA < paisB){
            paisA = paisA+(paisA*0.03);
            paisB = paisB+(paisB*0.015);
            ano ++;
        }
        System.out.println("\nO pais 'A' utrapassou a quantidade de habitantes do pais 'B' após "+ ano + " anos.");
        //System.out.println("Pais A = " +(int) paisA +" e pais B = "+ (int) paisB + "\n");
    }
}
