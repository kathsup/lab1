
package carvallo_katherine_formulas;

import java.util.Scanner;

public class carvallo_katherine_ejerciciob {
    public static void main(String[] args){
    
    double xdeno,xnomi,ynomi,resul;
    Scanner entrada = new Scanner(System.in);
            
    
    System.out.println("deominador a: ");
    xdeno = entrada.nextDouble();
    
    System.out.println("numerador a: ");
    xnomi = entrada.nextDouble();
    
    System.out.println("nominador b: ");
    ynomi = entrada.nextDouble();
    
    resul = (1/(xdeno-5))-((3*(xnomi*ynomi))/4);
    
        System.out.println("el resultado es: "+resul);
    
    
    
    
    
    }
}
