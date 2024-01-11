package com.filipe.cursojava.poo.aula33_sobrecarga.labs.ex01;

/*Escreva uma classe para representar uma lâmpada. Desenvolva métodos para ligar, desligar a lampada.*/
public class Lampada {

    private String fabricante;
    private String tipo;
    private int potencia;
    private String tensao;
    private boolean ligada; //atributo

    public Lampada() {
    }

    public Lampada(String fabricante, String tipo, int potencia, String tensao, boolean ligada) {
        this.fabricante = fabricante;
        this.tipo = tipo;
        this.potencia = potencia;
        this.tensao = tensao;
        this.ligada = ligada;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void imprimirInformacoes() {
        System.out.println(this.fabricante);
        System.out.println(this.tipo);
        System.out.println(this.potencia);
        System.out.println(this.tensao);
    }

    public void acender() {
        setLigada(true);
    }

    public void apagar() {
        setLigada(false);
    }



    public void mostrarEstado() {
        if (isLigada()) {
            System.out.println("Lâmpada está ligada");
        } else {
            System.out.println("Lâmpada está desligada");
        }
    }

    public void mudarEstado() {
        if (isLigada()) {
            this.apagar();
        } else {
            this.acender();
        }
    }


}