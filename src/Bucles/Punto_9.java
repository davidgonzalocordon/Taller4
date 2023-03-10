package Bucles;

import java.util.Scanner;

public class Punto_9 {

    public static boolean esPrimo(int num) {
        if (num <= 1)
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++)
        {
            if (num % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Crea un programa que muestre en pantalla los N primeros números primos.\n"
                + "Se pide por teclado la cantidad de números primos que queremos mostrar.");
        int cantidad, contador, numero;
        System.out.println("introdusca la cantidad de números primos que desea mostrar:");
        cantidad = lector.nextInt();
        lector.close();

        contador = 0;
        numero = 2;
        while (contador < cantidad)
        {
            if (esPrimo(numero))
            {
                System.out.print(numero + " ");
                contador++;
            }
            numero++;
        }
    }

}
