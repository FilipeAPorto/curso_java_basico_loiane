package com.filipe.cursojava.poo.aula43_object_estudar.labs.ex01;

public abstract class ContaBancaria {

    private String nomeCliente;
    private int numConta;
    private double saldo = 0;

    public ContaBancaria() {
    }

    public ContaBancaria(String nomeCliente, int numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public void sacar(double valorSaque) {
        double valorFinal = this.saldo;

        if (this.saldo - valorSaque >= 0) {
            valorFinal = this.saldo - valorSaque;

            System.out.println("\n$$$ Valor sacado com sucesso $$$");

        } else {
            System.out.println("\n*** ERRO - Saldo insuficiente ***");
        }

        this.saldo = valorFinal;
    }


    public void depositar(double valorDeposito) {

        saldo += valorDeposito;

        System.out.println("\n$$$ Valor depositado com sucesso $$$\n");
    }
}
