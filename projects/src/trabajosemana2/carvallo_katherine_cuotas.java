
package trabajosemana2;

import java.util.Scanner;

public class carvallo_katherine_cuotas {
    public static void main(String[] args){
    
    
    double totalpagar;
    int meses;
    double interesmensual;
    double comisioncuota;
    double seguromensual;
    double cuotames;
    double cantidadprestamo;
   
    Scanner entrada = new Scanner(System.in);
    
        System.out.println("Ingrese a cuantos meses esta establecido su prestamo: ");
        meses = entrada.nextInt();
        
        System.out.println("Ingrese el interes mensual: ");
        interesmensual = entrada.nextDouble();
        
        System.out.println("Ingrese la cantidad de su prestamo: ");
        cantidadprestamo = entrada.nextDouble();
        
        System.out.println("Ingrese la comisión por cuota: ");
        comisioncuota = entrada.nextDouble();
        
        System.out.println("Ingresar porcentaje de seguro mensual: ");
        seguromensual = entrada.nextDouble();
        
        cuotames = cuotames = (cantidadprestamo / meses) 
                +(cantidadprestamo * interesmensual / 100) + 
                (cantidadprestamo * seguromensual / 100) + 
                       comisioncuota;
        totalpagar = (cuotames*meses);
    
    
    
        System.out.println("**** CUOTAS MENSUALES *******");
        System.out.println("Cuota de Pago Mensual: HNL "+cuotames);
        System.out.println("Total a Pagar: HNL"+ totalpagar);
    
    
    
    
    
    
    
    
    
    
    }
}
