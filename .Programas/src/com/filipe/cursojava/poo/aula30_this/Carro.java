package com.filipe.cursojava.poo.aula30_this;

public class Carro {

    String marca; // default só e visivel dentro do pacote(package)
    public String modelo; // public é visivel para geral, todos os pacote(packages).
    private int numPassageiros; // private é somente dentro da própria classe.
    double capCombustivel;
    double consumoCombustivel;


    public void exibirAutonomia() { //Sempre iniciará o nome com um verbo ex: Exibir,Executar,Calcular
        System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " Km/L");
    }

    public double obterAutonomia() {
        System.out.println("Metodo obterAutonomia foi chamado");

        return capCombustivel * consumoCombustivel;
    }

    private double dividirKMPorConsumoCombustivel(double km) {

        return km / this.consumoCombustivel;
    }

    public double calcularCombustivel1(double km) {


        return this.dividirKMPorConsumoCombustivel(km);
    }
}
