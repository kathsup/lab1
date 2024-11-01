package Carvallo_Katherine_Estructura;

import java.util.Random;
import java.util.Scanner;

public class Carvallo_Katherine_Estructura {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        int opcion=0;
        Random random = new Random();
        //  int naleatorio = random.nextInt(1,100);
        
        while (opcion != 5) {
        System.out.println("**Menu**");
        System.out.println("1. Palabra Alreves");
        System.out.println("2. Número perfecto");
        System.out.println("3. primos ");
        System.out.println("4. votaciones");
        System.out.println("5. salir ");
        opcion = entrada.nextInt();


            switch (opcion) {

                case 1:
                    System.out.println("PALABRA ALREVES");
                    System.out.println("Ingresa una palabra: ");
                    String palabra = entrada.next();

                    System.out.print("Palabra alreves: ");
                    for (int i = palabra.length() - 1; i >= 0; i--) {
                        System.out.print(palabra.charAt(i));

                    }
                    System.out.println("\n");
                    break;

                case 2:

                    break;

                case 3:
                    System.out.println("PRIMOS");
                    int naleatorio = random.nextInt(100)+1;
                    int contadorDivisores = 0;
                    String divisores = ""; 

        
                    for (int i = 1; i <= naleatorio; i++) {
                    if (naleatorio % i == 0) {
                    contadorDivisores++;
                    divisores += i + " "; 
                     }
                     }

                    if (contadorDivisores == 2) {
                    System.out.println("Primo " + naleatorio );
                    } else {
                    System.out.println("No es primo ");
                    }
                   
                    System.out.println("Divisores de " + naleatorio + " son: " + divisores.trim().replace(" ", " y "));

                    break;

                case 4:
                    System.out.println("VOTACIONES");
                    int votantes; 
                    String planilla; 
                    
                   
                    
                    System.out.println("Ingresar numero de votantes: ");
                    votantes = entrada.nextInt(); 
                    
                    for (int i = 0; i < votantes.length(); i++) {
                     
                        System.out.println("Planillas: \nAZUL\nROJO\nNEGRO\nAMARILLO ");
                        System.out.println("Ingrese la planilla por la cual votara: ");
                        planilla = entrada.nextLine(); 
                        
                        if
                        
                    }
                    
                    
                    
                    
                    

            }//cierra switch de los ejercicios 

        }//cierra while de los ejercicios 

    }  //cierra main 
}//cierra class
