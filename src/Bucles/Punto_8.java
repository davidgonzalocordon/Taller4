package Bucles;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Punto_8 {

    public static void main(String[] args) throws InterruptedException {
        Scanner lector = new Scanner(System.in);
        System.out.println("Hacer un programa que muestre un cronometro, indicando las horas, minutos y\n"
                + "segundos.");
        int horas = 0, minutos = 0, segundos = 0;

        while (true)
        {
            System.out.println(horas + ":" + minutos + ":" + segundos);
            TimeUnit.SECONDS.sleep(1);
            segundos++;
            if (segundos == 60)
            {
                segundos = 0;
                minutos++;
            }
            if (minutos == 60)
            {
                minutos = 0;
                horas++;
            }
        }
    }

}
