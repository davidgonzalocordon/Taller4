package Bucles;

import java.util.Scanner;

public class Punto_5 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escribe un programa que pida el limite inferior y superior de un intervalo. Si el\n"
                + "límite inferior es mayor que el superior lo tiene que volver a pedir. A\n"
                + "continuación se van introduciendo números hasta que introduzcamos el 0.\n"
                + "Cuando termine el programa dará las siguientes informaciones:\n"
                + "• La suma de los números que están dentro del intervalo (intervalo abierto).\n"
                + "• Cuantos números están fuera del intervalo.\n"
                + "• Informa si hemos introducido algún número igual a los límites del intervalo.");

        int LimiteSuperior = 0, LimiteInferior = 0, Aux, NumerosFueraDelIntervalo = 0, SumaNumerosDentroDelIntervalo = 0, IgualesLimiteInferior = 0, IgualesLimiteSuperior = 0;
        do
        {
            System.out.println("introdusca el valor del limite inferior");
            LimiteInferior = lector.nextInt();
            System.out.println("introdusca el valor del limite superior");
            LimiteSuperior = lector.nextInt();
            if (LimiteInferior >= LimiteSuperior)
            {
                System.out.println("el limite inferior es mayor que el limite superior, porfavor introduscalos de nuevo");
            }

        } while (LimiteInferior >= LimiteSuperior);

        while (true)
        {
            System.out.println("introdusca un numero: ");
            Aux = lector.nextInt();
            if (Aux == 0)
            {
                break;
            }
            if (Aux > LimiteSuperior || Aux < LimiteInferior)
            {
                NumerosFueraDelIntervalo++;
            }

            if (Aux <= LimiteSuperior || Aux >= LimiteInferior)
            {
                SumaNumerosDentroDelIntervalo += Aux;
            }
            if (Aux == LimiteInferior)
            {
                IgualesLimiteInferior++;
            }
            if (Aux == LimiteSuperior)
            {
                IgualesLimiteSuperior++;
            }
            Aux = 0;
        }
        System.out.println(NumerosFueraDelIntervalo + " son los numeros que estan fuera del intervalo");
        System.out.println("el resultado de la suma de todos los numeros que estaban dentro del intervalo es " + SumaNumerosDentroDelIntervalo);
        if (IgualesLimiteInferior > 0 || IgualesLimiteSuperior > 0)
        {
            System.out.println("la cantidad de numeros iguales al limite inferior son " + IgualesLimiteInferior);
            System.out.println("la cantidad de numeros iguales al limite superior son " + IgualesLimiteSuperior);
        } else
        {
            System.out.println("no hay ningun numero igual a uno de los limites");
        }

    }

}
