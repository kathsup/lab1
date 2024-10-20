package trabajoenclase;

import java.util.Scanner;

public class segundaacct {
    public static void main(String[] args){
    
    float NP1;
    float NP2;
    float NP3; 
    float EF;
    float TF; 
    float Calificacionfinal;
   
    
    Scanner entrada = new Scanner (System.in);
        
   
        
        System.out.println("**Sistema de calificación final**");
        
        System.out.println("Ingresar nota final del primer parcial:" );
        NP1 = entrada.nextFloat();
        
        System.out.println("Ingresar nota final del segundo parcial:" );
        NP2 = entrada.nextFloat();
        
        System.out.println("Ingresar nota final del tercer parcial:" );
        NP3 = entrada.nextFloat();
        
        
        System.out.println("Ingrese la nota del examen final: ");
        EF = entrada.nextFloat();
        
        System.out.println("Ingrese nota de su trabajo final: ");
        TF = entrada.nextFloat();
        
        Calificacionfinal = (float) ((((NP1+NP2+NP3)/3)*0.55)+(EF*0.30)+(TF*0.15));
        
        System.out.println("Su calificación final es: "+Calificacionfinal);
        
        
    
    
    
    }
}
