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
public class Extra3 {

    /**
     * @param args the command line arguments
     * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte 
     * si se trata de una vocal. Caso contrario mostrar un mensaje.
     * Nota: investigar la función equals() de la clase String.
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese una letra: ");
        String letra = leer.nextLine();

        if (letra.length() == 1) {
            String[] vocales = {"a", "e", "i", "o", "u","A", "E", "I", "O", "U"};

            for (String vocal : vocales) {
                if (letra.equals(vocal)) {
                    System.out.println("La letra ingresada es una vocal.");
                    return;
                }
            }

            System.out.println("La letra ingresada no es una vocal.");
        } else {
            System.out.println("Debe ingresar una sola letra.");
        }
    }
    }
    

