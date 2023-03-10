package Taller_4;

import java.util.Scanner;

public class Punto_15 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Realiza un programa que pida un número entero entre uno y\n"
                + "doce e imprima el número de días que tiene el mes\n"
                + "correspondiente.");
        int mes;

        System.out.println("inserte el numero del mes: ");
        mes = lector.nextInt();
        switch (mes)
        {
            case 1:
                System.out.println("enero tiene 31 dias");
                break;
            case 2:
                System.out.println("febrero tiene 25 dias");
                break;
            case 3:
                System.out.println("marzo tiene 31 dias");
                break;
            case 4:
                System.out.println("abril tiene 30 dias");
                break;
            case 5:
                System.out.println("mayo tiene 31 dias");
                break;
            case 6:
                System.out.println("junio tiene 30 dias");
                break;
            case 7:
                System.out.println("julia tiene 31 dias");
                break;
            case 8:
                System.out.println("agosto tiene 31 dias ");
                break;
            case 9:
                System.out.println("septiembre tiene 30 dias ");
                break;
            case 10:
                System.out.println("octubre tiene 31 dias");
                break;
            case 11:
                System.out.println("noviembre tiene 30 dias");
                break;
            case 12:
                System.out.println("diciembre tiene 31 dias");
                break;
        }

    }

}
