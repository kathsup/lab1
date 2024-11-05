//ejercicio1
package progratrabajosemana5;

import java.util.Scanner;

public class semana5 {
    public static void main(String[] args){
    
    int cantidadVentas; 
    double total; 
    Scanner entrada = new Scanner(System.in); 
    double suma = 0; 
    
    System.out.println("Ingresar numero de ventas: ");
    cantidadVentas = entrada.nextInt(); 
    
    
    for (int i = 0; i < cantidadVentas; i++) {
    
        System.out.println("Ingrese el total de cada venta: ");
        total = entrada.nextDouble(); 
        suma = suma+total; 
        
        /*int [] total = new int [cantidadVentas]; 
        System.out.println(total);*/
    }
        System.out.println("el total es: "+suma);
        
    
    
    
    
    
    }
}
