package aula27_exercicios.ex1;

public class LampadaTeste {
    public static void main(String[] args) {

        Lampada led = new Lampada();

        led.acender();

        led.mostrarEstado();

        led.apagar();

        if (led.ligada) {
            System.out.println("Lâmpada está ligada");
        } else {
            System.out.println("Lâmpada está desligada");
        }

        led.mudarEstado();

        if (led.ligada) {
            System.out.println("Lâmpada está ligada");
        } else {
            System.out.println("Lâmpada está desligada");
        }

    }
}
