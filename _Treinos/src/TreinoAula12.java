import java.util.Scanner;

public class TreinoAula12 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();

        System.out.println("Digite a quantidade de filhos: ");
        int qtdFilhos = scan.nextInt();

        System.out.println("Digite sua altura: ");
        float altura = scan.nextFloat();

        System.out.println("Você tem animais de extimação? True or false? ");
        boolean temPet = scan.nextBoolean();

        System.out.println("Você digitou as seguintes informações : ");
        System.out.println("Seu nome completo " + nomeCompleto);
        System.out.println("Sua idade " + idade + " anos");
        System.out.println("Quantidade de filhos " + qtdFilhos);
        System.out.println("Sua altura " + altura + " cm");
        System.out.println("Tem animais de Estimação " + temPet);

    }

}
