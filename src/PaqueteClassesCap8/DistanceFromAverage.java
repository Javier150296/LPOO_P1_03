package PaqueteClassesCap8;

import java.util.Scanner;

public class DistanceFromAverage{

public static void  ejecutar(){
Scanner datos = new Scanner(System.in);
 
    int con = 0;
    double total = 0;

    double prom = 0;

    final int QUIT = 99999;

    final int MAX = 10;

    double[] arr = new double[10];

    double uin;


    
System.out.println("ingrese un numero de hasta "
      + MAX + ", para salir ingrese 99999 >>");

    uin = datos.nextDouble();

    while ((uin == QUIT && con == 0) || uin != QUIT && con < 10){

      if (uin == QUIT && con == 0)
{

        System.out.println("Error: tiene que ingresar al menos un numero ");

        System.out.println("Enter un numero de hasta "
          + MAX + ", para salir ingrese 99999 >>");

        uin = datos.nextDouble();

      }

      if (uin != QUIT)
{

        arr[con] = uin;

        total += arr[con];

        System.out.println("Continue ingresando un numero de hasta "
          + MAX + ", pa salir ingrese 99999 >>");

        uin = datos.nextDouble();

        con++;

      }
 
    }
 
    prom = total / con;

    System.out.println("se ingreso: ");

    for (int i = 0; i < con; i++){

      System.out.print(arr[i] + " distencia del promedio: " 
        + Math.abs(prom - arr[i]));

      if (i != con - 1)

        System.out.print("\n");

    }

    System.out.println("\nThe el promedio de los numeros es: "
      + prom);
}
}