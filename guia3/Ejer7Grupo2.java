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
public class Ejer7Grupo2 {

    /**
     * @param args the command line arguments
     */
    
        public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String finSecuencia = null;
        String caracterMax = null;
        String l = "&&&&&";
        int contador = 0;
        int contador2 = 0;
        System.out.println("Ingresa una cadena de 5 caracteres que comience con letra X y termine con la letra O");
        System.out.println("Para salir ingresa esta secuencia &&&&&");
        do {
            System.out.println("Ingresa una cadena");

            caracterMax = leer.nextLine();

            String letra = caracterMax.substring(0, 1);
            String letra2 = caracterMax.substring(4, 5);
            if (!caracterMax.equals("&&&&&")) {

                if (caracterMax.length() == 5 && letra.equalsIgnoreCase("x") && letra2.equalsIgnoreCase("o")) {

                    contador++;

                } else {
                    contador2++;

                }
            }
        } while (!caracterMax.equals("&&&&&"));
        System.out.println("Correctas" + contador);
        System.out.println("Incorrectas " + contador2);
    }
}
    
    

