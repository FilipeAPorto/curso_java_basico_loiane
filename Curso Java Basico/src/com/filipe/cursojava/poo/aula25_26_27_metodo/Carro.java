package com.filipe.cursojava.poo.aula25_26_27_metodo;

public class Carro { //Classe

    //Atributos
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    //Metodos sem retorno
    void exibirAutonomia() { //Sempre iniciará o nome com um verbo ex: Exibir,Executar,Calcular
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " Km/L");
    }


    //Metodo com retorno
    double obterAutonomia() {

        System.out.println("Metodo obterAutonomia foi chamado");

        return capCombustivel * consumoCombustivel;
    }

    //Metodo com parâmetro
    double calcularCombustivel(double km){

        double qtdCombustivel = km/consumoCombustivel;

        return qtdCombustivel;
    }


}