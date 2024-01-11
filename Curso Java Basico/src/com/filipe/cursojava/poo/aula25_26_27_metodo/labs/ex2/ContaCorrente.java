package com.filipe.cursojava.poo.aula25_26_27_metodo.labs.ex2;

/*Crie uma classe para representar uma conta corrente que possui um número, um saldo, um status que informa se
ela é especial ou não, um limite. Desenvolva métodos para realizar saque (verificando se o cliente pode realizar saques),
despositar dinheiro, consultar saldo e verificar se o cliente está usando cheque especial ou não. Desenvolva um programa
para testar essa classe.*/
public class ContaCorrente {

    long numAgencia, numConta;
    double saldo, limiteTotal, limiteUsado;
    boolean chequeEspecial;

    String nomeBanco, nomeProprietario;

    void sacar(double valorSaque) {
        double valorFinal = saldo;

        if (saldo - valorSaque >= 0) {
            valorFinal = saldo - valorSaque;

            System.out.println("\n$$$ Valor sacado com sucesso $$$");

        } else if (chequeEspecial && saldo - valorSaque <= 0 && (saldo - valorSaque) + limiteUsado >= 0) {
            System.out.println("\n### ATENÇÃO - CHEQUE ESPECIAL UTILIZADO ###\n");

            valorFinal = 0;

            limiteUsado = (saldo - valorSaque) + limiteUsado;

        } else {
            System.out.println("\n*** ERRO - Saldo insuficiente ***");
            System.out.println();
        }

        saldo = valorFinal;

        System.out.println("\nSeu saldo disponível em conta = R$" + saldo);
        if (chequeEspecial) {
            System.out.println("\nSaldo cheque especial = R$" + limiteUsado);
        }
        System.out.println();
    }

    void depositar(double valorDeposito) {
        if (chequeEspecial && valorDeposito <= (limiteTotal - limiteUsado)) {

            limiteUsado += valorDeposito;

        } else if (!chequeEspecial || valorDeposito > (limiteTotal - limiteUsado)) {

            valorDeposito -= (limiteTotal - limiteUsado);

            limiteUsado = limiteTotal;

            saldo += valorDeposito;
        }

        System.out.println("\n$$$ Valor depositado com sucesso $$$\n");
        System.out.println("Seu novo saldo disponível em conta = R$" + saldo);
        if (chequeEspecial) {
            System.out.println("\nSaldo cheque especial = R$" + limiteUsado);
        }
        System.out.println();
    }

    void consultarSaldo() {
        System.out.println();
        System.out.println("Saldo = R$" + saldo);
        verificarClienteChequeEspecial();
        System.out.println();
    }

    void verificarClienteChequeEspecial() {
        if (chequeEspecial == true) {
            System.out.println("Cheque especial Disponivel = R$" + limiteUsado);
        } else {
            System.out.println("\nCheque especial indisponível\n");
        }
    }

    void verificarUsoChequeEspecial() {
        if (chequeEspecial && limiteUsado == limiteTotal) {
            System.out.println("\nCliente não utilizou Cheque Especial\n");
        } else if (chequeEspecial) {
            System.out.println("\nCliente utilizou Cheque Especial. Novo saldo R$" + limiteUsado);
            System.out.println();
        } else {
            verificarClienteChequeEspecial();
        }
    }
}