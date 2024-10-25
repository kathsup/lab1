package carvallo_katherine_control;

import java.util.Scanner;


public class cadenaNotasEntrada {
   public static void main(String[] args){


Scanner entrada = new Scanner(System.in); 
      int opcion;  
      String cadena;
      double nota1, nota2, nota3, nota4,promedio, notamayor, notamenor, mayor, menor  ; 
   
        
        
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
            break;
    
        case 2: 
             
            System.out.println("Ingresar nota #1: ");
            nota1 = entrada.nextDouble();
            
           while (nota1<0 || nota1>100){
               System.out.println("No se aceptan numero negativos y mayores de 100");
               System.out.println("Ingresar nota #1: ");
               nota1 = entrada.nextDouble();
           }
    
           
           System.out.println("Ingresar nota #2: ");
            nota2 = entrada.nextDouble();
            
           while (nota2<0 || nota2>100){
               System.out.println("No se aceptan numero negativos y mayores de 100");
               System.out.println("Ingresar nota #2: ");
               nota2 = entrada.nextDouble();
           }
    
           
           System.out.println("Ingresar nota #3: ");
            nota3 = entrada.nextDouble();
            
           while (nota3<0 || nota3>100){
               System.out.println("No se aceptan numero negativos y mayores de 100");
               System.out.println("Ingresar nota #3: ");
               nota3 = entrada.nextDouble();
           }
    
           System.out.println("Ingresar nota #4: ");
            nota4 = entrada.nextDouble();
            
           while (nota4<0 || nota4>100){
               System.out.println("No se aceptan numero negativos y mayores de 100 ");
               System.out.println("Ingresar nota #4: ");
               nota4 = entrada.nextDouble();
           }
    
            promedio = (((nota1+nota2+nota3+nota4)/4)*100.00)/100.00;
    
            if (nota1>nota2){
            mayor = nota1;
            }
            else{
            mayor = nota2;
            }
            
            if (nota3>mayor){
            mayor = nota3;
            }
            else {
            mayor = mayor; 
            }
            
            if (nota4>mayor){
            mayor = nota4;
            }
            else {
            mayor = mayor; 
            }
            
            
            
            
            
            //menor
            if (nota1<nota2){
            menor = nota1;
            }
            else{
            menor = nota2;
            }
            
            if (nota3<menor){
            menor = nota3;
            }
            else {
            menor = menor; 
            }
            
            if (nota4<menor){
            menor = nota4;
            }
            else {
            menor = menor; 
            }
    
    
    
            System.out.println("Promedio: "+promedio);
            System.out.println("Nota mayor: "+ mayor );
            System.out.println("Nota menor:" + menor);
            break; 
            
        case 3: 
            
            System.out.println(":( ");
            break; 
            
        case 4: 
            break; 

        default: System.out.println("Selección incorrecta ");
        
        

    }



} 
}
