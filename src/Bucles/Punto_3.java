package Bucles;

import java.util.Scanner;

public class Punto_3 {

    public static boolean esVocal(char letra) {
        letra = Character.toUpperCase(letra);
        return letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U' || letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’\n"
                + "en caso contrario, el programa termina cuando se introduce un espacio.");

        String txt;
        char caracter;

        while (true)
        {
            System.out.print("introduce un caracter o un espacio para terminar: ");
            txt = lector.nextLine();

            if (txt.equals(" "))
            {
                break;
            }

            caracter = txt.charAt(0);

            if (esVocal(caracter))
            {
                System.out.println("VOCAL");
            } else
            {
                System.out.println("NO VOCAL");
            }
        }
    }

}
