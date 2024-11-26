
package pruebasemana8;

import java.util.Scanner;

public class ejercicio2 {
   
    
    
   public static void main(String[] args){
   Scanner entrada = new Scanner(System.in); 
       System.out.println("Valor anualidad");
        
        System.out.println("Ingresar renta: ");
        double renta= entrada.nextDouble(); 
        
        System.out.println("Ingresar interes: ");
        double interes= entrada.nextDouble();
       
        System.out.println("Ingresar numero de pagos: ");
        double pagos= entrada.nextDouble();
        
   
       System.out.println("valor anualidad");
       System.out.println("1. ordinaria");
       System.out.println("2. anticipada");
       int opcion=entrada.nextInt(); 
       
       switch(opcion){
       
           case 1: 
               double c= renta*(1-((1+interes)));
               
               break; 
               
           case 2: 
               break; 
               
           default: 
               break; 
               
       
       }
       
   
   
   
   } 
    
    
    
    
    
    
    
    
}
