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
public class Ejercicio9 {

    /**
     * Escriba un programa que lea 20 números. Si el número leído es igual 
     * a cero se debe salir del bucle y mostrar el mensaje "Se capturó el 
     * numero cero".  El programa deberá calcular y mostrar el resultado de 
     * la suma de los números leídos, pero si el número es negativo no 
     * debe sumarse.
     */
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

        int numero;
        int suma = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            numero = input.nextInt();

            if (numero == 0) {
                System.out.println("Se capturó el número cero.");
                break;
            }

            if (numero > 0) {
                suma += numero;
            }
        }

        System.out.println("La suma de los números ingresados es: " + suma);
    }
    }
    

