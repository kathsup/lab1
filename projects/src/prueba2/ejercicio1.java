
package prueba2;

import java.util.Scanner;

public class ejercicio1 {
public static void main(String[]args){


//costo total 
// ingresar precio de cada producto y cantidad de productos comprados 
//preguntar cuantos productos va a registrar y calcular el costo total 

     Scanner entrada = new Scanner(System.in); 
     int cantidadregistrar; 
     int[] precio; 
     int[] cantidad; 
     
    System.out.println("Ingrese la cantidad de productos a registrar: ");
    cantidadregistrar = entrada.nextInt();

   double[] productos = new double[cantidadregistrar]; 
   double[] costo = new double[cantidadregistrar]; 
  
       //System.out.println("Ingrese el precio de los productos : ");
       
       for (int i = 0; i < cantidadregistrar; i++) {
           System.out.println((i+1)+" favor ingresar el precio: ");
           productos[i] = entrada.next().charAt(0);
           
           System.out.println((i+1)+" favor ingresar la cantidad: ");
           costo[i] = entrada.next().charAt(0);
           
       }
       
       System.out.println("el precio total es: ");
       for (int i = 0; i < cantidadregistrar; i++) {
           System.out.print(productos[i]+" "); 
       }
    













} 
}
