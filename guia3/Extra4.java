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
public class Extra4 {

    /**
     * @param args the command line arguments
     * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 
     * y se muestre su equivalente en romano.
     */
    
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Ingrese un número entre 1 y 10: ");
            numero = leer.nextInt();
        } while (numero < 1 || numero > 10);

        String[] romano = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        System.out.println("El número " + numero + " en romano es: " + romano[numero]);
    }
    }
    

