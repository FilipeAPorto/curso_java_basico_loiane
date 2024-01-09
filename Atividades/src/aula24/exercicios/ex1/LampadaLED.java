package aula24.exercicios.ex1;

public class LampadaLED {
    public static void main(String[] args) {

        Lampada led = new Lampada();

        led.fabricante = "Ouro Lux";
        led.tipo = "LED";
        led.potencia = 60; // Watts
        led.tensao = "Bivolt"; // 127v e 220v

        System.out.println(led.fabricante);
        System.out.println(led.tipo);
        System.out.println(led.potencia);
        System.out.println(led.tensao);



    }
}
