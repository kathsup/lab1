package Carvallo_Katherine_Estructura;

import java.util.Scanner;

public class Carvallo_Katherine_Estructura {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        int opcion;

        System.out.println("**Menu**");
        System.out.println("1. Palabra Alreves");
        System.out.println("2. Número perfecto");
        System.out.println("3. primos ");
        System.out.println("4. votaciones");
        System.out.println("5. salir ");
        opcion = entrada.nextInt();

        while (opcion != 5) {
            switch (opcion) {

                case 1: System.out.println("PALABRA ALREVES");
                    System.out.println("Ingresa una palabra: ");
                    String palabra = entrada.next();

                    System.out.print("Palabra alreves: ");
                    for (int i = palabra.length() - 1; i >= 0; i--) {
                        System.out.print(palabra.charAt(i));
                        
                    }
                    System.out.println("\n");
                    break;
                    
                 

            }//cierra switch de los ejercicios 

        }//cierra while de los ejercicios 

    }  //cierra main 
}//cierra class
