package com.filipe.cursojava.poo.aula33_sobrecarga.labs.ex02;

/*Crie uma classe para representar uma conta-corrente que possui um número, um saldo, um status que informa se
ela é especial ou não, um limite. Desenvolva métodos para realizar saque (verificando se o cliente pode realizar saques),
despositar dinheiro, consultar saldo e verificar se o cliente está usando cheque especial ou não. Desenvolva um programa
para testar essa classe.*/
public class ContaCorrente {

    private long numAgencia, numConta;
    private double saldo, limiteTotal, limiteUsado;
    private boolean chequeEspecial;
    private String nomeBanco, nomeProprietario;

    public ContaCorrente() {
    }

    public ContaCorrente(long numAgencia, long numConta, double saldo, double limiteTotal,
                         double limiteUsado, boolean chequeEspecial, String nomeBanco, String nomeProprietario) {
        this.numAgencia = numAgencia;
        this.numConta = numConta;
        this.saldo = saldo;
        this.limiteTotal = limiteTotal;
        this.limiteUsado = limiteUsado;
        this.chequeEspecial = chequeEspecial;
        this.nomeBanco = nomeBanco;
        this.nomeProprietario = nomeProprietario;
    }


    public long getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(long numAgencia) {
        this.numAgencia = numAgencia;
    }

    public long getNumConta() {
        return numConta;
    }

    public void setNumConta(long numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteTotal() {
        return limiteTotal;
    }

    public void setLimiteTotal(double limiteTotal) {
        this.limiteTotal = limiteTotal;
    }

    public double getLimiteUsado() {
        return limiteUsado;
    }

    public void setLimiteUsado(double limiteUsado) {
        this.limiteUsado = limiteUsado;
    }

    public boolean isChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(boolean chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }



    public void exibirInformacoes() {
        System.out.println("\n$$$ BEM VINDO AO " + this.nomeBanco);
        System.out.println("Nome do proprietário da conta - " + this.nomeProprietario);
        System.out.println("Numero da Agencia - " + this.numAgencia);
        System.out.println("Numero da conta - " + this.numConta);
        System.out.println();
    }

    public void sacar(double valorSaque) {
        double valorFinal = this.saldo;

        if (this.saldo - valorSaque >= 0) {
            valorFinal = this.saldo - valorSaque;

            System.out.println("\n$$$ Valor sacado com sucesso $$$");

        } else if (this.chequeEspecial && this.saldo - valorSaque <= 0 && (this.saldo - valorSaque) + this.limiteUsado >= 0) {
            System.out.println("\n### ATENÇÃO - CHEQUE ESPECIAL UTILIZADO ###\n");

            valorFinal = 0;

            this.limiteUsado = (this.saldo - valorSaque) + this.limiteUsado;

        } else {
            System.out.println("\n*** ERRO - Saldo insuficiente ***");
            System.out.println();
        }

        this.saldo = valorFinal;

        System.out.println("\nSeu saldo disponível em conta = R$" + this.saldo);
        if (this.chequeEspecial) {
            System.out.println("\nSaldo cheque especial = R$" + this.limiteUsado);
        }
        System.out.println();
    }

    public void depositar(double valorDeposito) {
        if (this.chequeEspecial && valorDeposito <= (this.limiteTotal - this.limiteUsado)) {

            this.limiteUsado += valorDeposito;

        } else if (!this.chequeEspecial || valorDeposito > (this.limiteTotal - this.limiteUsado)) {

            valorDeposito -= (this.limiteTotal - this.limiteUsado);

            this.limiteUsado = this.limiteTotal;

            this.saldo += valorDeposito;
        }

        System.out.println("\n$$$ Valor depositado com sucesso $$$\n");
        System.out.println("Seu novo saldo disponível em conta = R$" + this.saldo);
        if (this.chequeEspecial) {
            System.out.println("\nSaldo cheque especial = R$" + this.limiteUsado);
        }
        System.out.println();
    }

    public void consultarSaldo() {
        System.out.println();
        System.out.println("Saldo = R$" + this.saldo);
        verificarClienteChequeEspecial();
        System.out.println();
    }

    public void verificarClienteChequeEspecial() {
        if (this.chequeEspecial) {
            System.out.println("Cheque especial Disponivel = R$" + this.limiteUsado);
        } else {
            System.out.println("\nCheque especial indisponível\n");
        }
    }

    public void verificarUsoChequeEspecial() {
        if (this.chequeEspecial && this.limiteUsado == this.limiteTotal) {
            System.out.println("\nCliente não utilizou Cheque Especial\n");
        } else if (this.chequeEspecial) {
            System.out.println("\nCliente utilizou Cheque Especial. Novo saldo R$" + this.limiteUsado);
            System.out.println();
        } else {
            verificarClienteChequeEspecial();
        }
    }
}