package Taller_4;

import java.util.Scanner;

public class Punto_5 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Realiza un programa que calcule la potencia de un número, dado este\n"
                + "y su exponente.\n"
                + "Pueden ocurrir tres casos:\n"
                + "* El exponente sea positivo: imprime resultado en pantalla\n"
                + "* El exponente sea 0, el resultado es 1\n"
                + "* El exponente sea negativo, el resultado es 1/potencia con el\n"
                + "exponente positivo.");
        double base,exponente,resultado = 0;
        System.out.println("inserete la base: ");
        base=lector.nextInt();
        System.out.println("inserte el exponente: ");
        exponente=lector.nextInt(); 
        
        if (exponente>=0)
        {
            resultado=Math.pow(base, exponente);
            System.out.println("");
            System.out.println("el resultado de "+base+"^"+exponente+" es "+(int)resultado);
        }
        else{
            exponente=exponente*(-1);
            resultado=Math.pow(base, exponente);
            System.out.println("el resultado de "+base+"^"+exponente+" es 1/"+(int)resultado);
        }
        
    }

}
