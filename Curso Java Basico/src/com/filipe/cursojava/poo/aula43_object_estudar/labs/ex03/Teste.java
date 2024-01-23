package com.filipe.cursojava.poo.aula43_object_estudar.labs.ex03;

public class Teste {
    public static void main(String[] args) {

        int i = 0;

        Mamifero[] mamifero = new Mamifero[100]; // i
        Peixe[] peixe = new Peixe[100]; // j


        mamifero[i] = new Mamifero();

        mamifero[i].setNome("Camelo");
        mamifero[i].setComprimento(150);
        mamifero[i].setCor("Amarelo");
        mamifero[i].setVelocidade(2);

        i++;

        peixe[i] = new Peixe();

        peixe[i].setNome("Tubarão");
        peixe[i].setComprimento(300);
        peixe[i].setAmbiente("Mar");
        peixe[i].setVelocidade(1.5);

        i++;

        mamifero[i] = new Mamifero();

        mamifero[i].setNome("Urso-do-Canadá");
        mamifero[i].setComprimento(180);
        mamifero[i].setCor("Vermelho");
        mamifero[i].setVelocidade(0.5);
        mamifero[i].setAlimento("Mel");

        i++;

        for (int j = 0; j < i; j++) {
            if (mamifero[j] != null) {
                System.out.println(mamifero[j]);
            }
            if (peixe[j] != null){
                System.out.println(peixe[j]);
            }

        }
    }
}
