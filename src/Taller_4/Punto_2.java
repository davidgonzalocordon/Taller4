package Taller_4;

import java.util.Scanner;

public class Punto_2 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Realiza un programa que pida un número por\n"
                + "teclado y nos indique si es par o impar.");
        int num;

        System.out.println("inserte el numero: ");
        num = lector.nextInt();
        if (num % 2 == 0)
        {
            System.out.println("el numero es par");
        } else
        {
            System.out.println("el nimero es impar");
        }
    }
}
