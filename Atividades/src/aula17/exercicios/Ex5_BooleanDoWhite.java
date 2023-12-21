package aula17.exercicios;

import java.util.Scanner;

//Altere o programa anterior permitindo ao usuário informar as
//populações e as taxas de crescimento iniciais. Valide a entrada e
//permita repetir a operação.
public class Ex5_BooleanDoWhite {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double paisA,paisB,taxaA,taxaB;
        int ano = 0;
        boolean valido = false;

        do{
            System.out.println("Insira a quantidade de habitantes do pais A : ");
            paisA = scan.nextDouble();

            if (paisA >0){
                valido = true;
            } else{
                System.out.println("** ERRO - A quantidade de habitantes do pais A deve ser maior que 0 **");
            }
        }while (!valido);

        valido = false;

        do{
            System.out.println("Insira a quantidade de habitantes do pais B : ");
            paisB = scan.nextDouble();

            if (paisB >paisA){
                valido = true;
            } else{
                System.out.println("** ERRO - A quantidade de habitantes do pais B deve ser mais que a do pais A **");
            }
        }while (!valido);

        valido = false;

        do{
            System.out.println("Insira a taxa de crescimento inicial do pais A (em %) :");
            taxaA = scan.nextDouble();

            if (taxaA >0){
                valido = true;
            } else{
                System.out.println("** ERRO - A taxa tem que maior que 0 **");
            }
        }while (!valido);

        valido = false;

        do{
            System.out.println("Insira a taxa de crescimento inicial do pais B (em %) :");
            taxaB = scan.nextDouble();

            if (taxaB < taxaA && taxaB > 0){
                valido = true;
            } else if (taxaB>taxaA){
                System.out.println("** ERRO - A taxa tem que ser menor que a taxa de crescimento do pais A **");
            } else {
                System.out.println("** ERRO - A taxa tem que ser maior que 0 **");

            }
        }while (!valido);

        taxaA =taxaA/100;
        taxaB = taxaB/100;

        while (paisA <= paisB){
            paisA = paisA+(paisA*taxaA);
            paisB = paisB+(paisB*taxaB);
            ano ++;
        }
        System.out.println("\nO pais 'A' utrapassou a quantidade de habitantes do pais 'B' após "+ ano + " anos.");
    }
}
