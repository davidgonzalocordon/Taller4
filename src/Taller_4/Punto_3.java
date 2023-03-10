package Taller_4;

import java.util.Scanner;

public class Punto_3 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Crea un programa que pida al usuario dos números y\n"
                + "muestre el resultado de su división. Si el segundo\n"
                + "número es 0, debe mostrar un mensaje de error.");
        double[] numeros=new double[2];
        System.out.println("inserte el primer numero: ");
        numeros[0]=lector.nextInt();
        System.out.println("inserte el segundo numero, recuerde que ningun numero se puede dividir entre 0: ");
        numeros[1]=lector.nextInt();
        while (numeros[1]==0)
        {            
            System.out.println("inserte un numero diferente a 0: ");
            numeros[1]=lector.nextInt();
        }
        double divicion=numeros[0]/numeros[1];
        if (numeros[0]%numeros[1]==0)
        {
            System.out.println("la divicion entre estos dos numeros es de "+(int)divicion);
        } else
        {
            System.out.println("la divicion entre estos dos numeros es de "+divicion);
        }
        
        
    }

}
