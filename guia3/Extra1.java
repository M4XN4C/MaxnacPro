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
public class Extra1 {

    /**
     * @param args the command line arguments
     * Dado un tiempo en minutos, calcular su equivalente en días y horas. 
     * Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular
     * su equivalente: 1 día, 2 horas.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el tiempo en minutos: ");
        int minutos = leer.nextInt();

        int horas = minutos / 60;
        int dias = horas / 24;
        horas = horas % 24;

        System.out.println(minutos + " minutos equivalen a " + dias + " días, " + horas + " horas.");
    }
    }
    

