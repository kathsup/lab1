package Carvallo_Katherine_E1;

import java.util.Scanner;

public class Carvallo_Katherine_E1 {
 public static void main(String[] args){
 
    Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        int opcion=0;
            
    while (opcion != 5){
     System.out.println("***MENU***");
     System.out.println("1. PIRAMIDE\n2. EL MAYOR\n3. CANALES\n4. CARACTERES VOCALES\n5. SALIR");
     opcion = entrada.nextInt(); 
     
     
     switch (opcion){
     
         case 1 : 
           for (int i = 0; i < 6; i++) {
           for (int j = 0; j < i; j++) {
               System.out.print("* ");
           }
           System.out.println(" ");
       }
   
             break; 
         
         case 2: 
             
            int num; 
            
             System.out.println("Ingresar un numero: ");
            
            
     
     
     
     
     }
 
    }
 
 
 
 
 
 
 }   
}
