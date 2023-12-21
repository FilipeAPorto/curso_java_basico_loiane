package aula17.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/*O Sr. Manoel Joaquim expandiu seus negócios para além dos
negócios de 1,99 e agora possui uma loja de conveniências. Faça um
programa que implemente uma caixa registradora rudimentar. O
programa deverá receber um número desconhecido de valores
referentes aos preços das mercadorias. Um valor zero deve ser
informado pelo operador para indicar o final da compra. O programa
deve então mostrar o total da compra e perguntar o valor em dinheiro
que o cliente forneceu, para então calcular e mostrar o valor do troco.
Após esta operação, o programa deverá voltar ao ponto inicial, para
registrar a próxima compra. A saída deve ser conforme o exemplo
abaixo:
o Lojas Tabajara
o Produto 1: R$ 2.20
o Produto 2: R$ 5.80
o Produto 3: R$ 0
o Total: R$ 9.00
o Dinheiro: R$ 20.00
o Troco: R$ 11.00
o ...
*/
public class Ex31_Duvida {
  public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String formato = "R$#,##0.00";
        DecimalFormat df = new DecimalFormat(formato);

        double precoMerc;

        for (int i=1;i<=Integer.MAX_VALUE;i++) {

            System.out.print("\nInsira o valor da mercadoria :");
            precoMerc = scan.nextDouble();

            System.out.println("Produto "+i+" - "+df.format(precoMerc));

            if (precoMerc == 0) {
                return;
            }
        }
    }
}

