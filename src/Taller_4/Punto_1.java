package Taller_4;

import java.util.Scanner;

public class Punto_1 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int[] numeros = new int[2];
        System.out.println("Realiza un programa que reciba dos números por\n"
                + "teclado e indique cual es mayor o si son iguales.");
        System.out.println("introdusca el valor del primer numero: ");
        numeros[0] = lector.nextInt();

        System.out.println("introdusca el valor del segundo numero: ");
        numeros[1] = lector.nextInt();

        if (numeros[0] == numeros[1])
        {
            System.out.println("los dos numero son iguales");
        } else
        {
            if (numeros[0] < numeros[1])
            {
                System.out.println("el numero mayor es el segundo numero");
            } else
            {
                System.out.println("el primer numero es el mayor");
            }
        }
    }

}
