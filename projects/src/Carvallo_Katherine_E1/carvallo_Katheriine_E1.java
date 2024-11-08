package Carvallo_Katherine_E1;

import java.util.Scanner;

public class carvallo_Katheriine_E1 {
    public static void main(String[] args){
 
    Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        int opcion=0;
            
    //menu
    //  menu dentro del while para que se repita hasta que se ingrese la opción 5   
    while (opcion != 5){
     System.out.println("***MENU***");
     System.out.println("1. PIRAMIDE\n2. EL MAYOR\n3. CANALES\n4. CARACTERES VOCALES\n5. SALIR");
     opcion = entrada.nextInt(); 
     
     //switch de ejercicios
     switch (opcion){
     
         case 1 : 
            System.out.println("PIRAMIDE");
            int numeroImpar=1; 
            
             System.out.print("cantidad de filas de la piramide:  "); 
             int filas = entrada.nextInt(); //cantidad de filas que tendra la piramide
            
             
             //for que maneja las filas de las piramides
           for (int i = 1; i < (filas+1); i++) {
               int sumafila = 0; //contador para los numeros 
               
               //for para los numeros en cada fila
           for (int j = 0; j < i; j++) {
               System.out.print(numeroImpar + " ");
               sumafila += numeroImpar;
               numeroImpar += 2;  // Avanza al siguiente número impar
            }
           
            System.out.print(" = "+sumafila); // pone el signo igual y suma lo de cada fila 
                    
            System.out.println(); //espacio 
            
       }
   
             break; 
         
         case 2: 
             int num; 
             int Cpromedio= 0; 
             double promedio; 
             double sumarnum=0; 
             String agregar; 
             int mayor = 0; 
             
             System.out.println("EL MAYOR");
             do {
            System.out.println("Ingrese un numero"); //PIDE INGRESAR UN NUMERO 
            num = entrada.nextInt();
            Cpromedio ++; //Para saber cuantos agrega y usarlo para el promedio 
            
            if (num>0){//comparar numero más grande 
            mayor = num; 
            }
            
            System.out.println("Desea agregar otro numero? (SI/NO)");
            agregar = entrada.next().toUpperCase();  //si desea seguir agregando más numeros 
            
            sumarnum += num; //suma todos los numeros para el promedio 
             
            

        } while (!agregar.equals("NO"));
             
             promedio = (sumarnum/Cpromedio); //promedio 
            
                 System.out.println("El numero mayor es: "+ mayor); //mostrar respuestas 
                 System.out.println("El promedio ingresado es: "+promedio);
             
          break; 
        
         case 3: 
             
             String canal; 
             int HD= 0; 
             int NORMAL= 0; 
             String seguir; 
             String caja; 
             double subtotal, agregarcaja, total; 
             
             
             System.out.println("CANALES");
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

        } while (!seguir.equals("NO"));  // sigue hasta que dice que  "NO"

        // Preguntar por el tipo de caja
            System.out.println("Ingrese el tipo de caja que desea: (LIGHTBOX/ HDBOX/ DVRBOX)");
            caja = entrada.next();
                     
            //imprimir resultados 
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
             
             //IMPRIMIR RESULTADOS 
             System.out.println("***FACTURA***");
             System.out.println("Cliente: "+nombre);
             System.out.println("Total a pagar: "+ total);
             break; 
             
             
         case 4: 
             System.out.println("caracteres Vocales");
             
             System.out.println("Ingrese una palabra: ");
             String palabra = entrada.next();
             int contador = 0;
             //contar las letras de las palabras 
             for (int i = 0; i < palabra.length(); i++) {
                 // ir validando letra por letra 
                 char letra = palabra.charAt(i);

                 //si es alguna de estas aumenta el contador
                 switch (letra) {
                     case 'a':
                         contador++;
                         break;
                     case 'e':
                         contador++;
                         break;
                     case 'i':
                         contador++;
                         break;
                     case 'o':
                         contador++;
                         break;
                     case 'u':
                         contador++;
                         break;
                 }
               
             }
             System.out.println("CANTIDAD DE VOCALES " + contador);
             
             break; 
             
         case 5: 
             //finaliza el programa 
             System.out.println("HASTA LUEGO");
             break; 
             
         default: //en caso de que ingrese una opcion no valida 
             System.out.println("Selección incorrecta");
     }
 
    }
 
 
 
 
 
    }
}
