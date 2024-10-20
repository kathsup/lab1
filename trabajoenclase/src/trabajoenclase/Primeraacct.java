package trabajoenclase;

import java.util.Scanner;

public class Primeraacct {
    public static void main(String[] args){
    
     Double fahrenheit;
     Scanner entrada = new Scanner (System.in);
     Double celcius; 
     
        System.out.println("Ingrese grados Fahrenheit: ");
        fahrenheit = entrada.nextDouble();
        
      celcius = (fahrenheit-32)*5/9;
      
        System.out.println(fahrenheit+ " grados fahrenreit a celcius es: "+ celcius+" grados celcius");
    
    
    
    
    
    
    }
    
}
