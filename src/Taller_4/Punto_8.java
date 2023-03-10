package Taller_4;

import java.util.Scanner;

public class Punto_8 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Realiza un programa que clasifique un triángulo tras\n"
                + "recibir el tamaño de sus lados. Se debe clasificar\n"
                + "como triángulo rectángulo, isósceles, equilátero o\n"
                + "escaleno.");
        double lado1, lado2, lado3;
        System.out.println("introdusca el tamaño del primer lado del triángulo:");
        lado1 = lector.nextDouble();
        System.out.println("introdusca el tamaño del segundo lado del triángulo:");
        lado2 = lector.nextDouble();
        System.out.println("introdusca el tamaño del tercer lado del triángulo:");
        lado3 = lector.nextDouble();

        if (lado1 == lado2 && lado1 == lado3)
        {
            System.out.println("El triángulo es equilátero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3)
        {
            System.out.println("El triángulo es isósceles");
        } else if (Math.pow(lado1, 2) + Math.pow(lado2, 2) == Math.pow(lado3, 2)
                || Math.pow(lado1, 2) + Math.pow(lado3, 2) == Math.pow(lado2, 2)
                || Math.pow(lado2, 2) + Math.pow(lado3, 2) == Math.pow(lado1, 2))
        {
            System.out.println("El triángulo es rectángulo");
        } else
        {
            System.out.println("El triángulo es escaleno");
        }
    }

}
