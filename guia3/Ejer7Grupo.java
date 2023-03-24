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
public class Ejer7Grupo {

    /**
     * @param args the command line arguments
     * Realizar un programa que simule el funcionamiento de un dispositivo 
     * RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. 
     * Las cadenas deben llegar con un formato fijo: tienen que ser de un 
     * máximo de 5 caracteres de largo, el primer carácter tiene que ser X 
     * y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la 
* secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
* y toda secuencia distinta de FDE, que no respete el formato se considera 
* incorrecta.
* 
Al finalizar el proceso, se imprime un informe indicando la cantidad de 
* lecturas correctas e incorrectas recibidas. Para resolver el ejercicio deberá
* investigar cómo se utilizan las siguientes funciones de Java Substring(),
* Length(), equals().
     */
    public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
        String cadena = "";
        int correctas = 0;
        int incorrectas = 0;
        
        do {
            System.out.print("Ingrese una cadena empiece con x y termine"
                    + " con 0 (FDE para finalizar): ");
            cadena = leer.nextLine();
            
            if (cadena.equals("&&&&&")) {
                break;
            }
            
            if (cadena.length() == 5 && cadena.charAt(0) == 'X' && cadena.charAt(4) == 'O') {
                correctas++;
            } else {
                incorrectas++;
            }
        } while (true);
        
        System.out.println("Lecturas correctas: " + correctas);
        System.out.println("Lecturas incorrectas: " + incorrectas);
    }
    }
    

