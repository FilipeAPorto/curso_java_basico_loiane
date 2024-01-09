package aula24_exercicios.ex6;

public class Contato1 {
    public static void main(String[] args) {

        ContatoCelular contato = new ContatoCelular();

        contato.nome = "Douglas Cesar Marcerlino";
        contato.email = "douglasdc10@hotmail.com";
        contato.endereco = "Rua das pontas finas,69";

        contato.numeroTelefones = new long[5];
        contato.numeroTelefones[0] = 921523658;
        contato.numeroTelefones[1] = 921845198;


        for (int i=0;i<contato.numeroTelefones.length;i++) {

            if (contato.numeroTelefones[i] == 0){
                break;
            }
            System.out.println(contato.numeroTelefones[i]);
        }

    }
}
