package carvallo_katherine_control;

import java.util.Scanner;


public class cadenaNotasEntrada {
   public static void main(String[] args){


Scanner entrada = new Scanner(System.in); 
      int opcion;  
      String cadena;
      double nota1, nota2, nota3, nota4,promedio, notamayor, notamenor ; 
        
        
        System.out.println("**Menu**");
        System.out.println("Ingrese la opción del ejercicio al que desea acceder: ");  
        System.out.println("1. Cadena\n2. Notas\n3. Clases\n4.Salir");
        opcion = entrada.nextInt(); 
 
    switch (opcion){
    
        case 1: 
            System.out.println("Ingrese una cadena");
            cadena = entrada.next();
    
            for (int i = 0; i < cadena.length(); i++) {
                for (int j = 0; j < i; j++) {
                    System.out.println("La letra que más se repite es: ");
                }
            }
    
        case 2: 
             
            System.out.println("Ingresar nota #1: ");
            nota1 = entrada.nextDouble();
            
           while (nota1<0){
               System.out.println("No se aceptan numero negativos");
               System.out.println("Ingresar nota #1: ");
               nota1 = entrada.nextDouble();
           }
    
           
           System.out.println("Ingresar nota #2: ");
            nota2 = entrada.nextDouble();
            
           while (nota2<0){
               System.out.println("No se aceptan numeros negativos");
               System.out.println("Ingresar nota #2: ");
               nota2 = entrada.nextDouble();
           }
    
           
           System.out.println("Ingresar nota #3: ");
            nota3 = entrada.nextDouble();
            
           while (nota3<0){
               System.out.println("No se aceptan numeros negativos");
               System.out.println("Ingresar nota #3: ");
               nota3 = entrada.nextDouble();
           }
    
           System.out.println("Ingresar nota #4: ");
            nota4 = entrada.nextDouble();
            
           while (nota4<0){
               System.out.println("No se aceptan numeros negativos");
               System.out.println("Ingresar nota #4: ");
               nota4 = entrada.nextDouble();
           }
    
    promedio = (nota1+nota2+nota3+nota4)/4;
    
    
    
    
    
    
    
    }
    
    












} 
}
