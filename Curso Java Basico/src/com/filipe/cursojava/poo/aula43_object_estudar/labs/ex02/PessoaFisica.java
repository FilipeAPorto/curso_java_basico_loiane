package com.filipe.cursojava.poo.aula43_object_estudar.labs.ex02;

public class PessoaFisica extends ReceitaFederal {


    double calcularImposto() {

        if (getRendaBruta() <= 1400) {

            setImposto(0);

        } else if (getRendaBruta() >= 1400.01 && getRendaBruta() <= 2100) {

            setImposto((getRendaBruta() - 1400) * 0.1);

        } else if (getRendaBruta() >= 2100.01 && getRendaBruta() <= 2800) {

            //((getRendaBruta() - 2100 ) * 0.15)
            //    2100 - 1400 * 0.1;

            setImposto(((getRendaBruta() - 2100) * 0.15) + ((2100 - 1400) * 0.1));

        } else if (getRendaBruta() >= 2800.01 && getRendaBruta() <= 3600) {

            //(getRendaBruta() - 2800 * 0.25);
            //2800-2100 * 0.15;
            //2100 - 1400 * 0.1;

            setImposto(((getRendaBruta() - 2800) * 0.25) + ((2800 - 2100) * 0.15) + ((2100 - 1400) * 0.1));

        } else if (getRendaBruta() > 3600.01) {

            //(getRendaBruta() - 3600) * 0.3;
            // (3600 - 2800) * 0.25
            //2800 - 2100 * 0.15;
            //  2100 - 1400 * 0.1;

            setImposto(((getRendaBruta() - 3600) * 0.3) + ((3600 - 2800) * 0.25) + ((2800 - 2100) * 0.15) + ((2100 - 1400) * 0.1));
        }
        return getImposto();
    }


    @Override
    public String toString() {
        return "\n$$$ Receita Federal $$$" + "\nNome do Contribuinte : " + getNomeContribuinte() + "\nRenda Bruta : R$" +
                getRendaBruta() + "\nImposto sobre renda bruta : R$" + getImposto();
    }
}
