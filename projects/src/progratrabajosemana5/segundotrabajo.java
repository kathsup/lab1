
package progratrabajosemana5;

import java.util.Scanner;

public class segundotrabajo {
    public static void main(String[] args){
    
    
    
    int dia;
    Scanner entrada = new Scanner(System.in); 
    
        System.out.println("Ingrese el numero del día a elegir: ");
        System.out.print("1. Lunes\n2. Martes\n3. Miercoles\n4. Jueves\n5. Viernes\n6. Sabado\n7. Domingo\n8. Salir");
        dia = entrada.nextInt(); 
        
        
        while(dia != 8){
        
        if(dia==1 || dia==2 || dia== 3 || dia== 4 || dia==5){
        
            System.out.println("DIA LABORAL");
        }
        else{
        
            System.out.println("DIA NO LABORAL");
        }
        
        System.out.println("Ingrese el numero del día a elegir: ");
        System.out.println("1. Lunes\n2. Martes\n3. Miercoles\n4. Jueves\n5. Viernes\n6. Sabado\n7. Domingo\n8. Salir");
        dia = entrada.nextInt(); 
            System.out.println(" ");
            
        }
    
    }
}
