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
            
        
         case 3: 
             
             String canal; 
             int HD= 0; 
             int NORMAL= 0; 
             String seguir; 
             String caja; 
             double subtotal, agregarcaja, impuesto, total; 
             
              // Preguntar por el nombre
        System.out.println("Ingrese su nombre");
        String nombre = entrada.next();

        // Ciclo para agregar canales
        do {
            System.out.println("Que tipo de canal desea agregar? (HD/NORMAL)");
            canal = entrada.next();

            if (canal.equalsIgnoreCase("normal")) {
                NORMAL++;
            } else {
                HD++;
            }

            System.out.println("Desea agregar otro canal? (SI/NO)");
            seguir = entrada.next().toUpperCase();

        } while (!seguir.equals("NO"));  // El ciclo continúa hasta que el usuario escriba "NO"

        // Preguntar por el tipo de caja
            System.out.println("Ingrese el tipo de caja que desea: (LIGHTBOX/ HDBOX/ DVRBOX)");
            caja = entrada.next();
                     
        
             System.out.println("CANTIDAD DE CANALES NORMALES Y HD");
             System.out.println("Canales normales: "+NORMAL);
             System.out.println("Canales HD: "+HD);
             
             subtotal = ((NORMAL*20)+(HD*30));
     
             if (caja.equals("LIGHTBOX")){
             agregarcaja = subtotal+50; 
             }
             else{
             if(caja.equals("HDBOX")){
             agregarcaja = subtotal + 100; 
             }
             else{
             agregarcaja = subtotal + 150; 
             }
             }
             
             total = (agregarcaja+(agregarcaja*0.15)); 
             
             System.out.println("Cliente: "+nombre);
             System.out.println("Total a pagar: "+ total);
             break; 
             
             
         case 4: 
             System.out.println("caracteres Vocales");
             
             
             
             
     }
 
    }
 
 
 
 
 
 
 }   
}
