package com.filipe.cursojava.poo.aula31_public_private;

public class Carro {

    String marca; // default só e visivel dentro do pacote(package)
    public String modelo; // public é visivel para geral, todos os pacote(packages).
    private int numPassageiros; // private é somente dentro da própria classe.
    double capCombustivel;
    double consumoCombustivel;


    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public Carro() {
    }

    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
    }

    public Carro(String marca, String modelo) {
        this(marca,modelo,10);
    }



    //Metodos sem retorno
    void exibirAutonomia() { //Sempre iniciará o nome com um verbo ex: Exibir,Executar,Calcular
        System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " Km/L");
    }


    //Metodo com parâmetro 1
    double calcularCombustivel1(double km) {

        double qtdCombustivel = km / this.consumoCombustivel;

        return qtdCombustivel;
    }
}
