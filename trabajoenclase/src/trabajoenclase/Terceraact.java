package trabajoenclase;

import java.util.Scanner;

public class Terceraact {
    public static void main(String[] args){
    
        float base,altura ;
        float perimetro,area;
    Scanner entrada = new Scanner (System.in);
    
        System.out.println("***Programa de perímetro y área de un rectángulo***");
        
        System.out.println("Ingrese la base del rectángulo: ");
        base = entrada.nextFloat();
       
        System.out.println("Ingrese la altura del rectángulo: ");
        altura = entrada.nextFloat();
        
        
        perimetro = (2*(altura+base));
        area = altura*base;
        
        System.out.println("El area del rectangulo es: "+ area);
        System.out.println("El perimetro del rectangulo es: "+ perimetro);
     
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
