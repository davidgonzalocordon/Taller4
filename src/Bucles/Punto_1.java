package Bucles;

import java.util.Random;
import java.util.Scanner;

public class Punto_1 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random azar = new Random();
        System.out.println("Crea una aplicación que permita adivinar un número. La aplicación genera un\n"
                + "número aleatorio del 1 al 100. A continuación va pidiendo números y va\n"
                + "respondiendo si el número a adivinar es mayor o menor que el introducido, a\n"
                + "demás de los intentos que te quedan (tienes 10 intentos para acertarlo). El\n"
                + "programa termina cuando se acierta el número (además te dice en\n"
                + "cuantos intentos lo has acertado), si se llega al limite de intentos te muestra\n"
                + "el número que había generado.");
        int NumR = azar.nextInt(100) + 1;
        int oportunidades = 10, NumUsuario = 0;
        while (oportunidades > 0)
        {
            System.out.println("inserta el numero que crees que se genero: ");
            NumUsuario = lector.nextInt();
            if (NumR == NumUsuario)
            {
                System.out.println("le atinaste felicidades el numero si era " + NumUsuario);
                System.exit(0);
            } else
            {
                if (NumUsuario < NumR)
                {
                    System.out.println("lo siento el numero que dijitaste es menor que el que tienes que adivinar");
                } else
                {
                    System.out.println("lo siento el numero que dijitaste es mayor que el que tienes que adivinar");
                }
                oportunidades--;
                System.out.println("te quedan " + oportunidades + " intentos");
            }
        }
        System.out.println("no lograste adivinar el numero, el numero que se genero aleatoriamente es " + NumR);
    }

}
