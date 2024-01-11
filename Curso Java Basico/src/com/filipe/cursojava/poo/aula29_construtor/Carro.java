package com.filipe.cursojava.poo.aula29_construtor;

public class Carro {

    //Atributos
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    Carro() {
        System.out.println("Classe Carro foi instanciada");
        numPassageiros = 4;
    }

    Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_) {
        marca = marca_;
        modelo = modelo_;
        numPassageiros = numPassageiros_;
        capCombustivel = capCombustivel_;
        consumoCombustivel = consumoCombustivel_;
    }


    //Metodos sem retorno
    void exibirAutonomia() { //Sempre iniciará o nome com um verbo ex: Exibir,Executar,Calcular
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " Km/L");
    }


    //Metodo com retorno
    double obterAutonomia() {

        System.out.println("Metodo obterAutonomia foi chamado");

        return capCombustivel * consumoCombustivel;
    }

    //Metodo com parâmetro 1
    double calcularCombustivel1(double km) {

        double qtdCombustivel = km / consumoCombustivel;

        return qtdCombustivel;
    }
}
