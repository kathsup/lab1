
package trabajosemana2;

import java.util.Scanner;

public class carvallo_katherine_variables {
    public static void main(String[] args){
    
    String nombreempleado;
    int horastrabajo;
    double tarifahora,salariosemanal;
    
    Scanner entrada = new Scanner(System.in);
    
        System.out.println("----- Boleta del Empleado -------");    
        System.out.println("Ingrese nombre completo: ");
        nombreempleado = entrada.nextLine();
        
        System.out.println("Ingrese horas laboradas en el mes: ");
        horastrabajo = entrada.nextInt();
       
        System.out.println("Ingrese tarifa por hora: ");
        tarifahora = entrada.nextDouble();
    
        salariosemanal = ((horastrabajo*tarifahora)/4);
    
    
        System.out.println("----- Boleta del Empleado -------");
        System.out.println("Nombre del Empleado: "+nombreempleado);
        System.out.println("Hora de Trabajo Mensual: "+horastrabajo);
        System.out.println("Tarifa por Hora : Lps."+tarifahora);
        System.out.println("Salario del Empleado Semanal: "+salariosemanal);
        
        
    
    
    
    }
}
