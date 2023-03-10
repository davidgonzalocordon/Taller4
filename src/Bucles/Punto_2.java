package Bucles;

import java.util.Scanner;

public class Punto_2 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de\n"
                + "números a introducir). El programa debe informar de cuántos números\n"
                + "introducidos son mayores que 0, menores que 0 e iguales a 0.");
        System.out.println("inserte la cantidad de numeros que va a introducir");
        int[] numeros=new int[lector.nextInt()];
        int mayores=0, iguales=0, menores=0;
        for (int i = 0; i < numeros.length; i++)
        {
            System.out.println("introdusca un numero: ");
            numeros[i]=lector.nextInt(); 
        }
        for (int i = 0; i < numeros.length; i++)
        {
            if (numeros[i]>0)
            {
                mayores++;
            }
            if (numeros[i]==0)
            {
                iguales++;
            }
            if (numeros[i]<0)
            {
                menores++;
            }
        }
        System.out.println(" la cantidad de numero iguales, mayores, menores es: ");
        System.out.println("iguales "+iguales);
        System.out.println("mayores "+mayores);
        System.out.println("menores "+menores);
    }

}
