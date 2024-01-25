package com.filipe.cursojava.tratamento.aula52;

public class DivisaoNaoExata_Revisar extends Exception{

    private int num;
    private int dem;


    public DivisaoNaoExata_Revisar(int num, int dem) {
        this.num = num;
        this.dem = dem;
    }

    @Override
    public String toString() {
        return "resultado de " + num + " / " + dem + " não é um inteiro!";
    }
}
