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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[4];

        for (int i = 0; i < numeros.length; i++) {
            do {
                System.out.print("Introduce el número " + (i + 1) + " (entre 1 y 20): ");
                numeros[i] = input.nextInt();
            } while (numeros[i] < 1 || numeros[i] > 20);
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
            for (int j = 1; j <= numeros[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}