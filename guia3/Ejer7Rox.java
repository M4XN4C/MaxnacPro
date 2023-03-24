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
public class Ejer7Rox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        String cadena;
        int cadenasCorrectas = 0;
        int cadenasIncorrectas = 0;

        do {

            System.out.println("Leyendo cadena...");
            cadena = entrada.nextLine();
            String result = validar(cadena);

          switch (result) {
              case "correct":
                  cadenasCorrectas++;
                  break;
              case "incorrect":
                  cadenasIncorrectas++;
                  break;
              default:
                  System.out.println("Se recibio el comando para salir");
                  break;
          }

        } while (!"&&&&&".equals(cadena));

        System.out.println("Cadenas correctas: " + cadenasCorrectas);
        System.out.println("Cadenas Incorrectas: " + cadenasIncorrectas);

    }

    public static String validar(String cadena) {
        
        if ( cadena.equals("&&&&&") ){
            return "";
        }

        int largo = cadena.length();
        String primerLetra = cadena.substring(0, 1);
        String ultimaLetra = cadena.substring(largo - 1);

        if (largo >= 5 && primerLetra.equals("X") && ultimaLetra.equals("O")) {
            return "correct";
        } else {
            return "incorrect";
        }

    
    }
    
}
    
    


