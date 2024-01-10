package com.filipe.cursojava.poo.aula25_26_27_metodo;

public class TesteCarro {
    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        //Metodos sem retorno
        System.out.println("*** Método sem retorno ***");
        van.exibirAutonomia();
        System.out.println();

        //Metodo com retorno
        System.out.println("*** Método com  retorno ***");
        double autonomia = van.obterAutonomia();
        System.out.println("Autonomia do carro é "+autonomia);

        System.out.println("Autonomia do carro é "+van.obterAutonomia());
        System.out.println();

        //Metodo com parâmetro
        System.out.println("*** Método com parâmetro ***");
        double qtdCombustivel10 = van.calcularCombustivel(10);
        double qtdCombustivel15 = van.calcularCombustivel(15);

        System.out.println("qtdCombustivel10 " + qtdCombustivel10);
        System.out.println("qtdCombustivel15 " + qtdCombustivel15);


    }
}