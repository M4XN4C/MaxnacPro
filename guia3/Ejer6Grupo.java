/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author MAXNAC
 */
public class Ejer6Grupo {

    /**
     * @param args the command line arguments
     * Realizar un programa que pida dos números enteros positivos por teclado
     * y muestre por pantalla el siguiente menú:El usuario deberá elegir una 
     * opción y el programa deberá mostrar el resultado por pantalla y luego 
     * volver al menú. El programa deberá ejecutarse hasta que se elija la 
     * opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, 
     * en vez de salir del programa directamente, se debe mostrar el siguiente 
     * mensaje de confirmación: ¿Está seguro que desea salir del programa 
     * (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, 
     * caso contrario se vuelve a mostrar el menú.
     */
    public static void main(String[] args) {
           Scanner leer = new Scanner(System.in);

        int num1, num2, opcion;

        // Pedir dos números enteros positivos al usuario
        System.out.print("Ingrese el primer número: ");
        num1 = leer.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = leer.nextInt();

        // Ejecutar el menú hasta que se seleccione la opción 5
        do {
            // Mostrar el menú
            System.out.println(" ******MENÚ****** ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            // Pedir la opción al usuario
            System.out.print("\nSeleccione una opción: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    // Sumar los dos números y mostrar el resultado
                    System.out.println("La suma es: " + (num1 + num2));
                    break;
                case 2:
                    // Restar los dos números y mostrar el resultado
                    System.out.println("La resta es: " + (num1 - num2));
                    break;
                case 3:
                    // Multiplicar los dos números y mostrar el resultado
                    System.out.println("La multiplicación es: " + (num1 * num2));
                    break;
                case 4:
                    // Dividir los dos números y mostrar el resultado
                    if (num2 == 0) {
                        System.out.println("No se puede dividir por cero");
                    } else {
                        System.out.println("La división es: " + ((float)num1 / num2));
                    }
                    break;
                case 5:
                    // Pedir confirmación para salir del programa
                    System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
                    String respuesta = leer.next();
                    if (respuesta.equalsIgnoreCase("S")) {
                        System.out.println("Saliendo del programa...");
                        return; // salir del programa
                    }
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 5);
    }
}
    
    

