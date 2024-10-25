package trabajoenclase;

import java.util.Scanner;

public class cuartaact {
    public static void main(String[] args){
    
    int ganados,perdidos,empatados,puntajetotal;
    Scanner entrada = new Scanner (System.in);
        System.out.println("***Programa para calcular puntaje total***");
        System.out.println("Ingrese cantidad de partidos ganados: ");
        ganados = entrada.nextInt();
        
        System.out.println("Ingrese cantidad de partidos empatados: ");
        empatados = entrada.nextInt();
        
        System.out.println("Ingrese cantidad de partidos perdidos: ");
        perdidos = entrada.nextInt();
        
    puntajetotal = ((ganados*3)+(empatados*1)+(perdidos*0));
    
        System.out.println("El puntaje total del equipo es: " + puntajetotal);
    
    
    }
    
}
