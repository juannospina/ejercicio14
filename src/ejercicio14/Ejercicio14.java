/*
 Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
 */
package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String equipo[] = new String[8];
        
        for (int i = 0; i < 8; i++) {
            System.out.println("Ingresa el nombre del compañero "+(i+1)+":");
            equipo[i] = entrada.nextLine();
        }
        System.out.println("Los compañeros son:");
        
        for (int i = 0; i < 8; i++) {
            System.out.println(equipo[i]);
        }
       
    }
    
}
