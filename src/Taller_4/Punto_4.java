package Taller_4;

import java.util.Scanner;

public class Punto_4 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Realiza un programa que lea una cadena por teclado\n"
                + "y compruebe si es una letra mayúscula.");
        String letra; 
        
        System.out.println("inserte la letra: ");
        letra=lector.nextLine(); 
        while (letra.length()!=1)
        {            
            System.out.println("inserte una letra, no una cadena de texto: ");
            letra=lector.nextLine(); 
        }
        if (Character.isUpperCase(letra.charAt(0)))
        {
            System.out.println("la letra es una mayuscula");
        } else
        {
            System.out.println("la letra es una minuscula");
        }
        
    }

}
