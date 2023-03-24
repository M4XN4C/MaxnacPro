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
public class Ejer4Grupo {

    /**
     * @param args 
     * Escriba un programa que pida una frase o palabra y valide si la primera 
     * letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá
     * de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
     * contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la 
     * funcion Substring y equals() de Java.
     */
    public static void main(String[] args) {
        System.out.println("Ingrese frase o palabra:");   
        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();
        String letra = frase.substring(0, 1);
     
            
            if (letra.equals("A")) {
                System.out.println("Correcto!!!");//Susana!
            } else {
                System.out.println("Incorrecto!!");
                
                
            }
          
            
        }
    }
    

