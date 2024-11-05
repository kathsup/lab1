//ejercicio1
package progratrabajosemana5;

import java.util.Scanner;

public class semana5 {
    public static void main(String[] args){
    
    int cantidadVentas; 
    double total; 
    Scanner entrada = new Scanner(System.in); 
    double suma = 0; 
    //ingresar cuantas veces va a moverse el ciclo 
    System.out.println("Ingresar numero de ventas: ");
    cantidadVentas = entrada.nextInt(); 
    
    //la cantidad que se repite y hacer la sumatoria 
    for (int i = 0; i < cantidadVentas; i++) {
    
        System.out.println("Ingrese el total de venta: "+(i+1));
        total = entrada.nextDouble(); 
        suma = suma+total; 
         
    }
        System.out.println("el total es: "+suma);
        
    
    
    
    
    
    }
}
