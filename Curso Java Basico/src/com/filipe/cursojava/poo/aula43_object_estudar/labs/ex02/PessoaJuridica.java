package com.filipe.cursojava.poo.aula43_object_estudar.labs.ex02;

public class PessoaJuridica extends ReceitaFederal {


    double calcularImposto() {
        this.setImposto(this.getRendaBruta() * 0.1);
        return getImposto();
    }

    @Override
    public String toString() {
        return "\n$$$ Receita Federal $$$" + "\nNome do Contribuinte : " + getNomeContribuinte() + "\nRenda Bruta : R$" +
                getRendaBruta() + "\nImposto sobre renda bruta : R$" + getImposto();
    }
}


