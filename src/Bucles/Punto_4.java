package Bucles;

import java.util.Scanner;

public class Punto_4 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escribir un programa que imprima todos los números pares entre dos números\n"
                + "que se le pidan al usuario.");
        int[] NumUsuarios=new int[2];
        System.out.println("inserte el numero donde comienza el todo: ");
        NumUsuarios[0]=lector.nextInt(); 
        System.out.println("inserte el numero donde termina todo: ");
        NumUsuarios[1]=lector.nextInt();
       
            for (int i =NumUsuarios[0]; i <=NumUsuarios[1];i++)
            {
                if (i%2==0)
                {
                    System.out.println(i);
                }
            }
        
    }

}
