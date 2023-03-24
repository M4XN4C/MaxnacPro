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
public class Ejercios8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double nota;

        do {
            System.out.print("Introduce la nota (0-10): ");
            nota = input.nextDouble();
        } while (nota < 0 || nota > 10);

        System.out.println("La nota introducida es: " + nota);
    }
    }
    

