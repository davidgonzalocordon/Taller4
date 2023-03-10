package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Punto_1 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escribe un programa que lea 10 números por teclado y que luego los muestre en\n"
                + "orden inverso, es decir, el primero que se introduce es el último en mostrarse y\n"
                + "viceversa.");
        List<Integer> Numeros= new ArrayList<Integer>();
        int contador=1; 
        
        System.out.println("inserte los numeros. ");
        for (int i = 0; i <= 9; i++)
        {
            System.out.print("Posicion #"+(i+1)+": ");
            Numeros.add(lector.nextInt());
        }
        Collections.reverse(Numeros);
        System.out.println("ahora se mostratan los numeros desde el ultimo al primero: ");
        for (Integer i : Numeros)
        {
            System.out.println("Posicion #"+contador+": "+i);
            contador++;
        }
        
    }

}
