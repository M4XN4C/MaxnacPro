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
public class Ejer5Grupo {

    /**
     * @param args
     * Escriba un programa en el cual se ingrese un valor límite positivo, 
     * y a continuación solicite números al usuario hasta que la suma de 
     * los números introducidos supere el límite inicial
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);

        // Pedir el límite positivo al usuario
        System.out.print("Ingrese el límite positivo: ");
        int limite = leer.nextInt();

        int suma = 0;
        int I = 0;

        // Solicitar números hasta que la suma supere el límite
        while (suma <= limite) {
            System.out.print("Ingrese un número: ");
            int numero = leer.nextInt();

            suma += numero;
            I++;
        }

        // Mostrar el resultado
        System.out.println("La suma de los " + I + " números ingresados "
                + "es " + suma + ", que es mayor que el límite inicial de " + 
                limite + ".");
    }
}


    

