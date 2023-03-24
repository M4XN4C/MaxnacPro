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
public class Manos1 {

    /**
     * ejercicio6
     * Implementar un programa que le pida dos números enteros al usuario 
     * y determine si ambos o alguno de ellos es mayor a 25.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = input.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = input.nextInt();

        if (num1 > 25 && num2 > 25) {
            System.out.println("Ambos números son mayores a 25");
        } else if (num1 > 25 || num2 > 25) {
            System.out.println("Al menos uno de los números es mayor a 25");
        } else {
            System.out.println("Ninguno de los números es mayor a 25");
        }
    }
    
}
