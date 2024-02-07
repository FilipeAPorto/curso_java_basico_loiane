package com.filipe.cursojava.poo.aula43_object_estudar.labs.ex01;

public class ContaPoupanca extends ContaBancaria {

    private double diaRendimento = 0.02; // taxa de rendimento diário é = 0,02%

    public ContaPoupanca() {
    }

    public ContaPoupanca(double diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public ContaPoupanca(String nomeCliente, int numConta, double saldo, double diaRendimento) {
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public double getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(double diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    void calcularNovoSaldo() {
        this.setSaldo(this.getSaldo() + (this.getSaldo() * diaRendimento));
    }

    void exibirSaldo() {
        if (this.getSaldo() != 0) {
            System.out.println("\nSaldo Conta PoupançaSaldo R$" + this.getSaldo() + " - Houve rendimentos");
        } else {

            System.out.println("\nSaldo Conta Poupança R$" + this.getSaldo());
        }
    }

    void exibirDadosCliente() {
        System.out.println("\nNome Cliente - " + getNomeCliente());
        System.out.println("Numero Conta - 0" + getNumConta());
    }
}
