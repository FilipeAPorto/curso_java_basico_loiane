package aula15.exercicios;

import java.util.Scanner;

//Faça um programa que faça 5 perguntas para uma pessoa sobre um crime.
// As perguntas são:
//a. "Telefonou para a vítima?"
//b. "Esteve no local do crime?"
//c. "Mora perto da vítima?"
//d. "Devia para a vítima?"
//e. "Já trabalhou com a vítima?"
// O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
// Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
// entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário,
// ele será classificado como "Inocente".
public class Ex25 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Responda as questões com SIM ou NÃO.");
        System.out.println("Você telefonou para a vítima ?");
        String quest1 = scan.next();

        System.out.println("Você esteve no local do crime ?");
        String quest2 = scan.next();

        System.out.println("Você mora perto da vítima ?");
        String quest3 = scan.next();

        System.out.println("Você devia para a vítima ?");
        String quest4 = scan.next();

        System.out.println("Você ja trabalhou com a vítima ?");
        String quest5 = scan.next();

        int sim = 0;

        if (quest1.equals("SIM")){
            sim = +1;
        }
        if (quest2.equals("SIM")){
            sim = sim +1;
        }
        if (quest3.equals("SIM")){
            sim = sim +1;
        }
        if (quest4.equals("SIM")){
            sim = sim +1;
        }
        if (quest5.equals("SIM")){
            sim = sim +1;
        }

        if (sim == 5){
            System.out.println("Você é o assasino!");
        }else if ((sim >= 3) && (sim <= 4)){
            System.out.println("Você é cúmplice do assassinato!");
        }else if(sim == 2){
            System.out.println("Você é o suspeito!");
        }else{
            System.out.println("Você é inocente!");
        }
    }

}
