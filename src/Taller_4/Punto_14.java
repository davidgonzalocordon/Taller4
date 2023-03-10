package Taller_4;

import java.util.Scanner;

public class Punto_14 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Realiza un programa que pida el día de la semana (del 1 al 7) y\n"
                + "escriba el día correspondiente. Si introducimos otro número nos\n"
                + "da un error.");
        int dia;
        System.out.println("inserte un numero del 1 al 7: ");
        dia = lector.nextInt();
        while (dia <= 0 || dia >= 8)
        {
            System.out.println("«ERROR: número incorrecto»");
            System.out.println("escriba un numero del 1 al 7 porfavor: ");
            dia = lector.nextInt();
        }
        switch (dia)
        {
            case 1:
                System.out.println("lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
            case 3:
                System.out.println("miercoles");
                break;
            case 4:
                System.out.println("jueves");
                break;
            case 5:
                System.out.println("hoy es viernes y el cuerpo lo sabe jsjsjs ");
                break;
            case 6:
                System.out.println("sabado");
                break;
            case 7:
                System.out.println("domingo mañana hay clase");

                break;

        }

    }

}
