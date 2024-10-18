
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
   
    Scanner entrada = new Scanner(System.in);
    
        System.out.println("Ingrese a cuantos meses esta establecido su prestamo: ");
        meses = entrada.nextInt();
        
        System.out.println("Ingrese el interes mensual: ");
        interesmensual = entrada.nextDouble();
        
        System.out.println("Ingrese la comisión por cuota: ");
        comisioncuota = entrada.nextDouble();
        
        System.out.println("Ingresar porcentaje de seguro mensual: ");
        seguromensual = entrada.nextDouble();
        
        totalpagar = (meses*((interesmensual/100)+(comisioncuota/100)+(seguromensual/100)));
        cuotames = (totalpagar/meses);
    
    
    
        System.out.println("**** CUOTAS MENSUALES *******");
        System.out.println("Cuota de Pago Mensual: HNL "+cuotames);
        System.out.println("Total a Pagar: HNL"+ totalpagar);
    
    
    
    
    
    
    
    
    
    
    }
}
