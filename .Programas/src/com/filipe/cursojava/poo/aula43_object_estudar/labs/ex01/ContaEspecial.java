package com.filipe.cursojava.poo.aula43_object_estudar.labs.ex01;

public class ContaEspecial extends ContaBancaria {

    private double limite = 500;
    private double limiteUsado = limite;


    public ContaEspecial() {
        super();
    }


    public void depositar(double valorDeposito) {
        if (valorDeposito <= (this.limite - this.limiteUsado)) {

            this.limiteUsado += valorDeposito;

        } else if (valorDeposito > (this.limite - this.limiteUsado)) {

            valorDeposito -= (this.limite - this.limiteUsado);

            this.limiteUsado = this.limite;

            //this.Saldo() += valorDeposito;

            this.setSaldo(getSaldo() + valorDeposito);
        }
        System.out.println("\n$$$ Valor depositado com sucesso $$$");
    }

    public void sacar(double valorSaque) {
        double valorFinal = this.getSaldo();

        if (this.getSaldo() - valorSaque >= 0) {
            valorFinal = this.getSaldo() - valorSaque;

            System.out.println("\n$$$ Valor sacado com sucesso $$$");

        } else if (this.getSaldo() - valorSaque <= 0 && (this.getSaldo() - valorSaque) + this.limiteUsado >= 0) {
            System.out.println("\n$$$ Valor sacado com sucesso $$$");
            System.out.println("\n### ATENÇÃO - CHEQUE ESPECIAL UTILIZADO ###\n");

            valorFinal = 0;

            this.limiteUsado = (this.getSaldo() - valorSaque) + this.limiteUsado;

        } else {
            System.out.println("\n*** ERRO - Saldo insuficiente ***");
        }
        this.setSaldo(valorFinal);

        System.out.println();
    }

    void exibirSaldo() {
        System.out.println("\nSaldo conta especial R$" + this.getSaldo());
        System.out.println("Cheque Especial R$" + this.limiteUsado);
    }

    void exibirDadosCliente() {
        System.out.println("\nNome Cliente - " + getNomeCliente());
        System.out.println("Numero Conta - 0" + getNumConta());
    }

}
